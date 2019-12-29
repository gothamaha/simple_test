package com.singtel.assignment.animal.fish;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.utils.CommonBehaviours;

/*
 * Question B
 */
public class Dolphin extends Animal{

	public Dolphin()
	{
		System.out.println(" --- I am a "+this.getClass().getSimpleName());
		this.behaviour();
	}
	
	public void behaviour()
	{
		CommonBehaviours cmnBehaviour = new CommonBehaviours();
		cmnBehaviour.canSwim(true);
	}
}
