package com.singtel.assignment.animal.fish.model;

import com.singtel.assignment.animal.fish.Fish;

/*
 * Question B
 */
public class ClownFish extends Fish {

	private String sColor;
	private String sSize;

	public ClownFish()
	{
		System.out.println(" --- I am a "+this.getClass().getSimpleName());
		this.sColor = "orange";
		this.sSize = "small";
		makeJokes();
	}

	public String getColor() {
		return sColor;
	}

	public String getSize() {
		return sSize;
	}

	public boolean makeJokes(){
		System.out.println("Clown fish makes jokes");
		return true;
	}

}
