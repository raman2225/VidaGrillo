package com.raman.vidagrillo.model;

import javax.persistence.*;

@Entity
@Table(name="team")
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="teamId")
	private Long teamId;
	
	@Column(name="teamName")
	private String teamName;

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
	
}
