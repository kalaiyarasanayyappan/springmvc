package com.chainsys.unittest;

import com.chainsys.classandmethods.Ttwentyscoreboard;

public class Testscoreboard {
	public static void testRCBMatch()
	{
		Ttwentyscoreboard sb= new Ttwentyscoreboard(129);
		System.out.println("Target : "+sb.getTarget());
		System.out.println("Max Overs : "+Ttwentyscoreboard.maxOvers);
		sb.setCurrentScore(86);
		sb.setCompleted_overs(10);
		System.out.println("CurrentScore is : "+sb.getCurrentScore());
		System.out.println("Overs Completed : "+sb.getCompleted_overs());
		System.out.println("CureentRR :"+sb.getCurrentRunRate());
		System.out.println("RequiredRR : "+sb.getRequiredRunRate());
		
	}
}
