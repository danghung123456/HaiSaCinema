<<<<<<< HEAD
package com.haisa.entity;
// Generated Oct 6, 2020, 8:38:42 AM by Hibernate Tools 5.1.10.Final

import java.io.Serializable;
=======
package com.haisa.Entity;



>>>>>>> af595be4425b9aef60319fd77a738c887e8df525
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Member generated by hbm2java
 */
@Entity
<<<<<<< HEAD
@Table(name = "Member", schema = "dbo", catalog = "MovieManagement")
public class Member implements java.io.Serializable {

	private Integer memberId;
	private Serializable memberName;
	private String email;
	private String password;
	private String phone;
	private Serializable address;
	private Serializable birthday;
=======
@Table(name = "Member")
public class Member{

	private Integer memberId;
	private String memberName;
	private String email;
	private String password;
	private String phone;
	private String address;
	private String birthday;
>>>>>>> af595be4425b9aef60319fd77a738c887e8df525
	private Integer idCard;
	private Double totalMoney;

	public Member() {
	}

<<<<<<< HEAD
	public Member(Serializable memberName, String email, String password, String phone, Serializable address,
			Serializable birthday, Integer idCard, Double totalMoney) {
=======
	public Member(String memberName, String email, String password, String phone, String address,
			String birthday, Integer idCard, Double totalMoney) {
>>>>>>> af595be4425b9aef60319fd77a738c887e8df525
		this.memberName = memberName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
		this.idCard = idCard;
		this.totalMoney = totalMoney;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

<<<<<<< HEAD
	@Column(name = "memberId", unique = true, nullable = false)
=======
	@Column(name = "memberid", unique = true, nullable = false)
>>>>>>> af595be4425b9aef60319fd77a738c887e8df525
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

<<<<<<< HEAD
	@Column(name = "memberName")
	public Serializable getMemberName() {
		return this.memberName;
	}

	public void setMemberName(Serializable memberName) {
=======
	@Column(name = "membername")
	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
>>>>>>> af595be4425b9aef60319fd77a738c887e8df525
		this.memberName = memberName;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "phone", length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "address")
<<<<<<< HEAD
	public Serializable getAddress() {
		return this.address;
	}

	public void setAddress(Serializable address) {
=======
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
>>>>>>> af595be4425b9aef60319fd77a738c887e8df525
		this.address = address;
	}

	@Column(name = "birthday")
<<<<<<< HEAD
	public Serializable getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Serializable birthday) {
		this.birthday = birthday;
	}

	@Column(name = "idCard")
=======
	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Column(name = "idcard")
>>>>>>> af595be4425b9aef60319fd77a738c887e8df525
	public Integer getIdCard() {
		return this.idCard;
	}

	public void setIdCard(Integer idCard) {
		this.idCard = idCard;
	}

<<<<<<< HEAD
	@Column(name = "totalMoney", precision = 53, scale = 0)
=======
	@Column(name = "totalmoney")
>>>>>>> af595be4425b9aef60319fd77a738c887e8df525
	public Double getTotalMoney() {
		return this.totalMoney;
	}

	public void setTotalMoney(Double totalMoney) {
		this.totalMoney = totalMoney;
	}

}
