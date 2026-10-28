package com;

public class RescueDrone implements IRescueUnit , IRechargeable{
	private boolean isAvailable = true;
	private int batteryPercent;
	
	public RescueDrone(boolean isAvailable, int batteryPercent) {
		super();
		this.isAvailable = isAvailable;
		this.batteryPercent = batteryPercent;
	}

	@Override
	public void recharge() {
		batteryPercent = 100;
		System.out.println("Battery Recharged");
	}

	@Override
	public void respondToEmergency(String location) {
		if(isAvailable && batteryPercent > 20) {
			System.out.println("This Rescue Drone is Dispatching to :->"  + location);			
			isAvailable = false;
		}else {
			System.err.println("This Rescue Drone is not availble for dispatch");
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
