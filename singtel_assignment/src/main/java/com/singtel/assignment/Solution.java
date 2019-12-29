package com.singtel.assignment;


import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.bird.model.Chicken;
import com.singtel.assignment.animal.bird.model.Duck;
import com.singtel.assignment.animal.bird.model.Rooster;
import com.singtel.assignment.animal.bird.model.parrot.service.impl.ParrotImpl;
import com.singtel.assignment.animal.fish.Dolphin;
import com.singtel.assignment.animal.fish.model.ClownFish;
import com.singtel.assignment.animal.fish.model.Shark;
import com.singtel.assignment.animal.metamorphic.Butterfly;
import com.singtel.assignment.animal.metamorphic.Catapilar;
import com.singtel.assignment.animal.utils.CommonBehaviours;

/*
 * Question E
 */
public class Solution 
{
    public static void main( String[] args )
    {
        
        Animal[] animals = new Animal[]
        		{
        			new Duck(), 
        			new Chicken(), 
        			new Rooster(), 
        			new ParrotImpl(), 
        			new Shark(), 
        			new ClownFish(), 
        			new Dolphin(), 
        			new Catapilar(), 
        			new Butterfly()
        		};
        
        System.out.println("Total flying count\t - " + CommonBehaviours.iFlyCount);
        System.out.println("Total walking count\t - " + CommonBehaviours.iWalkCount);
        System.out.println("Total singing count\t - " + CommonBehaviours.iSingCount);
        System.out.println("Total swimming count\t - " + CommonBehaviours.iSwimCount);
        
        CommonBehaviours.clearCommonBehaviours();
        
    }
    
//    public static int counter(String sClassName, String sMethod)
//    {
//    	Class<?> tableClass;
//    	try {
//
//			tableClass = Class.forName(sClassName);
//		
//    		System.out.println("Initiated Refelection Class  ================= " + sClassName);
//
//    		Method method;
//			
//				method = tableClass.getMethod(sMethod, new Class[]
//						{
//								Boolean.class
//						});
//			
//    		System.out.println("Initiated Refelection Method  ================= " + sMethod);
//
//			method.invoke(true);
//							
//    		System.out.println("Invoked Refelection Method  ================= " + sMethod);
//
//    	} catch (ClassNotFoundException |NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//    		System.out.println(e.getMessage());
//    		e.printStackTrace();
//    	}
//    }
    
}
