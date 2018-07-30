package oop_practice;

public class Motobike extends Bike {
	private int power;

	public Motobike() {
		System.out.println("I love motobike");

	}

	public Motobike(int power) {
		super();
		this.power = power;
	}

	public Motobike(int power, String color, String size) {
		super(color, size);
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String bikeInfo() {
		return "Car has " + getColor() + " color and " + getSize() + " size " + " and " + power + " power";
	}

	public int price() {
		return 100;
	}

}
