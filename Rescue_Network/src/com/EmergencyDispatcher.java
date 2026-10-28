package com;

public class EmergencyDispatcher {
	void dispatch(IRescueUnit unit , String location) {
		unit.respondToEmergency(location);
	}
}
