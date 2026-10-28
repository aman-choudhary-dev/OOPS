package com;

public class Ambulance implements IRescueUnit{
	private int pateintCapacity ;
	private boolean isAvailable = true;

	public Ambulance(int pateintCapacity , boolean isAvailable) {
		super();
		this.pateintCapacity = pateintCapacity;
		this.isAvailable = isAvailable;
	}
	@Override
	public void respondToEmergency(String location) {
		if(isAvailable) {
			System.out.println("This Ambulance is Dispatching to :->"  + location);
			isAvailable = false;
		}else {
			System.err.println("This Ambulance is not availble for dispatch");
		}
	}

	@Override
	public void returnToBase() {
		if(!isAvailable) {
			isAvailable = true;
			System.out.println("Returned to the base");
		}else {
			System.err.println("Its Already in the base");
		}
	}


	@Override
	public String getUnitStatus() {
		if(isAvailable) {
			System.out.println("This unit is availble for the dispatch");
		}
		return "Unavailable Unit";
	}
}
