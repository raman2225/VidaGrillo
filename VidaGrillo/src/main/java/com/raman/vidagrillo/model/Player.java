package com.raman.vidagrillo.model;

import javax.persistence.*;

@Entity
@Table(name="player")
public class Player{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="player_id")
	private Long PlayerId;
	
	@Column(name="player_name")
	private String PlayerName;
	
	@Column(name="email_id")
	private String EmailId;
	
	@Column(name="mobile")
	private String Mobile;
	
	@Column(name="city")
	private String City;
	
	@Column(name="state")
	private String State;
	
	@Column(name="role")
	private String Role;
	
	@Column(name="batting_style")
	private String BattingStyle;
	
	@Column(name="bowling_style")
	private String BowlingStyle;
	
	public Long getPlayerId() {
		return PlayerId;
	}
	public void setPlayerId(Long playerId) {
		PlayerId = playerId;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getBattingStyle() {
		return BattingStyle;
	}
	public void setBattingStyle(String battingStyle) {
		BattingStyle = battingStyle;
	}
	public String getBowlingStyle() {
		return BowlingStyle;
	}
	public void setBowlingStyle(String bowlingStyle) {
		BowlingStyle = bowlingStyle;
	}	
	
}