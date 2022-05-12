package com.chainsys.classandmethods;

public class Ttwentyscoreboard {
private int currentScore;
	
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore += maxOvers;
	}
	private int runRate;
	public int getRunRate() {
		return runRate;
	}
	public void setRunRate(int runRate) {
		this.runRate = runRate;
	}
	public final int getTarget()
	{
		return target;
	}
	private int target;
	public final static int maxOvers=20;
	private int completed_overs;
	public Ttwentyscoreboard(int targetscore)
	{
		this.target=targetscore;
	}
	public int getCurrentRunRate()
	{
		return currentScore/completed_overs;
	}
	public int getRequiredRunRate()
	{
		int runstoscore=(target-currentScore);
		int oversremaining= (maxOvers - completed_overs);
		return runstoscore/oversremaining;
	}
	public int getCompleted_overs() {
		return completed_overs;
	}
	public void setCompleted_overs(int completed_overs) {
		this.completed_overs = completed_overs;
	}
}
