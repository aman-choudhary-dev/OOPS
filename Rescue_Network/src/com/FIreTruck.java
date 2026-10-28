package com;

public class FIreTruck implements IRescueUnit {
	private int waterCapacity ;
	private boolean isAvailable;

	public FIreTruck(int waterCapacity, boolean isAvailable) {
		super();
		this.waterCapacity = waterCapacity;
		this.isAvailable = isAvailable;
	}

	@Override
	public void respondToEmergency(String location) {
		if (isAvailable && waterCapacity > 0) {
			System.out.println("This Fire Truck is Dispatching to :->" + location);
			isAvailable = false;
		} else {
			System.err.println("This Fire Truck is not availble for dispatch");
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
		// TODO Auto-generated method stub
		return null;
	}

}
