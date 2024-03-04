package com.demo.entities;
// Generated Mar 1, 2024, 2:08:08 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "account", catalog = "warehousemanagement")
public class Account implements java.io.Serializable {

	private Integer id;
	private Role role;
	private String username;
	private String password;
	private String fullname;
	private String email;
	private boolean gender;
	private String address;
	private String photo;
	private String phone;
	private Date dob;
	private String status;
	private Set<Bill> bills = new HashSet<Bill>(0);
	private Set<AccountProuduct> accountProuducts = new HashSet<AccountProuduct>(0);

	public Account() {
	}

	public Account(Role role, String username, String password, String fullname, String email, boolean gender,
			String address, String photo, String phone, Date dob, String status) {
		this.role = role;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.photo = photo;
		this.phone = phone;
		this.dob = dob;
		this.status = status;
	}

	public Account(Role role, String username, String password, String fullname, String email, boolean gender,
			String address, String photo, String phone, Date dob, String status, Set<Bill> bills,
			Set<AccountProuduct> accountProuducts) {
		this.role = role;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.photo = photo;
		this.phone = phone;
		this.dob = dob;
		this.status = status;
		this.bills = bills;
		this.accountProuducts = accountProuducts;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "username", nullable = false, length = 250)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 250)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "fullname", nullable = false, length = 250)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "email", nullable = false, length = 250)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "gender", nullable = false)
	public boolean isGender() {
		return this.gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@Column(name = "address", nullable = false, length = 250)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "photo", nullable = false, length = 250)
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "phone", nullable = false, length = 250)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dob", nullable = false, length = 10)
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "status", nullable = false, length = 250)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Bill> getBills() {
		return this.bills;
	}

	public void setBills(Set<Bill> bills) {
		this.bills = bills;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<AccountProuduct> getAccountProuducts() {
		return this.accountProuducts;
	}

	public void setAccountProuducts(Set<AccountProuduct> accountProuducts) {
		this.accountProuducts = accountProuducts;
	}

}