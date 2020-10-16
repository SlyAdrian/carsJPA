package fr.efrei.jpacar;

import fr.efrei.jpacar.model.Vehicule;
import fr.efrei.jpacar.repository.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpacarApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpacarApplication.class, args);
	}

	// This is a starting demo
	public CommandLineRunner demo(VehiculeRepository repository) {
		return (args) ->{
			Vehicule car_A = new Vehicule("85-GHB-74");
			repository.save(car_A);

			System.out.println("--------------------");
			System.out.println("Vehicules found with findAll() : ");
			for(Object v : repository.findAll()) {
				System.out.println(v.toString());
			}
		};
	}

}
