package com.hibernate.ManyToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Customer {
@Id
@GeneratedValue(generator="sequence-generator")
@GenericGenerator(
		name="sequence-generator",
		strategy="org.hibernate.id.enhanced.SequenceStyleGenerator",
		parameters= {
				@Parameter(name="sequence_name",value="user_sequence"),
				@Parameter(name="intitial_value",value="1001"),
				@Parameter(name="increment_size",value="1")
		}
)
private int C_id;
private String Cname;
@ManyToMany
List<SbiBank>slist;
public int getC_id() {
	return C_id;
}
public void setC_id(int c_id) {
	C_id = c_id;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}
public List<SbiBank> getSlist() {
	return slist;
}
public void setSlist(List<SbiBank> slist) {
	this.slist = slist;
}


}
