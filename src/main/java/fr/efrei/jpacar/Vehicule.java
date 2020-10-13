package fr.efrei.jpacar;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Vehicule implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Id
    private String plateNumber;

    public Vehicule() {
        super();
    }

    public Vehicule(String plateNumber) {
        super();
        this.plateNumber=plateNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String toString() {
        return "Vehicule : " + id + ", plate number : " + plateNumber;
    }
}
