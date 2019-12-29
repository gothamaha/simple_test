package com.singtel.assignment.animal.bird.model;

import com.singtel.assignment.animal.bird.Bird;
import com.singtel.assignment.animal.utils.CommonBehaviours;

/*
 * Question A
 */
public class Duck extends Bird{

	public Duck()
	{
		System.out.println(" --- I am a "+this.getClass().getSimpleName());
		this.behaviour();
	}
	
	public void behaviour()
	{
		CommonBehaviours cmnBehaviour = new CommonBehaviours();
		cmnBehaviour.canSwim(true);
		cmnBehaviour.canSing(true, CommonBehaviours.sDUCK_SOUND);
		cmnBehaviour.canWalk(true);
	}
}
