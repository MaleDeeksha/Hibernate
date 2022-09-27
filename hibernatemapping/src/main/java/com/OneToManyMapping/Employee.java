package com.OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
@Id
private int Eid;
private String Ename;
private String Eaddress;
private int Number;
@ManyToOne
private Department Dept;
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
public String getEaddress() {
	return Eaddress;
}
public void setEaddress(String eaddress) {
	Eaddress = eaddress;
}
public int getNumber() {
	return Number;
}
public void setNumber(int number) {
	Number = number;
}
public Department getDept() {
	return Dept;
}
public void setDept(Department dept) {
	Dept = dept;
}

}
