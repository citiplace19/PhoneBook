package com.claim;
import java.util.Comparator;

public abstract class PersonCompare implements Comparator<Person> {
	public int compare(Person person1, Person person2) {
		String fullNamePerson1 = person1.getFirstName() + person1.getLastName();
		String fullNamePerson2 = person1.getFirstName() + person1.getLastName();
		
		return fullNamePerson1.compareTo(fullNamePerson2);
		
		
			
		}
	}