package com.te.hibernatedemo.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ground_info")
public class Ground {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int groundId;
	private String groundName;
	private String groundUse;
	@OneToOne(cascade = CascadeType.ALL)
	private Players players;

	public int getGroundId() {
		return groundId;
	}

	public void setGroundId(int groundId) {
		this.groundId = groundId;
	}

	public String getGroundName() {
		return groundName;
	}

	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}

	public String getGroundUse() {
		return groundUse;
	}

	public void setGroundUse(String groundUse) {
		this.groundUse = groundUse;
	}

	public Players getPlayers() {
		return players;
	}

	public void setPlayers(Players players) {
		this.players = players;
	}

}
