package in.ashokit;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import in.ashokit.entity.School;
import in.ashokit.repository.SchoolRepository;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SchoolApplication.class, args);
		SchoolRepository schoolRepo=context.getBean(SchoolRepository.class);
		School s= new School();
		s.setId(1);
		s.setName("DPS");
		s.setAddr("delhi");
		s.setActiveSw("N");
        schoolRepo.save(s);
        
        Iterable<School> sc=schoolRepo.findAll();
        System.out.println(sc);
        Optional<School>sc1=schoolRepo.findById(1);
        System.out.println(sc1);

	}

}
