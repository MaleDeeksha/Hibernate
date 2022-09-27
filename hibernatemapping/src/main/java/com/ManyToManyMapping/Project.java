package com.ManyToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
@Id
private int Pid;
private String Pname;
@ManyToMany(mappedBy = "project")
private List<Employee1>emp;
public int getPid() {
	return Pid;
}
public void setPid(int pid) {
	Pid = pid;
}
public String getPname() {
	return Pname;
}
public void setPname(String pname) {
	Pname = pname;
}
public List<Employee1> getEmp() {
	return emp;
}
public void setEmp(List<Employee1> emp) {
	this.emp = emp;
}

}
