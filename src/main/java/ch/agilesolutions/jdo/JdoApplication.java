package ch.agilesolutions.jdo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ch.agilesolutions.jdo.domain.Car;
import ch.agilesolutions.jdo.domain.CarRepository;
import ch.agilesolutions.jdo.domain.Owner;
import ch.agilesolutions.jdo.domain.OwnerRepository;
import ch.agilesolutions.jdo.domain.User;
import ch.agilesolutions.jdo.domain.UserRepository;
import ch.agilesolutions.jdo.model.Domain;
import ch.agilesolutions.jdo.model.DomainRepository;
import ch.agilesolutions.jdo.model.Profile;
import ch.agilesolutions.jdo.model.ProfileRepository;

@SpringBootApplication
public class JdoApplication {
	@Autowired	
	private CarRepository carRepository;

	@Autowired	
	private OwnerRepository orepository;

	@Autowired	
	private UserRepository urepository;	

	@Autowired	
	private DomainRepository domainRepository;	

	@Autowired	
	private ProfileRepository profileRepository;	
	
	public static void main(String[] args) {
		SpringApplication.run(JdoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Domain domain1 = new Domain("crm", "crm applications");
			Domain domain2 = new Domain("erp", "erp applications");
			domainRepository.save(domain1);
			domainRepository.save(domain2);
			
			Profile profile1 = new Profile("crmfront", "host1", "crm front app", "uat", domain1);
			Profile profile2 = new Profile("crmback", "host2", "crm back app", "uat", domain1);
			profileRepository.save(profile1);
			profileRepository.save(profile2);
			
			
			
			
			Owner owner1 = new Owner("John" , "Johnson");
			Owner owner2 = new Owner("Mary" , "Robinson");
			orepository.save(owner1);
			orepository.save(owner2);
			
			carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, owner1));
			carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, owner2));
			carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, owner2));
			
			urepository.save(new User("user", "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi", "USER"));
			urepository.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", "ADMIN"));
		};
	}	
}
