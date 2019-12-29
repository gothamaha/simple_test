package com.singtel.assignment.animal.fish;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.utils.CommonBehaviours;

/*
 * Question B
 */
public class Fish extends Animal{
	
	public Fish()
	{
		System.out.println(" --- I am a "+this.getClass().getSimpleName());
		this.behaviour();
	}
	
	public void behaviour()
	{
		CommonBehaviours cmnBehaviour = new CommonBehaviours();
		cmnBehaviour.canSwim(true);
	}
	
	@Override
	public boolean canWalk(boolean isWalking)
	{
		isWalking = false;
		System.out.println("I am walking");
		return isWalking;
	}
	
  
}
