package com.java.abstractconcept;

// 0 to 100 % ==> 50 % abstract
abstract class Vechile {
	abstract public void run(); // abstract method

	public void drive() { // concretate method
		System.out.println("Vechile is driving");
	}
}

class Bike extends Vechile {

	@Override
	public void run() {
		System.out.println("Bike is running");
	}

	public void drive() {
		System.out.println("Bike is driving");
	}

}

class Car extends Vechile {

	@Override
	public void run() {
		System.out.println("Car is runing");
	}

	public void drive() {
		System.out.println("Car is driving");
	}

}

class Bus extends Vechile {

	@Override
	public void run() {
		System.out.println("Bus is running");
	}

	public void drive() {
		System.out.println("Bus is driving");
	}
}

public class Abstarct {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.run();
		bike.drive();

		Car car = new Car();
		car.run();
		car.drive();

		Bus bus = new Bus();
		bus.run();
		bus.drive();

	}

}
