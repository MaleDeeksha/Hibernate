package com.OneToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
@Id
private int D_id;
private String Dname;
@OneToMany
private List<Employee>Emp;
public int getD_id() {
	return D_id;
}
public void setD_id(int d_id) {
	D_id = d_id;
}
public String getDname() {
	return Dname;
}
public void setDname(String dname) {
	Dname = dname;
}
public List<Employee> getEmp() {
	return Emp;
}
public void setEmp(List<Employee> emp) {
	Emp = emp;
}

}
