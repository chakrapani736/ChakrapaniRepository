package com.te.hibernatemapping.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "Bag_info")
public class Bag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bagId;
	private String bagName;
	private String bagColor;

	public int getBagId() {
		return bagId;
	}

	public void setBagId(int bagId) {
		this.bagId = bagId;
	}

	public String getBagName() {
		return bagName;
	}

	public void setBagName(String bagName) {
		this.bagName = bagName;
	}

	public String getBagColor() {
		return bagColor;
	}

	public void setBagColor(String bagColor) {
		this.bagColor = bagColor;
	}

	@Override
	public String toString() {
		return "Bag [bagId=" + bagId + ", " + (bagName != null ? "bagName=" + bagName + ", " : "")
				+ (bagColor != null ? "bagColor=" + bagColor : "") + "]";
	}

}
