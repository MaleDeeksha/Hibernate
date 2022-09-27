package com.hibernate.ManyToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@NamedQueries({@NamedQuery(name="findSbiBankById",query="from SbiBank sb where sb.B_id=:Id1"),
	           @NamedQuery(name="findSbiBankByName",query="from SbiBank sb where sb.Name=:Name1"),

               @NamedQuery(name="findSbiBankname",query="from SbiBank")})
@Entity
public class SbiBank {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int B_id;
	private String Name;
	@ManyToMany
	List<Customer>clist;
	public int getB_id() {
		return B_id;
	}
	public void setB_id(int b_id) {
		B_id = b_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public List<Customer> getClist() {
		return clist;
	}
	public void setClist(List<Customer> clist) {
		this.clist = clist;
	}
	
}
