package com.hcl.name;
import java.util.Scanner;
public class Name {
public static void main (String[] args) {
	Scanner nameEntry = new Scanner (System.in);
	String fullName, firstName, middleName, lastName;
	int space1, space2, firstNameLength, middleNameLength, lastNameLength, fullNameLength;
	System.out.println ("Please enter your full name.");
	fullName = nameEntry.nextLine();
	try {
	space1 = fullName.indexOf(' ');
	space2 = fullName.lastIndexOf (' ');
	firstName = fullName.substring (0, space1);
	middleName = fullName.substring(space1,space2);
	lastName = fullName.substring(space2 + 1);
	
	System.out.println ("First Name: " + firstName);
	System.out.println ("Middle Name: " + middleName);
	System.out.println ("Last Name: " + lastName);	
	
	fullNameLength = firstName.length() + middleName.length() + lastName.length();
	if (fullNameLength < 10 || fullNameLength > 15) {
		throw new InvalidNameLengthException();
	}
} catch (InvalidNameLengthException e) {
	System.out.println (e.getMessage());
}
}
}