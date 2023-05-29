package in.ashokit.repository;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Student;
import jakarta.transaction.Transactional;

//@Repository//it is optional
public interface StudentRepository extends CrudRepository<Student,Integer> {

	//not writing any logics
	public List<Student> findByGender(String gender);
	
	
	//select * from student_dtls where student_gender is null
	public List<Student>findByGenderIsNull();
	
	//select * from student_dtls where student_rank >=:rank
	public List<Student> findByRankGreaterThanEqual(Integer rank);
	//select * from student_dtls where student_rank<=:rank
	public List<Student> findByRankLessThanEqual(Long rank);
	
	//girl student whose are having rank>1000;
	//select * from Student_dtls where student_gender=? and student_rank >=:rank
	
	public List<Student> findByGenderAndRankGreaterThanEqual(String gender,Long rank);
	
	public List<Student>findByName(String name);
	
	//note :-custom query are HQL query
	//custom query
	@Query(value="select * from student_dtls",nativeQuery=true)
	public List<Student>getAllStudents();
	
	@Query("from Student")
	public List<Student> getStudents();
	
	@Query("from Student where gender=:gender")
	public List<Student> getGender(String gender);
	
	@Query("from Student where gender=null")
	public List<Student> getGenderNull();
	
	@Query("from Student where rank >=1400")
	public List<Student> getRankGreaterAndEqual();
	
	@Query("from Student where rank <=1400")
	public List<Student> getRankSmallerAndEqual();
	
	@Query("from Student where gender='f'AND rank <=1400")
	public List<Student> getRankGender();
	
	@Query("select rank,gender from Student")
	public List<Student>getRG();
	
	//paging and sorting
	public List<Student> findAll(Sort descending);
	//QueryByExample
	public List<Student> findAll(Example<Student> example);
	
	//custom query to delete the record
	@Query("delete from Student where id=:student_id")
	@Modifying
	@Transactional
	public void deleteStudent(Integer student_id);
	
	//custom query to update the  record
	@Query("update Student set gender=:student_gender where id=:student_id")
	@Modifying
	@Transactional
	public void updateStudent(Integer student_id,String student_gender);
	
	
	//custom query to insert into the record
	@Query(value="insert into Student_dtls values(:student_id,:student_gender,:student_name,:student_rank)",nativeQuery=true)
	@Modifying
	@Transactional
	public void insertStudent(Integer student_id,String student_gender,String student_name,Long student_rank);
	
	
}
