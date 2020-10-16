package fr.efrei.jpacar.model;

public class Car extends Vehicule{
	
	private int numberOfSeats;

    public Car(String plateNumber) {
        super(plateNumber);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}

