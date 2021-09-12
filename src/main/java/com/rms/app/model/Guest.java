package com.rms.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "guests")
public class Guest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "full_name", nullable = false)
	private String fullName;

	@Column(name = "dob", nullable = false)
	private Date dob;

	@Column(name = "phone", nullable = false)
	private long phone;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "govt_id", nullable = false)
	private String govtId;

	@Column(name = "address_1", nullable = false)
	private String address1;

	@Column(name = "address_2", nullable = false)
	private String address2;

	@Column(name = "address_3", nullable = false)
	private String address3;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "state", nullable = false)
	private String state;

	@Column(name = "zip_code", nullable = false)
	private long zipCode;

	@Column(name = "doj", nullable = false)
	private Date doj;

	@Column(name = "dol", nullable = false)
	private Date dol;

	@Column(name = "is_valid_user", nullable = false)
	private boolean isValidUser;

	@Column(name = "is_room_allocated", nullable = false)
	private boolean isRoomAllocated;
}
