package com.singtel.assignment.animal.utils;

import java.util.Locale;
import java.util.ResourceBundle;

/*
 * Bonus
 */
public class Localization {
	
	public static void display (String language)
	{
		Locale locale = new Locale(language);
		ResourceBundle resourceBundle = ResourceBundle.getBundle("resources.language", locale);
		System.out.println("I sound in "+ language+ " - "+resourceBundle.getString(language));
	}

}
