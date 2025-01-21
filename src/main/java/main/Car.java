package main;

class Car {
	String brand;
	String model;
	private int speed;

	Car() {
		brand = "";
		model = "";
		speed = 0;
	}

	int get_speed() {
		return speed;
	}

	void accelerate(int delta) {
		if (delta < 0) {
			throw new IllegalArgumentException("Nopeuden täytyy olla positiivinen luku.");
		}

		speed += delta;
	}

	void deaccel(int delta) {
		if (delta < 0) {
			throw new IllegalArgumentException("Nopeuden täytyy olla positiivinen luku.");
		}

		speed = Math.max(0, speed - delta);
	}

}
