package fr.efrei.jpacar.repository;

import fr.efrei.jpacar.model.Vehicule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {

    List<Vehicule> findByPlateNumber(String plateNumber);
}
