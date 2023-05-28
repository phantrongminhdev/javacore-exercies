package controller13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

import exception13.BirthDayException;
import exception13.EmailException;
import exception13.FullnameException;
import exception13.PhoneException;

public class Validation {
	
	
	// check birthday
	public static boolean checkBirthDay(String date) {
		boolean valid = false;
		try {
			LocalDate.parse(date, DateTimeFormatter.ofPattern("uuuu-M-d").withResolverStyle(ResolverStyle.STRICT));
			
			valid = true;
		}catch(BirthDayException e) {
			e.printStackTrace();
			valid = false;
		}
		
		return valid;
	}
	
	// check phone
	public static void phoneCheck(String phone) throws PhoneException{
		if(phone.length() != 10) {
			throw new PhoneException("phone is invalid");
		}
	}
	
	// check email
	public static void emailCheck(String email) throws EmailException{
		if(!email.contains("@")) {
			throw new EmailException("email dont have @ type");
		}
	}
	
	// check name
	public static void nameCheck(String name) throws FullnameException{
		if(name.length() <= 0) {
			throw new FullnameException("Name is invalid");
		}
	}
}	





















