package com.ntt.MappingHib;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity // (name="Human") //to change the table name
public class Person {
	@Id
	private int aid;
	private String name;

	@OneToMany(mappedBy = "Person", fetch = FetchType.EAGER)
	private Collection<Laptop> laps = new ArrayList<Laptop>();

	public int getAid() {
		return aid;
	}

	public Collection<Laptop> getLaps() {
		return laps;
	}

	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	@Override
	public String toString() {
		return "Person [aid=" + aid + ", name=" + name + ", color=" + "]";
	}

}
//@Entity(name="Human") //to change the table name
//Table(name="Humans") //to change the table name
//@Transient //to unstore the data 

//@Column(name="Colour") //to change the column name
