package com.ntt.MappingHib;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String lanme;

	@ManyToMany
	private Person person;

	// @ManyToMany
	// private List<Student> student =new ArrayList<Student>();

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	/*
	 * public List<Student> getStudent() { return student; } public void
	 * setStudent(List<Student> student) { this.student = student; }
	 */
	/*
	 * @ManyToOne private Student student;
	 * 
	 * public Student getStudent() { return student; } public void
	 * setStudent(Student student) { this.student = student; }
	 */
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLanme() {
		return lanme;
	}

	public void setLanme(String lanme) {
		this.lanme = lanme;
	}

}
