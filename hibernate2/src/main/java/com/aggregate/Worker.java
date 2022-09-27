package com.aggregate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Worker {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int Wid;
private String Wname;
private String City;
private int age;
private double salary;
@OneToOne
public int getWid() {
	return Wid;
}
public void setWid(int wid) {
	Wid = wid;
}
public String getWname() {
	return Wname;
}
public void setWname(String wname) {
	Wname = wname;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}



}
