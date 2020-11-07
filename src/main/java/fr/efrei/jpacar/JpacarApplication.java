package fr.efrei.jpacar;

import fr.efrei.jpacar.model.Vehicule;
import fr.efrei.jpacar.repository.VehiculeRepository;
import fr.efrei.jpacar.service.VehiculeService;
import fr.efrei.jpacar.web.VehiculeWebService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpacarApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpacarApplication.class, args);
	}

}
