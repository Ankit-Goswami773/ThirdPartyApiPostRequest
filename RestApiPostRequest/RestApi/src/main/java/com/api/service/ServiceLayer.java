package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.bank.dto.BankDto;
import com.api.bank.dto.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class ServiceLayer {

	private final RestTemplate restTemplate;

	@Autowired
	public ServiceLayer(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public Data consumeAPi() {
		String jsonString = restTemplate.getForObject("http://41.73.252.228:9191/GenericWaveTest/Proxy/vi/FetchBanks",
				String.class);
		Map<String, String> bankMap = null;
		Data data = new Data();
		ResponseEntity<String> responseEntity = restTemplate
				.getForEntity("http://41.73.252.228:9191/GenericWaveTest/Proxy/vi/FetchBanks", String.class);
		data.setStatus(responseEntity.getStatusCode().toString());
		int code = responseEntity.getStatusCodeValue();
		data.setCode(String.valueOf(code));
		if (code == 200) {
			data.setStatus("success");
		} else {
			data.setStatus("false");
		}
		List<BankDto> bankList = new ArrayList<BankDto>();
		try {
			ObjectMapper mapper = new ObjectMapper();
			bankMap = mapper.readValue(jsonString, Map.class);
			for (Map.Entry<String, String> entry : bankMap.entrySet()) {
				BankDto bankDetails = new BankDto();
				bankDetails.setBankname(entry.getKey());
				bankDetails.setBankcode(entry.getValue());
				bankList.add(bankDetails);
				data.setData(bankList);
			}
			return data;

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}

	
	
}
