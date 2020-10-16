package fr.efrei.jpacar.model;


public class Van extends Vehicule{

    private float maxWeight;

    public Van(String plateNumber) {
        super(plateNumber);
    }

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }
}

