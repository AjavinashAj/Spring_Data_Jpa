package in.ashokit.repository;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Student;

//@Repository//it is optional
public interface StudentRepository extends CrudRepository<Student,Integer> {

	//not writing any logics
}
