package com.rms.app.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "guests")
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "full_name")
	@NotEmpty(message = "fullname cannot be empty")
	@NotBlank(message = "fullname cannot be blank")
	@Size(min = 2, message = "fullname should have atleast 2 characters")
	private String fullName;

	@Column(name = "dob")
	//	@DateTimeFormat(iso = ISO.DATE, pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dob;

	@Column(name = "phone")
	@NotNull(message = "phone number cannot be empty")
	private long phone;

	@Column(name = "email")
	@Email
	@NotEmpty(message = "email cannot be empty")
	private String email;

	@Column(name = "govt_proof")
	@NotEmpty(message = "government proof cannot be empty")
	private String govtProof;

	@Column(name = "govt_id")
	@NotEmpty(message = "government id cannot be empty")
	@NotBlank(message = "government id cannot be blank")
	@Size(min = 3, message = "government id should have atleast 3 characters")
	private String govtId;

	@Column(name = "address_1")
	@NotEmpty(message = "address1 cannot be empty")
	@NotBlank(message = "address1 cannot be blank")
	@Size(min = 3, message = "address1 should have atleast 3 characters")
	private String address1;

	@Column(name = "address_2")
	@NotEmpty(message = "address2 cannot be empty")
	@NotBlank(message = "address2 cannot be blank")
	@Size(min = 3, message = "address2 should have atleast 3 characters")
	private String address2;

	@Column(name = "address_3")
	@NotEmpty(message = "address3 cannot be empty")
	@NotBlank(message = "address3 cannot be blank")
	@Size(min = 3, message = "address3 should have atleast 3 characters")
	private String address3;

	@Column(name = "city")
	@NotEmpty(message = "city cannot be empty")
	@NotBlank(message = "city cannot be blank")
	@Size(min = 2, message = "address3 should have atleast 2 characters")
	private String city;

	@Column(name = "state")
	@NotEmpty(message = "state cannot be empty")
	@NotBlank(message = "state cannot be blank")
	@Size(min = 2, message = "state should have atleast 2 characters")
	private String state;

	@Column(name = "zip_code")
	@NotNull(message = "zipcode cannot be blank")
	@Range(min = 2, message = "zipcode should have atleast 2 characters")
	private long zipCode;

	@Column(name = "doj")
	//	@DateTimeFormat(iso = ISO.DATE, pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate doj;

	@Column(name = "dol")
	//	@DateTimeFormat(iso = ISO.DATE, pattern = "dd/MM/yyyy")
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dol;

	@Column(name = "is_valid_user")
	private boolean isValidUser;

	@Column(name = "is_room_allocated")
	private boolean isRoomAllocated;

	//Default constructor
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Parameterized constructor
	public Guest(long id,
			@NotEmpty(message = "fullname cannot be empty") @NotBlank(message = "fullname cannot be blank") @Size(min = 2, message = "fullname should have atleast 2 characters") String fullName,
			@NotEmpty(message = "date of birth cannot be empty") LocalDate dob,
			@NotEmpty(message = "phone number cannot be empty") @NotBlank(message = "phone number cannot be blank") @Size(max = 10, message = "phone number should have maximum 10 characters") long phone,
			@Email @NotEmpty(message = "email cannot be empty") String email,
			@NotEmpty(message = "government proof cannot be empty") String govtProof,
			@NotEmpty(message = "government id cannot be empty") @NotBlank(message = "government id cannot be blank") @Size(min = 3, message = "government id should have atleast 3 characters") String govtId,
			@NotEmpty(message = "address1 cannot be empty") @NotBlank(message = "address1 cannot be blank") @Size(min = 3, message = "address1 should have atleast 3 characters") String address1,
			@NotEmpty(message = "address2 cannot be empty") @NotBlank(message = "address2 cannot be blank") @Size(min = 3, message = "address2 should have atleast 3 characters") String address2,
			@NotEmpty(message = "address3 cannot be empty") @NotBlank(message = "address3 cannot be blank") @Size(min = 3, message = "address3 should have atleast 3 characters") String address3,
			@NotEmpty(message = "city cannot be empty") @NotBlank(message = "city cannot be blank") @Size(min = 2, message = "address3 should have atleast 2 characters") String city,
			@NotEmpty(message = "state cannot be empty") @NotBlank(message = "state cannot be blank") @Size(min = 2, message = "state should have atleast 2 characters") String state,
			@NotBlank(message = "zipcode cannot be blank") @Size(min = 2, message = "zipcode should have atleast 2 characters") long zipCode,
			@NotEmpty(message = "date of joining cannot be empty") LocalDate doj,
			@NotEmpty(message = "date of leaving cannot be empty") LocalDate dol, boolean isValidUser,
			boolean isRoomAllocated) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
		this.govtProof = govtProof;
		this.govtId = govtId;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.doj = doj;
		this.dol = dol;
		this.isValidUser = isValidUser;
		this.isRoomAllocated = isRoomAllocated;
	}

	//Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGovtProof() {
		return govtProof;
	}

	public void setGovtProof(String govtProof) {
		this.govtProof = govtProof;
	}

	public String getGovtId() {
		return govtId;
	}

	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public LocalDate getDol() {
		return dol;
	}

	public void setDol(LocalDate dol) {
		this.dol = dol;
	}

	public boolean isValidUser() {
		return isValidUser;
	}

	public void setValidUser(boolean isValidUser) {
		this.isValidUser = isValidUser;
	}

	public boolean isRoomAllocated() {
		return isRoomAllocated;
	}

	public void setRoomAllocated(boolean isRoomAllocated) {
		this.isRoomAllocated = isRoomAllocated;
	}
}
