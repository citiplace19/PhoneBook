package com.claim;


	public class Person implements Comparable<Person>  {
	private String firstName;
	private String middleName;
	private String lastName;
	private Address address;
	private String phoneNumber;
	
	public Person() {
		this.firstName = "";
    	this.middleName = "";
    	this.lastName = "";    	
    	this.address = new Address();    	
    	this.phoneNumber = "";
	}
	
	public Person(String firstName, String lastName, String phoneNumber, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;}
	
	public Person(String firstName, String middleName, String lastName, Address address, String phoneNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public String toString() {
		return firstName + " "+ middleName+" "+ lastName+","+ address.toString()+ "," + phoneNumber;
	}
	@Override
	public int compareTo(Person other) {
		
		return firstName.compareTo(other.firstName); 
	} 
	

}