package com.ss.onetoone;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RootTest {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://52.66.191.117/response");
			List<Root> apis = Arrays.asList(new ObjectMapper().readValue(url, Root[].class));
			System.out.println(apis.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
