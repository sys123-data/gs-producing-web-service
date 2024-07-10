package com.example.producingwebservice;

import jakarta.el.MethodNotFoundException;
import jakarta.xml.bind.DatatypeConverter;
import jakarta.xml.soap.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private CountryRepository countryRepository;

	@Autowired
	public CountryEndpoint(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) throws DatatypeConfigurationException, SOAPException {
		GetCountryResponse response = new GetCountryResponse();

		if (request.getName().equals("Romania"))
			throw new MethodNotFoundException("Failed to locate method (ValidateCreditCard) in class (examplesCreditCard)");


		// Set default values for other countries
		response.setCountry(countryRepository.findCountry(request.getName()));


		return response;
		}






}
