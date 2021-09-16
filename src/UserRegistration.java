import java.util.regex.Pattern;

public class UserRegistration {

	/**
	 * method to validate first name
	 * 
	 * @param firstName -first name is passed as paramter
	 * @return
	 */
	public Boolean validateFirstName(String firstName) {
		String matcher = "^[A-Z][a-z]{2}[a-z]*";
		Boolean check = Pattern.matches(matcher, firstName);
		return check;
	}

}
