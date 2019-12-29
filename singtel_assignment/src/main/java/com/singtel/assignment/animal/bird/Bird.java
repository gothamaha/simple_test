
package com.singtel.assignment.animal.bird;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.utils.CommonBehaviours;

/*
 * Question A
 */
public class Bird extends Animal{

	public Bird()
	{
		System.out.println(" --- I am a "+this.getClass().getSimpleName());
		this.canFly(true);
	}
	
	public boolean canFly(boolean isFlying)
	{
		CommonBehaviours.iFlyCount = isFlying?CommonBehaviours.iFlyCount+1:CommonBehaviours.iFlyCount;
		System.out.println("I am flying - " + CommonBehaviours.iFlyCount);
		return isFlying;
	}
	
}
