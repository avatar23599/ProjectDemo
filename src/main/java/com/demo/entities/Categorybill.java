package com.demo.entities;
// Generated Mar 7, 2024, 10:52:49 AM by Hibernate Tools 4.3.6.Final

import jakarta.persistence.*;

/**
 * Categorybill generated by hbm2java
 */
@Entity
@Table(name = "categorybill", catalog = "warehousemanagement")
public class Categorybill implements java.io.Serializable {

	private Integer id;
	private int name;

	public Categorybill() {
	}

	public Categorybill(int name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public int getName() {
		return this.name;
	}

	public void setName(int name) {
		this.name = name;
	}

}
