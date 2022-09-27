package com.ManyToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee1 {
@Id
private int Eid;
private String Ename;
private double salary;
@ManyToMany
private List<Project>project;
public int getEid() {
	return Eid;
}
public void setEid(int eid) {
	Eid = eid;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}

public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public List<Project> getProject() {
	return project;
}
public void setProject(List<Project> project) {
	this.project = project;
}

}
