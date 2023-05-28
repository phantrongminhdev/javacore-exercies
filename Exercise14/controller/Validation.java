package controller;

import java.util.regex.Pattern;

public class Validation {
	
	// https://www.w3schools.com/java/java_regex.asp
	
	// date is format ( dd/mm/yyyy or dd-mm-yyyy)
	private static Pattern DATE_PATTERN = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
	
	//check date format
	public static boolean checkDateFormat(String dateString ) {
		boolean check = false;
		if(DATE_PATTERN.matcher(dateString).matches()) {
			return true;
		}
		return check;
	}
	
	//check fullname format
	public static boolean checkFullNameFormat(String fullname) {
		boolean check = false;
		if(fullname.length() <=50 && fullname.length() >= 10) {
			check = true;
		}
		return check;
	}
	
	//check phone
	public static boolean checkPhoneNumber(String phoneNumber ) {
		boolean check = false;
		String subStr = phoneNumber.substring(0, 3);
		if(phoneNumber.length() == 10 && (subStr.equals("090") || subStr.equals("098")
			|| subStr.equals("091")|| subStr.equals("031")|| subStr.equals("035") || subStr.equals("038"))) {
			return true;
		}
		return check;
	}
}
