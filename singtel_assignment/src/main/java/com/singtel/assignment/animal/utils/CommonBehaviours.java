package com.singtel.assignment.animal.utils;

/*
 * Question A,B,D
 */
public class CommonBehaviours {
	
	public static final String sDUCK_SOUND = "Quack, quack";
	public static final String sCHICKEN_SOUND = "Cluck, cluck";
	public static final String sROOSTER_SOUND = "Cock-a-doodle-doo";
	public static final String sDOG_SOUND = "Woof, woof";
	public static final String sCAT_SOUND = "Meow";
	
	public static int iFlyCount;
	public static int iWalkCount;
	public static int iSingCount;
	public static int iSwimCount;
	
	
	public boolean canWalk(boolean isWalking)
	{
		iWalkCount = isWalking?iWalkCount+1:iWalkCount;
		System.out.println("I am walking - " + iWalkCount);
		return isWalking;
	}
	
	public boolean canSing(boolean isSinging, String sSound)
	{
		iSingCount = isSinging?iSingCount+1:iSingCount;
		System.out.println("I am singing - " + iSingCount);
		System.out.println("I sound - " + sSound);
		return isSinging;
	}
	
	public boolean canSwim(boolean isSwimming)
	{
		iSwimCount = isSwimming?iSwimCount+1:iSwimCount;
		System.out.println("I am swimming - " + iSwimCount);
		return isSwimming;
	}

	public static void clearCommonBehaviours()
	{
		iFlyCount=0;
		iWalkCount=0;
		iSingCount=0;
		iSwimCount=0;
	}

}
