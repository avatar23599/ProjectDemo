package com.demo.entities;
// Generated Mar 7, 2024, 10:52:49 AM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

/**
 * Input generated by hbm2java
 */
@Entity
@Table(name = "input", catalog = "warehousemanagement")
public class Input implements java.io.Serializable {

	private Integer id;
	private Date date;
	private Set<Inputifo> inputifos = new HashSet<Inputifo>(0);

	public Input() {
	}

	public Input(Date date) {
		this.date = date;
	}

	public Input(Date date, Set<Inputifo> inputifos) {
		this.date = date;
		this.inputifos = inputifos;
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

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "input")
	public Set<Inputifo> getInputifos() {
		return this.inputifos;
	}

	public void setInputifos(Set<Inputifo> inputifos) {
		this.inputifos = inputifos;
	}

}
