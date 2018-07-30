package oop_practice;

public class Bike {
	private String color;
	private String size;

	public Bike() {
		System.out.println("I love bike");

	}

	public Bike(String color, String size) {
		super();
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String bikeInfo() {
		return "Car has " + color + " color and " + size + " size";
	}

	public int price() {
		return 0;

	};

}
