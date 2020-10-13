package fr.efrei.jpacar;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehiculeRepository extends CrudRepository {

    List<Vehicule> findByName(String plateNumber);
}
