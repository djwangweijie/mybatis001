package com.wwj.model;

import java.util.List;

public class Interest {
	
	private  int  iid;
	private  String iname;
	private  List<Animal> animals;
	
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	
	

}
