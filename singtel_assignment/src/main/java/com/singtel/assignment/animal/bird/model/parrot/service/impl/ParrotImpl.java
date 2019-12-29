package com.singtel.assignment.animal.bird.model.parrot.service.impl;

/*
 * Question A
 */
import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.bird.model.parrot.models.ParrotWithCat;
import com.singtel.assignment.animal.bird.model.parrot.models.ParrotWithDog;
import com.singtel.assignment.animal.bird.model.parrot.models.ParrotWithRooster;
import com.singtel.assignment.animal.bird.model.parrot.service.Parrot;
import com.singtel.assignment.animal.utils.CommonBehaviours;

public class ParrotImpl extends Animal {

	
	public ParrotImpl() {
		this.getParrot();
	}
	/*
	 * from Java 8 this can be simplified with Lambda expressions
	 * but might have slight effects on code maintainability
	 * 
	 * Reflection can be used but will affect the performance
	 */
	public void getParrot()
	{
		Parrot parrot;
		parrot = new ParrotWithDog();
		parrot.behaviour(true, CommonBehaviours.sDOG_SOUND);
		
		parrot = new ParrotWithCat();
		parrot.behaviour(true, CommonBehaviours.sCAT_SOUND);
		
		parrot = new ParrotWithRooster();
		parrot.behaviour(true, CommonBehaviours.sROOSTER_SOUND);
	
	
	}
	
}
