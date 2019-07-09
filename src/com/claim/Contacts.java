package com.claim;


public class Contacts {
	
	private Person[] contactArray;
	
	public Contacts() {
	
	}

	public Contacts(Person[] contactArray) {
		this.contactArray = contactArray;
	}

	public Person[] getContactArray() {
		return contactArray;
	}

	public void setContactArray(Person[] contactArray) {
		this.contactArray = contactArray;
	}
	
	public Person[] addInitialContact(Person contact) {
		
		Person[] newContactArray = new Person[1];
		
		Person newContact = new Person();
		newContactArray[0] = newContact;
		
		newContactArray[0].setFirstName(contact.getFirstName());		
		newContactArray[0].setMiddleName(contact.getMiddleName());
		newContactArray[0].setLastName(contact.getLastName());
		
		String street = contact.getAddress().getStreet();
		String city = contact.getAddress().getCity();
		String state = contact.getAddress().getState();
		String zip = contact.getAddress().getZip();
		
		Address newAddress = new Address(street,city,state,zip);		
		newContactArray[0].setAddress(newAddress);
		newContactArray[0].setPhoneNumber(contact.getPhoneNumber());
		
		return newContactArray;		
	}
	
	public Person[] addContact(Person contact,Person[] contactArray) {		
	
		Person[] newContactArray = new Person[contactArray.length + 1];

		
		for(int i = 0; i < newContactArray.length; i++) {
			Person newContact = new Person();
			newContactArray[i] = newContact;
	}		
		for (int i = 0; i < contactArray.length; i++) {

		newContactArray[i].setFirstName(contactArray[i].getFirstName());
		newContactArray[i].setMiddleName(contactArray[i].getMiddleName());
		newContactArray[i].setLastName(contactArray[i].getLastName());

		String street = contactArray[i].getAddress().getStreet();
		String city = contactArray[i].getAddress().getCity();
		String state = contactArray[i].getAddress().getState();
		String zip = contactArray[i].getAddress().getZip();

		Address newAddress = new Address(street, city, state, zip);
		newContactArray[i].setAddress(newAddress);
		newContactArray[i].setPhoneNumber(contactArray[i].getPhoneNumber());
	}

	newContactArray[contactArray.length].setFirstName(contact.getFirstName());
	newContactArray[contactArray.length].setMiddleName(contact.getMiddleName());
	newContactArray[contactArray.length].setLastName(contact.getLastName());

	String street = contact.getAddress().getStreet();
	String city = contact.getAddress().getCity();
	String state = contact.getAddress().getState();
	String zipCode = contact.getAddress().getZip();

	Address address = new Address(street, city, state, zipCode);
	newContactArray[contactArray.length].setAddress(address);
	newContactArray[contactArray.length].setPhoneNumber(contact.getPhoneNumber());

	return newContactArray;}
	
	public void firstNameSearch(Person[] newContactArray, String firstName) {

		boolean contactFound = false;

		for(Person contact : newContactArray) {

			if(firstName.equals(contact.getFirstName())) {
				System.out.println(contact);
				
				contactFound = true;
			} 
		}
		System.out.println();

		if(!contactFound) {

			System.out.println("The name you entered could not be found.");
		}	
	}
		
	public void lastNameSearch(Person[] newContactArray, String lastName) {

		boolean contactFound = false;

		for(Person contact : newContactArray) {
			
			if(contact.getLastName().equalsIgnoreCase(lastName)) {
				System.out.println(contact);
		
				contactFound = true;
			} 
		}
		System.out.println();

		if(!contactFound) {

			System.out.println("The name you entered could not be found.");
		}	
	}
	
	public void fullNameSearch(Person[] newContactArray, String firstName, String lastName) {

		boolean countactFound = false;

		for(Person contact : newContactArray) {

			if((firstName.equals(contact.getFirstName())) && 
					(lastName.equals(contact.getLastName()))) {

				System.out.println(contact);

				countactFound = true;
			} 
		}
		System.out.println();
		if(!countactFound) {

			System.out.println("The name you entered could not be found.");
		}	}	
	
	
	public void fullNameSearch(Person[] newContactArray, String firstName, String middleName, String lastName) {

		boolean countactFound = false;

		for(Person contact : newContactArray) {

			if((firstName.equals(contact.getFirstName())) && (middleName.equals(contact.getMiddleName())) && 
					(lastName.equals(contact.getLastName()))) {

				System.out.println(contact);

				countactFound = true;
			} 
		}
		System.out.println();
		if(!countactFound) {

			System.out.println("The name you entered could not be found.");
		}	}	
	
	
	public void phoneNumberSearch(Person[] newContactArray, String phoneNumber) {

		boolean contactFound = false;

		for(Person contact : newContactArray) {

			if(contact.getPhoneNumber().trim().equalsIgnoreCase(phoneNumber)) {
				System.out.println(contact.toString());
				
				contactFound = true;
			} 
		}
		System.out.println();
		
		if(!contactFound) {

			System.out.println("The phone number you entered could not be found.");
		}	
	}
	
	public void citySearch(Person[] newContactArray, String city) {

		boolean contactFound = false;

		for(Person contact : newContactArray) {

			if(contact.getAddress().getCity().trim().equals(city)) {

				System.out.println(contact.toString());

				contactFound = true;
			}
		}
		System.out.println();
		
		if(!contactFound) {

			System.out.println("A contact with the city you entered could not be found.");
		}
	}
	
	public void stateSearch(Person[] newContactArray, String state) {

		boolean contactFound = false;

		for(Person contact : newContactArray) {

			if(contact.getAddress().getState().trim().equals(state)) {

				System.out.println(contact.toString());

				contactFound = true;
			}
		}
		System.out.println();

		if(!contactFound) {

			System.out.println("A contact with the state you entered could not be found.");
		}
	}
	
	public Person[] deleteContactByPhoneNumber(Person[] newContactArray, String phoneNumber) {
		boolean flag = false;
		Person[] newContactArray2 = new Person[newContactArray.length-1];
		int index = 0;
		for(int i = 0; i <newContactArray.length;i++) {
			if(newContactArray[i].getPhoneNumber().trim().equals(phoneNumber)){
				index = i;
				flag=true;
				break;
			}
		}
		for (int i=0; i<newContactArray.length;i++) {
			if(i < index && i != index) {
				newContactArray2[i] = newContactArray[i];
				System.out.println("The contact has been deleted");
			}
			else if(i>index)
			{
				newContactArray[i-1]= newContactArray[i];
				
			}
		}
			if(flag == false) {
				System.out.println("No matching contact found.");
			}
		return newContactArray2;    
		
		
	}
	
	
	
public Person[] updateRecordByPhoneNumber(Person[] newContactArray, String phoneNumber, Person updatedContact) {
		
		Person[] updatedContactArray = new Person[newContactArray.length];		
		boolean contactFound = false;
		
		for(int i = 0; i < updatedContactArray.length; i++) {
			
			Person contact = new Person();			
			updatedContactArray[i] = contact;			
		}
		
		for(int i = 0; i < newContactArray.length; i++) {
			
			if(phoneNumber.equals(newContactArray[i].getPhoneNumber())) {
				
				updatedContactArray[i].setFirstName(updatedContact.getFirstName());
				updatedContactArray[i].setMiddleName(updatedContact.getMiddleName());
				updatedContactArray[i].setLastName(updatedContact.getLastName());
				
				String street = updatedContact.getAddress().getStreet();
				String city = updatedContact.getAddress().getCity();
				String state =updatedContact.getAddress().getState();
				String zip = updatedContact.getAddress().getZip();
				
				Address address = new Address(street, city, state, zip);				
				updatedContactArray[i].setAddress(address);				
				updatedContactArray[i].setPhoneNumber(updatedContact.getFirstName());
				
				contactFound = true;
				
			} else {
				
				updatedContactArray[i].setFirstName(newContactArray[i].getFirstName());
				updatedContactArray[i].setMiddleName(newContactArray[i].getMiddleName());
				updatedContactArray[i].setLastName(newContactArray[i].getLastName());
				
				String street = newContactArray[i].getAddress().getStreet();
				String city = newContactArray[i].getAddress().getCity();
				String state = newContactArray[i].getAddress().getState();
				String zip = newContactArray[i].getAddress().getZip();				
				Address address = new Address(street, city, state, zip);				
				updatedContactArray[i].setAddress(address);				
				updatedContactArray[i].setPhoneNumber(newContactArray[i].getPhoneNumber());				
			}			
		}
		
		if(contactFound) {
			
			System.out.println("The contact has been updated.\n");
		
		} else {
			
			System.out.println("The contact could not be found.\n");
			
		}
		
		return updatedContactArray;		
	}
	
	public void displayAllRecords(Person[] newContactArray) {
		
		for(Person contact:newContactArray) {
			System.out.println(contact.toString());	
		System.out.println();
		}
	}
	
	public Person[] removeContact(Person[]contactArray, Person contactToBeRemoved) {
		Person[] newContactArray = new Person[contactArray.length-1];
		
		for(Person contact : contactArray) {
			if(!contact.equals(contactToBeRemoved)) {
				newContactArray[0] = contact;
			}
		}		

		return newContactArray;
	}
	@Override
	public String toString() {
		
		return contactArray.toString();
		
	}
	
}