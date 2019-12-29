package com.singtel.assignment.animal.bird.model.parrot.models;

import com.singtel.assignment.animal.bird.Bird;
import com.singtel.assignment.animal.bird.model.parrot.service.Parrot;
import com.singtel.assignment.animal.utils.CommonBehaviours;

/*
 * Question A
 */
public class ParrotWithDog extends Bird implements Parrot{

	public void behaviour (boolean isSinging, String sSound)
	{
		System.out.println(" --- I am a "+this.getClass().getSimpleName());
		CommonBehaviours cmnBehaviour = new CommonBehaviours();
	    cmnBehaviour.canSing(isSinging, sSound);
		cmnBehaviour.canWalk(true);
	}
}
