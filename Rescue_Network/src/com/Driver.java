package com;

public class Driver {
	public static void main(String[] args) {
		EmergencyDispatcher emergencyDispatcher = new EmergencyDispatcher();
		IRescueUnit unit1 = new Ambulance(2, true);
		emergencyDispatcher.dispatch(unit1, "delhi");
		System.out.println(unit1.getUnitStatus());;
		unit1.returnToBase();
		emergencyDispatcher.dispatch(new Ambulance(4, true), "Bangalore");
		emergencyDispatcher.dispatch(new RescueDrone(true, 50), "Marathali");
		emergencyDispatcher.dispatch(new RescueDrone(true, 10), "Marathali");
		emergencyDispatcher.dispatch(new FIreTruck(1000, true), "BTM");
	}
}
