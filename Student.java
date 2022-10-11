package org.virtusa.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	private String name;
	private String address;
	@OneToOne
	@JoinColumn(name="stu_detail_id")
	private StudentDetails StudentDetails;
	public Student() {	
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StudentDetails getStudentDetails() {
		return StudentDetails;
	}
	public void setStudentDetails(StudentDetails studentDetails) {
		StudentDetails = studentDetails;
	}
	
	

}
