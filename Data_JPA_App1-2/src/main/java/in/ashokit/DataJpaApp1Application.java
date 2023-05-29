package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Product;
import in.ashokit.entity.Student;
import in.ashokit.repository.ProductRepository;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class DataJpaApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DataJpaApp1Application.class, args);
	//===================================Student Entity====================================	
		StudentRepository studentRepo=context.getBean(StudentRepository.class);
		//System.out.println(studentRepository.getClass().getName());
		/*
		 //for insert data in the table
		Student s=new Student();
		s.setId(103);
		s.setName("Alpha");
		s.setRank((long) 1123);
		s.setGender("M");
		studentRepo.save(s);
		System.out.println("Record inserted....");
		*/
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
		/*
		//for multiple insertion
		Student st=new Student(122,"lambda",(long) 1234,"M");
		Student st1=new Student(123,"delta",(long) 1235,"f");
		Student st2=new Student(126,"lambda",(long) 12345,"M");
		Student st3=new Student(125,"lambda",(long) 123456,"M");
		List<Student> student=Arrays.asList(st,st1,st2,st3);
		studentRepo.saveAll(student);
		*/
		
		
		//find by gender using abstract method which is created in  StudentRepository file
		//List<Student>maleStu=studentRepo.findByGender("M");
		//maleStu.forEach(System.out::println);
		
		
		//find by rank using abstract method which is defined in StudentRepository file
		//List<Student> stu=studentRepo.findByRankGreaterThanEqual(1300);
		//stu.forEach((s)->System.out.println(s));
		
		//List<Student>stu=studentRepo.findByGenderAndRankGreaterThanEqual("M", (long) 1000);
		//stu.forEach((s)->System.out.println(s));
		
		//custom query
		//List<Student> stu=studentRepo.getAllStudents();
		//List<Student> stu=studentRepo.getStudents();
		 // List<Student> stu=studentRepo.getGender("f");
		//List<Student> stu=studentRepo.getGenderNull();
		//List<Student> stu=studentRepo.getRankGreaterAndEqual();
		//List<Student> stu=studentRepo.getRankSmallerAndEqual();
		//List<Student> stu=studentRepo.getRankGender();
		//List<Student> stu=studentRepo.getRG();
		
		//stu.forEach(System.out::println);	
		
		//paging And Sorting..
		
		//List<Student>students=studentRepo.findAll(Sort.by("name").descending());
		//students.forEach(System.out::println);
		
		
		//QueryByExample
		
		//Student s=new Student();
		//s.setGender("M");
		//Example<Student> example=Example.of(s);
		//List<Student> students=studentRepo.findAll(example);
		//students.forEach(System.out::println);
		
		//customized delete operation
		//studentRepo.deleteStudent(126);
		//System.out.println("deleted  successfully.....");
		
		//custom delete operation
		//studentRepo.updateStudent(125,"f" );
		//System.out.println("record updated...");
		
		
		//custom insert operation 
		//studentRepo.insertStudent(100, "f", "garli", (long) 1123555);
		//System.out.println("record added successfully...");
		 
		//note custom inserting is not possible
		//Student s=new Student(4,"lov",(long) 3333,"female","y");
		//studentRepo.save(s);
		//System.out.println("record saved....");
		
		//switch soft delete
		
		
		//Student stu=studentRepo.findById(4).get();
		//stu.setActiveSW("N");
		//studentRepo.save(stu);
		
		
//=========================PRODUCT Entity ======================================================= 
		ProductRepository productRepo=context.getBean(ProductRepository.class);
		Product p=new Product();
		//p.setProductId(121);
		p.setProductName("python book");
		p.setProductPrice((double) 789);
		productRepo.save(p);
		System.out.println("Product Inserted....");
		
		
		}
		

}
