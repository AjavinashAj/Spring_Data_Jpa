package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Book;

public interface bookRepository extends JpaRepository<Book,Integer>{

}
