package org.virtusa.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int student_detail_id;
	private String LinkedUrl;
	private int age;
	public StudentDetails() {
		// TODO Auto-generated constructor stub
	}
	public int getStudent_detail_id() {
		return student_detail_id;
	}
	public void setStudent_detail_id(int student_detail_id) {
		this.student_detail_id = student_detail_id;
	}
	public String getLinkedUrl() {
		return LinkedUrl;
	}
	public void setLinkedUrl(String linkedUrl) {
		LinkedUrl = linkedUrl;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
