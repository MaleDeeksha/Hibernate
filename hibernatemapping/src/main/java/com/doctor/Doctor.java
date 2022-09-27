package com.doctor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Doctor {
@Id
@GeneratedValue(generator="sequence-generator")
@GenericGenerator(
		name="sequence-generator",
		strategy="org.hibernate.id.enhanced.SequenceStyleGenerator",
		parameters= {
				@Parameter(name="sequence_name",value="user_sequence"),
				@Parameter(name="intitial_value",value="4"),
				@Parameter(name="increment_size",value="1")
		}
)
private int Did;
private String Dname;
public int getDid() {
	return Did;
}
public void setDid(int did) {
	Did = did;
}
public String getDname() {
	return Dname;
}
public void setDname(String dname) {
	Dname = dname;
}
/*public Date getVersion() {
	return version;
}
public void setVersion(int ) {
	this.version = ;
}*/


}
