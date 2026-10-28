package com;
/**
 * am Interface with method which is important for the rescue function
 * Every single method here is public and abstract so that it 
 * can be implemented in the child classes
 * 
 * @author AMAN
 */
public interface IRescueUnit {
	void respondToEmergency(String location);
	void returnToBase();
	String getUnitStatus();
}
