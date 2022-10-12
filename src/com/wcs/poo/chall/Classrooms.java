package com.wcs.poo.chall;

public class Classrooms {

	public static void main(String[] args) {

		Wilders jean = new Wilders("Jean", false);
		
		Wilders mathilde = new Wilders("Mathilde", true);
		
		Wilders gregoire = new Wilders("Gregoire", true);
		
		Wilders jessica = new Wilders("Jessica", false);
		
		System.out.println(jean.whoAmI());
		
		System.out.println(mathilde.whoAmI());
		
		System.out.println(gregoire.whoAmI());
		
		System.out.println(jessica.whoAmI());
	}

}
