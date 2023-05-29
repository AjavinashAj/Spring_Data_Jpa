package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class DataJpaApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DataJpaApp1Application.class, args);
		
		StudentRepository studentRepo=context.getBean(StudentRepository.class);
		//System.out.println(studentRepository.getClass().getName());
		
		 //for insert data in the table
		Student s=new Student();
		s.setId(103);
		s.setName("Alpha");
		s.setRank((long) 1123);
		s.setGender("M");
		studentRepo.save(s);
		System.out.println("Record inserted....");
		
		/*
		 //for display single row on console
		Optional<Student>optional=studentRepo.findById(101);//for display data on console,return type of findById() method is Optional
		if(optional.isPresent())
		{
			System.out.println(optional.get());
		}
		*/
		//for display multiple data on the console
		/*
		Iterable<Student> findAll=studentRepo.findAll();
		findAll.forEach(s->System.out.println(s));
		*/
		//for delete particular row/record
		
		//studentRepo.deleteById(105);
		//System.out.println("Record deleted successfully...");
		
		//incase if trying to delete those record whic are not exist in data base then it give RE:record not exit
		/*
		if(studentRepo.existsById(105))
		{
			studentRepo.deleteById(105);
			System.out.println("Record deleted successfully...");
			
		}
		else
		{
			System.out.println("no record available...");
		}
		*/
		//for count how many record in table
		//long count=studentRepo.count();
		//System.out.println("Records Count::"+count);
	}

}
