package oop_practice;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bike bike = new Bike("Red", "Big");
		Bike moto = new Motobike(100);
		// Motobike m = (Motobike) new Bike("Red", "Big");

		// System.out.println(bike.bikeInfo());
		// System.out.println(moto.bikeInfo());
		// System.out.println(m.bikeInfo());
		System.out.println(moto.price());

	}

}
