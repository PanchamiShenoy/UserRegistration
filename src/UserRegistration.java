import java.util.regex.Pattern;

public class UserRegistration {

	/**
	 * method to validate first name
	 * 
	 * @param firstName -first name is passed as parameter
	 * @return
	 */
	public Boolean validateFirstName(String firstName) {
		String string = "^[A-Z][a-z]{2}[a-z]*";
		Boolean result = Pattern.matches(string, firstName);
		return result;
	}

	/**
	 * method to validate second name
	 * 
	 * @param secondName -second name is passed as parameter
	 * @return
	 */
	public Boolean validateSecondName(String secondName) {
		String string = "^[A-Z][a-z]{2}[a-z]*";
		Boolean result = Pattern.matches(string, secondName);
		return result;
	}

}
