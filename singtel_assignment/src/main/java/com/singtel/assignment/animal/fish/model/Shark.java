package com.singtel.assignment.animal.fish.model;

import com.singtel.assignment.animal.fish.Fish;

/*
 * Question B
 */
public class Shark extends Fish {
	
	private String sColor;
	private String sSize;
	
	public Shark()
	{
		System.out.println(" --- I am a "+this.getClass().getSimpleName());
		this.sColor = "grey";
		this.sSize = "large";
		eat("other");
	}
	
    public String getColor() {
		return sColor;
	}
    
	public String getSize() {
		return sSize;
	}

    public void eat(String sFishTypes){
        System.out.println("sharks eat "+ sFishTypes + "fish");
    }
}
