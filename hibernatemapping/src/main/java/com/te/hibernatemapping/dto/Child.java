package com.te.hibernatemapping.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name = "Child_info")
public class Child {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int childId;
	private String childName;
	@OneToOne(cascade = CascadeType.ALL)
	private Bag bag;

	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public Bag getBag() {
		return bag;
	}

	public void setBag(Bag bag) {
		this.bag = bag;
	}
}
