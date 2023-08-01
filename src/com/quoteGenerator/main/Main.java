package com.quoteGenerator.main;

import java.util.Scanner;

import com.quoteGenerator.client.QuoteGeneratorAPICLient;
import com.quoteGenerator.enums.TVShowNameENum;
import com.quoteGenerator.json.StaticMessages;

/**
 * 
 * @author Reem Issa
 * @class_name Main.java
 * @class_description
 * @create_date Aug 1, 2023
 * @last_Update Aug 1, 2023
 */
public class Main {

	private static QuoteGeneratorAPICLient quoteGeneratorAPICLient;

	public static void main(String[] args) {
		
		getRandomQuote();

	}

	private static void getRandomQuote() {
		
		System.out.println(StaticMessages.WELCOME_MSG);
		System.out.println(StaticMessages.WELCOME_MSG_SPACE);

		Scanner input = new Scanner(System.in);
		String choice = input.next();

		int intValue = Integer.parseInt(choice);

		TVShowNameENum tvShow = TVShowNameENum.fromValue(intValue);

		quoteGeneratorAPICLient = new QuoteGeneratorAPICLient();
		String quote = quoteGeneratorAPICLient.getRandomQuote(tvShow);
		System.out.println(quote);
	}

}
