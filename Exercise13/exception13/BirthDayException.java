package exception13;

import java.time.format.DateTimeParseException;

public class BirthDayException extends DateTimeParseException{

	public BirthDayException(String message, CharSequence parsedData, int errorIndex) {
		super(message, parsedData, errorIndex);
		
	}
}
