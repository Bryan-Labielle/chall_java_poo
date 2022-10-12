package com.wcs.poo.chall;

public class Wilders {
	
	private String firstName;
	
	private boolean aware;
	
	public Wilders (String firstName, boolean aware) {
		
		this.firstName = firstName;
		this.aware = aware;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public boolean isAware() {
		return this.aware;
	}
	public void setIsAware(boolean aware) {
		this.aware = aware;
	}
	
	public String whoAmI() {
		
		if (!this.aware){
			return "Je m'apelle " + this.getFirstName() + " et je suis aware";
		}
		return "je m'apelle " + this.getFirstName() + "je ne suis pas aware";
		
	}
}
