package com.hibernate.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String email;
	private String password;
	private LocalDateTime birthday;
	private String mobile;
	private byte gender;
	private byte expired;
	private byte locked;
	@Column(name="credential_expired")
	private byte credentialExpired;
	private byte enable;

	@Column(name = "created_id")
	private int createdId;

	@Column(name = "created_date")
	private LocalDateTime createdDate;

	@Column(name = "updated_id")
	private int updatedId;

	@Column(name = "updated_date")
	private LocalDateTime updatedDate;
	
	public User() {
	}

	public User(int id, String firstName, String lastName, String email, String password, LocalDateTime birthday,
			String mobile, byte gender, byte expired, byte locked, byte credentialExpired, byte enable, int createdId,
			LocalDateTime createdDate, int updatedId, LocalDateTime updatedDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.birthday = birthday;
		this.mobile = mobile;
		this.gender = gender;
		this.expired = expired;
		this.locked = locked;
		this.credentialExpired = credentialExpired;
		this.enable = enable;
		this.createdId = createdId;
		this.createdDate = createdDate;
		this.updatedId = updatedId;
		this.updatedDate = updatedDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public byte getGender() {
		return gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

	public byte getExpired() {
		return expired;
	}

	public void setExpired(byte expired) {
		this.expired = expired;
	}

	public byte getLocked() {
		return locked;
	}

	public void setLocked(byte locked) {
		this.locked = locked;
	}

	

	public byte getCredentialExpired() {
		return credentialExpired;
	}

	public void setCredentialExpired(byte credentialExpired) {
		this.credentialExpired = credentialExpired;
	}

	public byte getEnable() {
		return enable;
	}

	public void setEnable(byte enable) {
		this.enable = enable;
	}

	public int getCreatedId() {
		return createdId;
	}

	public void setCreatedId(int createdId) {
		this.createdId = createdId;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public int getUpdatedId() {
		return updatedId;
	}

	public void setUpdatedId(int updatedId) {
		this.updatedId = updatedId;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", birthday=" + birthday + ", mobile=" + mobile + ", gender=" + gender
				+ ", expired=" + expired + ", locked=" + locked + ", credentialExpired=" + credentialExpired
				+ ", enable=" + enable + ", createdId=" + createdId + ", createdDate=" + createdDate + ", updatedId="
				+ updatedId + ", updatedDate=" + updatedDate + "]";
	}
	
}