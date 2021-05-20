package com.cg.loginRegistration.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Users")
public class User {

	@Id
	@Column(nullable = false, unique = true)
	private String userId;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String role;

	public User() {
		super();
	}

	public User(String userId, String email, String password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}


}
