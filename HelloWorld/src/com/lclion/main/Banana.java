package com.lclion.main;

public class Banana
{
	private boolean isPeeled = false;
	
	public Banana()
	{
		System.out.println("Bananas are delicious!");
	}
	
	public void peelBanana()
	{
		isPeeled = true;
		System.out.println("Banana: I'm cold and naked!");
	}
}
