package com.eximfiles.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Contacts {
	
	@Id
	@Column
	private int contactId;
	@Column
	private String contactType;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String emailID;
	@Column
	private long contactNumber;
	@Column
	private String officeAddress;
	@Column
	private String officeEmailID;
	@Column
	private long officeContactNumber;
	@Column
	private String country;
	@Column
	private String state;
	@Column
	private String cityName;
	@Column
	private String zipCode;
	@Column
	private long Telephone;
	@Column
	private long fax;

	
	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getOfficeEmailID() {
		return officeEmailID;
	}

	public void setOfficeEmailID(String officeEmailID) {
		this.officeEmailID = officeEmailID;
	}

	public long getOfficeContactNumber() {
		return officeContactNumber;
	}

	public void setOfficeContactNumber(int officeContactNumber) {
		this.officeContactNumber = officeContactNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public long getTelephone() {
		return Telephone;
	}

	public void setTelephone(int telephone) {
		Telephone = telephone;
	}

	public long getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

}