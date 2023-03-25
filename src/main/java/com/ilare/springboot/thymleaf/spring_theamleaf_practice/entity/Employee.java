package com.ilare.springboot.thymleaf.spring_theamleaf_practice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "Name is required")
	private String name;

	@NotBlank(message = "Surname is required")
	private String surname;

	@NotBlank(message = "Department is required")
	private String department;

	@NotBlank(message = "Email is required")
	@Email(message = "Incorrect Email")
	private String email;

	@Min(value = 20, message = "Salary must be at least 20")
	private Long salary;
}
