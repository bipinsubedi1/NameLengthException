package com.hcl.name;

public class InvalidNameLengthException extends Exception{
public InvalidNameLengthException () {
	super ("Invalid name length. It should be between 10 and  15 characters.");
}
public InvalidNameLengthException (String message) {
	super (message);
}
}
