package com.aggregate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Trainer {
@Id
private int Tid;
private String Tname;
@OneToOne
public int getTid() {
	return Tid;
}
public void setTid(int tid) {
	Tid = tid;
}
public String getTname() {
	return Tname;
}
public void setTname(String tname) {
	Tname = tname;
}

}
