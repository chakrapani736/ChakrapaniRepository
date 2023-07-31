package com.te.hibernatedemo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="principal_info")
public class Principal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int principalId;
	private String principalName;
	public int getPrincipalId() {
		return principalId;
	}
	public void setPrincipalId(int principalId) {
		this.principalId = principalId;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	@Override
	public String toString() {
		return "Principal [principalId=" + principalId + ", "
				+ (principalName != null ? "principalName=" + principalName : "") + "]";
	}
	

}
