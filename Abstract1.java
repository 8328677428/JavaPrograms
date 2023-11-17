package com.java.abstractconcept;

abstract class Draw {
	abstract public void draw(); // abstract

	public void personName() {
		System.out.println("Drawn by Praveen");
	}
}

class Square extends Draw {

	@Override
	public void draw() {
		System.out.println("Sqaure");
	}

	public void personName() {
		System.out.println("Drawn by Swetha");
	}
}

class Circle extends Draw {

	@Override
	public void draw() {
		System.out.println("Circle");
	}

	public void personName() {
		System.out.println("Drawn by Naveen");
	}

}

class Rectangle extends Draw {

	@Override
	public void draw() {
		System.out.println("Rectangle");
	}

	public void personName() {
		System.out.println("Drawn by Ramesh");
	}
}

public class Abstract1 {

	public static void main(String[] args) {
		Square square = new Square();
		square.draw();
		square.personName();
		System.out.println("**********************************");
		Circle circle = new Circle();
		circle.draw();
		circle.personName();
		System.out.println("**************************************");
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		rectangle.personName();
	}

}
