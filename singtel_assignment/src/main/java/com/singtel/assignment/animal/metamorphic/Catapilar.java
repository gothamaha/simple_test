package com.singtel.assignment.animal.metamorphic;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.utils.CommonBehaviours;

/*
 * Question D
 */
public class Catapilar extends Animal{
    
	public Catapilar()
	{
		System.out.println(" --- I am a "+this.getClass().getSimpleName());
		this.behaviour();
	}
	
	public void behaviour()
	{
		CommonBehaviours cmnBehaviour = new CommonBehaviours();
		cmnBehaviour.canWalk(true);
	}
}
