package com.cg.loginRegistration.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Registrations")
public class Registration {
	@Id
	private String email;

	@Column(nullable = false)
	private String firstname;

	@Column(nullable = false)
	private String lastname;

	@Column(nullable = false)
	private String mobile;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private String role;	

}
