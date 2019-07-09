package com.claim;

import java.util.Arrays;

import java.util.Scanner;

import com.claim.Contacts;


public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
        int userSelection;     
        
        Contacts contact = new Contacts();
        Person[] newContactArray = new Person[1];        
        Person newContact = new Person();        
        newContactArray[0] = newContact;   
               
        boolean flag = true;
     

        do {        	
            System.out.println("Please makes selection from the options below: \n");
            System.out.println("1:  Add a new Contact");
            System.out.println("2:  Search for contact by first name");
            System.out.println("3:  Search for contact by last name");
            System.out.println("4:  Search for contact by full name");
            System.out.println("5:  Search for contact by phone number");
            System.out.println("6:  Search for contact by city");
            System.out.println("7:  Search for contact by state");
            System.out.println("8:  Delete a contact for a given phone number");
            System.out.println("9:  Update a contact for a given phone number");
            System.out.println("10: Show all contacts");
            System.out.println("11:  Exit\n");
            
            userSelection = userInput.nextInt();            
            System.out.println();            
            userInput.nextLine();
            
            switch(userSelection) {
            	case 1:	System.out.println("Please enter your contact's info in the following format: ");
            			System.out.println("Firstname MiddleName LastName, 114 Market St., St. Louis, MO, 63403, 6366435698");
            			String contactRecord = userInput.nextLine();
            			System.out.println(contactRecord);
            			
            			
            			String[] contactRecord2Array = new String[6];
            			contactRecord2Array = contactRecord.split(",");            			
            			
            			
            			String fullName = contactRecord2Array[0];
            			String[] nameElement = new String[3];
            			nameElement = fullName.split(" ");
            			
            	            			
            			if(nameElement.length == 2) {
            				newContact.setFirstName(nameElement[0]);
            				newContact.setMiddleName("");
            				newContact.setLastName(nameElement[1]);  
            				
            			}        
            			else {
            				newContact.setFirstName(nameElement[0]);
            				newContact.setMiddleName(nameElement[1]);
            				newContact.setLastName(nameElement[2]); 
            			}
            			            			
            			String street = contactRecord2Array[1];
            			String city = contactRecord2Array[2];
            			String state = contactRecord2Array[3];
            			String zip = contactRecord2Array[4];
            	
            			
            			Address address = new Address(street, city, state, zip);
            			newContact.setAddress(address);
            			newContact.setPhoneNumber(contactRecord2Array[5]);
      
            			
            			if(flag) {
            				newContactArray = contact.addInitialContact(newContact);
            			}
            			else {
            				newContactArray = contact.addContact(newContact, newContactArray);
            			} 
            			
            			
            		flag = false;
            		System.out.println("Your contact has been added.\n");             		
            		break;
            		
            	case 2:  System.out.println("Please enter the first name of the contact: ");            		            	
            			 String firstName = userInput.nextLine();            	
            			 System.out.println();            	
            			 contact.firstNameSearch(newContactArray, firstName);            	
                break;
            		
            	case 3:	System.out.println("Please enter the last name of the contact: ");            		            	
            			String lastName = userInput.nextLine();            	
            			System.out.println();            	
            			contact.lastNameSearch(newContactArray, lastName);
            		break;
            		
            	case 4:	System.out.println("Enter the contacts full name.  Please use the following format: ");
            			System.out.println("First Middle Last // or // First Last");
            			String fullNameSearch = userInput.nextLine();                    	
                    	System.out.println();
                    	
                    	
                    	String[] fullNameSearchArray = 	fullNameSearch.split(" ");       
                    	
                    	if(fullNameSearchArray.length==3) {
                    	String firstNameElement = fullNameSearchArray[0];                    	
                    	String middleNameElement = fullNameSearchArray[1];                    	
                    	String lastNameElement = fullNameSearchArray[2];                    	
                    	contact.fullNameSearch(newContactArray, firstNameElement, middleNameElement, lastNameElement);    }
                    	
                    	else {
                    		String firstNameElement = fullNameSearchArray[0];                    	
                        	                  	
                        	String lastNameElement = fullNameSearchArray[1];                    	
                        	contact.fullNameSearch(newContactArray, firstNameElement, lastNameElement);
                    	}
            		break;
            		
            	case 5:	System.out.println("Please enter the telephone number of the contact:\n");            	
            			String phoneNumber = userInput.nextLine();            	
            			System.out.println();            	
            			contact.phoneNumberSearch(newContactArray, phoneNumber);
            		break;
            		
            	case 6:	System.out.println("Please enter the city to search contacts by:\n");            	
            			String city1 = userInput.nextLine();            	
            			System.out.println();            	
            			contact.citySearch(newContactArray, city1);
            		
            		break;
            		
            	case 7:	System.out.print("Please enter a state to search contacts by:\n ");
            			String stateElement = userInput.nextLine();
            			System.out.println();
            			contact.stateSearch(newContactArray, stateElement);
            			
            		break;
            		
            	case 8:	System.out.println("Please enter number to delete: ");
            			String phoneNumberOfContactToBeRemoved = userInput.nextLine();                
            			System.out.println();            			
                    
            			if (newContactArray.length == 0) {            				
            				System.out.println("There are currently no contacts in the phonebook.");
                
            			} else {                	
            			
            				newContactArray = contact.deleteContactByPhoneNumber(newContactArray, phoneNumberOfContactToBeRemoved);		}           						
            					
            				                        			
            		break;
            		
            	case 9:	System.out.println("Please enter number to update: ");            	
            			System.out.println();            			            	
            			String contactUpdate = userInput.nextLine();		                
		                System.out.println();
		                
		                if (newContactArray.length == 0) {            				
            				System.out.println("There are currently no contacts in the phonebook.");
                
            			} else {                	
            			
            				newContactArray = contact.deleteContactByPhoneNumber(newContactArray, contactUpdate);		}
		                
		                System.out.println("Enter new info in format: \n");
		                System.out.println("Firstname MiddleName LastName, 657 Johnson Drive, Bay City, KS, 66102, 9132560000");
		                String contactUpdate2 = userInput.nextLine();
		                System.out.println();
		                
		              
            			String[] contactRecord3Array = new String[6];
            			contactRecord3Array = contactUpdate2.split(",");            			
            			
            			
            			String fullName1 = contactRecord3Array[0];
            			String[] nameElement1 = new String[3];
            			nameElement1 = fullName1.split(" ");
            			
            	            			
            			if(nameElement1.length == 2) {
            				newContact.setFirstName(nameElement1[0]);
            				newContact.setMiddleName("");
            				newContact.setLastName(nameElement1[1]);  
            				
            			}        
            			else {
            				newContact.setFirstName(nameElement1[0]);
            				newContact.setMiddleName(nameElement1[1]);
            				newContact.setLastName(nameElement1[2]); 
            			}
            			            			
            			String street3 = contactRecord3Array[1];
            			String city3 = contactRecord3Array[2];
            			String state3 = contactRecord3Array[3];
            			String zip3 = contactRecord3Array[4];
            	
            			
            			Address address1 = new Address(street3, city3, state3, zip3);
            			newContact.setAddress(address1);
            			newContact.setPhoneNumber(contactRecord3Array[5]);
      
            			
            			if(flag) {
            				newContactArray = contact.addInitialContact(newContact);
            			}
            			else {
            				newContactArray = contact.addContact(newContact, newContactArray);
            			} 
            			
            			
            		flag = false;
            		System.out.println("Your contact has been updated.\n");             		
            		break;
            		
                
		                
            	case 10:	Arrays.sort(newContactArray);            	
            				contact.displayAllRecords(newContactArray);
            	
            		break;
            		
            	case 11:	System.out.println("Exiting..Thanks for using!!");
            			break;
            			
            	default: System.out.println("Invalid entry.  Please try again...");            
            }

	}while( userSelection != 11);
        
    	userInput.close();

}}