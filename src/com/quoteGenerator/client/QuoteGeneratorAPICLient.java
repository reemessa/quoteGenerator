package com.quoteGenerator.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.quoteGenerator.enums.TVShowNameENum;

/**
 * 
 * @author Reem Issa
 * @class_name QuoteGeneratorAPICLient.java
 * @class_description
 * @create_date Aug 1, 2023
 * @last_Update Aug 1, 2023
 */
public class QuoteGeneratorAPICLient {

	public String getRandomQuote(TVShowNameENum tvShowNameENum) {

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(tvShowNameENum.getEndPoint()))
				.method("GET", HttpRequest.BodyPublishers.noBody()).build();

		HttpResponse<String> response = null;
		try {
			response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return response.body();
	}
}
