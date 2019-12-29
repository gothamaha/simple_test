package com.singtel.assignment.animal.bird.model;

import com.singtel.assignment.animal.bird.Bird;
import com.singtel.assignment.animal.utils.CommonBehaviours;

/*
 * Question A
 */
public class Chicken extends Bird {

	public Chicken()
	{
		System.out.println(" --- I am a "+this.getClass().getSimpleName());
		this.behaviour();
	}
	
	public void behaviour()
	{
		CommonBehaviours cmnBehaviour = new CommonBehaviours();
		cmnBehaviour.canSing(true, CommonBehaviours.sCHICKEN_SOUND);
		cmnBehaviour.canWalk(true);
	}
	
	@Override
	public boolean canFly(boolean isFlying)
	{
		isFlying = false;
		System.out.println("I am not flying ");
		return isFlying;
	}
}
