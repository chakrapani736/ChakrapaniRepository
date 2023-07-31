package com.te.hibernatedemo.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="school_info")
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int schoolId;
	private String schoolName;
	@OneToOne(cascade = CascadeType.ALL)
	private Principal principal;
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", " + (schoolName != null ? "schoolName=" + schoolName + ", " : "")
				+ (principal != null ? "principal=" + principal : "") + "]";
	}
	

}
