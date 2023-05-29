package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{

}
