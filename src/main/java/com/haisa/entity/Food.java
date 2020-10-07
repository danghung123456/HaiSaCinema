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
 * Food generated by hbm2java
 */
@Entity
@Table(name = "Food", schema = "dbo", catalog = "MovieManagement")
public class Food  {
	private Integer foodId;
	private String name;
	private Double price;
	private Integer status;

	public Food() {
	}

	public Food(String name, Double price, Integer status) {
		this.name = name;
		this.price = price;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "foodId", unique = true, nullable = false)
	public Integer getFoodId() {
		return this.foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	@Column(name = "name")
	public Serializable getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price", precision = 53, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
