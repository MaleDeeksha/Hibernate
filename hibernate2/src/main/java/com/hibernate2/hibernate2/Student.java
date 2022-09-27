 package com.hibernate2.hibernate2;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@NamedQueries({@NamedQuery(name="findStudentById",query="from Student std1 where std1.id=:Id1"),
              @NamedQuery(name="findStudentByName",query="from Student std1 where std1.name=:name1"),
              @NamedQuery(name="getStudentCount",query="count(*)from Student std1 where std1.name=:name1"),
              @NamedQuery(name="getStudentOrderBy",query="from Student std1 where std1.name")})

@Entity
@Table(name="Student")


public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}



