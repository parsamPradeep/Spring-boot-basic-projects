package pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import pet.controllers.OwnerController;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.springboot.pet.services",
		"pet.controllers"},
		basePackageClasses = OwnerController.class)
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}

}
