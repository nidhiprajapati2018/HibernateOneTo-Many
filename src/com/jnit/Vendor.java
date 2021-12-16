package com.jnit;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Vendor")
public class Vendor {
	@Id
	@Column(name="vid")
	private int vid;
	@Column(name="vname")
	private String vname;
	
  @OneToMany(fetch=FetchType.LAZY,targetEntity=Customer.class, cascade=CascadeType.ALL)	
  @JoinColumn(name="cvid",referencedColumnName= "vid")
  private Set row;

public int getVid() {
	return vid;
}

public void setVid(int vid) {
	this.vid = vid;
}

public String getVname() {
	return vname;
}

public void setVname(String vname) {
	this.vname = vname;
}

public Set getRow() {
	return row;
}

public void setRow(Set row) {
	this.row = row;
} 
  
}
