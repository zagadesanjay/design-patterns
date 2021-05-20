package com.sz.solid;

import java.util.ArrayList;
import java.util.List;

public class LVehicle {

	public void startEngine() throws EngineNotFoundException {

	}

}

class Car extends LVehicle {

	@Override
	public void startEngine() {
	}

}


class Bicycle extends LVehicle {

	@Override
	public void startEngine() throws EngineNotFoundException {
		throw new EngineNotFoundException("Engine Missing..");
	}
	
}

class VehicleMonitor {
	
	public void startVehicles() throws EngineNotFoundException {
		List<LVehicle> list = new ArrayList<LVehicle>();
		
		LVehicle car = new LVehicle();
		LVehicle bicycle = new Bicycle();
		
		list.add(car);
		list.add(bicycle);
		
		for(LVehicle vehicle : list)
			vehicle.startEngine();
		
		// While iterating the vehicles bicycle will throw exception
		// Objects of such vehicle should treat separately 
		// for that this client class must have knowledge of all derived classes of the Vehicle 
		// This code becomes tightly coupled 
		// This violets Liskov Substitution
		
	}
	
	// Solution
	// Vehicle  --> VehicleWithEngine  VehicleWithoutEngine
	
}



