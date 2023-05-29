package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.repository.bookRepository;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(BookApplication.class, args);
		bookRepository bk=context.getBean(bookRepository.class);
		Book b=new Book();
		b.setBid(123);
		b.setBname("Alex");
		b.setBprice((double) 400);
		b.setQty(3);
		bk.save(b);
	}

}
