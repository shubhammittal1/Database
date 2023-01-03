package MongoDB.Database;

import MongoDB.Database.collection.Address;
import MongoDB.Database.collection.Details;
import MongoDB.Database.repository.DetailsRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(DetailsRepo detailsRepo){
		return args->{
			Address address=new Address(
					"Russia",
					"Finopian",
					"Tagrion",
					"409667"
			);
			Details details=new Details(
					"kithopili",
					"hilasiop",
					9876660099L,
					address
			);
			detailsRepo.insert(details);
		};
	}
}
