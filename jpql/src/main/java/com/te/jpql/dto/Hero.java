package com.te.jpql.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="hero_info")
@NamedQuery(name="findAll",query="select e from Hero e")
public class Hero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private String role;
	public Hero() {
		
	}
	public Hero( String name, String address, String role) {
		super();
		
		this.name = name;
		this.address = address;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Hero [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
				+ (address != null ? "address=" + address + ", " : "") + (role != null ? "role=" + role : "") + "]";
	}
		

}
