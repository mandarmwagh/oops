package com.prowing.association.loosecoupling;

public class Traveller {

//	Car car;

//	Bus bus;

//	Helicopter helicopter;

	Vehicle vehicle;

	public Traveller() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Traveller(Bus bus) {
//		super();
//		this.bus = bus;
//	}

//	public Traveller(Helicopter helicopter) {
//		super();
//		this.helicopter = helicopter;
//	}

	public Traveller(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public void startJourney() {
//		bus.start();
//		helicopter.start();
		vehicle.start();
		System.out.println("Journey started!!!");
	}

}