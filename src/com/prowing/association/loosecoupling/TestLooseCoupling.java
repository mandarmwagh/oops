package com.prowing.association.loosecoupling;

public class TestLooseCoupling {

	public static void main(String[] args) {

//		Car car = new Car();
//		
//		Bus bus = new Bus();
//		
//		Helicopter helicopter = new Helicopter();

		Vehicle vehicle = new Car();

		Traveller traveller = new Traveller(vehicle);

		traveller.startJourney();

	}

}