package com.haisa.entity;
// Generated Oct 6, 2020, 8:38:42 AM by Hibernate Tools 5.1.10.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "Employee", schema = "dbo", catalog = "MovieManagement")
public class Employee implements java.io.Serializable {

	private Integer employeeId;
	private Serializable name;
	private String password;
	private int role;
	private String email;
	private Integer phone;
	private Serializable address;
	private Serializable birthday;
	private String idCard;
	private Integer cinemaId;
	private Integer status;

	public Employee() {
	}

	public Employee(Serializable name, String password, int role) {
		this.name = name;
		this.password = password;
		this.role = role;
	}

	public Employee(Serializable name, String password, int role, String email, Integer phone, Serializable address,
			Serializable birthday, String idCard, Integer cinemaId, Integer status) {
		this.name = name;
		this.password = password;
		this.role = role;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
		this.idCard = idCard;
		this.cinemaId = cinemaId;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "employeeId", unique = true, nullable = false)
	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "name", nullable = false)
	public Serializable getName() {
		return this.name;
	}

	public void setName(Serializable name) {
		this.name = name;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "role", nullable = false)
	public int getRole() {
		return this.role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone")
	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Column(name = "address")
	public Serializable getAddress() {
		return this.address;
	}

	public void setAddress(Serializable address) {
		this.address = address;
	}

	@Column(name = "birthday")
	public Serializable getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Serializable birthday) {
		this.birthday = birthday;
	}

	@Column(name = "idCard")
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "cinemaId")
	public Integer getCinemaId() {
		return this.cinemaId;
	}

	public void setCinemaId(Integer cinemaId) {
		this.cinemaId = cinemaId;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
