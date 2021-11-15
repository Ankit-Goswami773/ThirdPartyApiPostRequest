package com.api.controller;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api.bank.dto.Data;
import com.api.model.PayloadDto;
import com.api.model.PaymentResult;
import com.api.model.Response;
import com.api.service.ServiceLayer;
import com.api.util.AppConstants;
import com.api.util.ApplicationProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class ControllerClass {
	@Autowired
	private AppConstants appConstants;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ApplicationProperties applicationproperty;
	@Autowired
	private ServiceLayer servicelayer;

	@GetMapping("/bank")
	public Data getBankApi() {
		return servicelayer.consumeAPi();
	}

	@PostMapping("/transaction")
	public ResponseEntity<Object> addTransaction(@RequestBody PayloadDto payloadDto)
			throws URISyntaxException, JsonProcessingException {
		System.out.println("Data Method call and i got this response ->>> " + payloadDto.toString());
		System.out.println(payloadDto.getPayload().getPacket().get(0).getMSISDN());
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("content-type", "application/json");
		ObjectMapper mapper = new ObjectMapper();
		// Converting the Object to JSONString
		String jsonString = mapper.writeValueAsString(payloadDto);
		HttpEntity<String> http = new HttpEntity<>(jsonString, headers);
		System.out.println("Calling to rest response and payload is  " + jsonString);
		String restResponse = restTemplate.postForObject(applicationproperty.getChargerUrl(), http, String.class);
		if (!restResponse.isEmpty() && restResponse != null) {
			Response response = mapper.readValue(restResponse, Response.class);
			int statusCode = response.getResults().get(0).getStatusCode();

			System.out.println(response);
			System.out.println(statusCode);
			if (statusCode == 176) {
				int iChargeRequestUUID = response.getResults().get(0).getChargeRequestID();

				System.out.println(iChargeRequestUUID);
				Map<String, Object> params = new HashMap<String, Object>();
				params.put("bankcode", payloadDto.getPayload().getPacket().get(0).getExtraData().getBankCode());
				params.put("terminalId", AppConstants.TERMINAL_ID);
				params.put("merchantId", AppConstants.MERCHANT_ID);
				params.put("amount", payloadDto.getPayload().getPacket().get(0).getAmount());
				params.put("submerchantName", AppConstants.SUBMERCHANT_NAME);
				params.put("traceId", iChargeRequestUUID);

				ResponseEntity<String> paymentResult = restTemplate
						.postForEntity(applicationproperty.getInvokeUssdReference(), params, String.class);
				System.out.println(paymentResult);
				return new ResponseEntity<>(paymentResult, HttpStatus.OK);
			}

			return new ResponseEntity<>(response, HttpStatus.OK);

		}

		return null;
	}
}
