package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repository.BookRepository;

@SpringBootApplication
public class Book1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Book1Application.class, args);
		        BookRepository bk=context.getBean(BookRepository.class);
		        Book b=new Book();
		        b.setBid(12);
		        b.setBname("java");
		        b.setBprice((double)400);
		        b.setQty(3);
		        bk.save(b);
	}

}
