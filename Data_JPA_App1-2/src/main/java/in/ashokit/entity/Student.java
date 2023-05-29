package in.ashokit.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STUDENT_DTLS")//optional if not write then class name is same of table name
public class Student {
	@Id
	@Column(name="student_id")//optional if not write then table column name same as class variable name 
	private Integer id;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="student_rank")
	private Long rank;
	
	@Column(name="student_gender")
	private String gender;
	
	@CreationTimestamp
	@Column(name="CREATED_DATE")
	private LocalDateTime createDate;
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE")
	private LocalDateTime updateDate;
	
	@Column(name="ACTIVE_SW")
	private String activeSW;
	
	


	


	


	public Student(Integer id, String name, Long rank, String gender, String activeSW) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.gender = gender;
		this.activeSW = activeSW;
	}





	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public Long getRank() {
		return rank;
	}





	public void setRank(Long rank) {
		this.rank = rank;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public LocalDateTime getCreateDate() {
		return createDate;
	}





	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}





	public LocalDateTime getUpdateDate() {
		return updateDate;
	}





	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}





	public String getActiveSW() {
		return activeSW;
	}





	public void setActiveSW(String activeSW) {
		this.activeSW = activeSW;
	}





	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + ", gender=" + gender + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", activeSW=" + activeSW + "]";
	}





	
	
	
}
