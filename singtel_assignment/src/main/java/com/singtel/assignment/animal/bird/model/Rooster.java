package com.singtel.assignment.animal.bird.model;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.utils.CommonBehaviours;
import com.singtel.assignment.animal.utils.Localization;

/*
 * Question A
 */
public class Rooster extends Animal{

	public Rooster()
	{
		System.out.println(" --- I am a "+this.getClass().getSimpleName());
		this.behaviour();
	}
	
	public void behaviour()
	{
		CommonBehaviours cmnBehaviour = new CommonBehaviours();
		cmnBehaviour.canSing(true, CommonBehaviours.sROOSTER_SOUND);
		Localization.display("Danish");
		cmnBehaviour.canWalk(true);
	}
//	
//	public void canFly()
//	{
//		Chicken chicken = new Chicken();
//		chicken.canFly(false);
//		System.out.println(this.getClass().getSimpleName()+" - I am flying" + CommonBehaviours.iFlyCount);
//	}
}
