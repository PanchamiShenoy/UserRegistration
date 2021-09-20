import java.util.regex.Pattern;

public class UserRegistration {

	/**
	 * method to validate first name
	 * 
	 * @param firstName -first name is passed as parameter
	 * @return boolean whether valid or invalid
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
	 * @return boolean whether valid or invalid
	 */
	public Boolean validateSecondName(String secondName) {
		String string = "^[A-Z][a-z]{2}[a-z]*";
		Boolean result = Pattern.matches(string, secondName);
		return result;
	}

	/**
	 * method to validate email
	 * 
	 * @param email- email which is passed as parameter
	 * @return boolean whether valid or invalid
	 */
	public Boolean validateEmail(String email) {
		String string = "^[a-zA-z0-9]+?(.)[a-zA-Z0-9+_-]*@[a-zA-Z]+\\.[a-zA-z]{2,4}?(.)[A-za-z]*$";
		Boolean result = Pattern.matches(string, email);
		return result;
	}

	/**
	 * method to validate phone number
	 * 
	 * @param phone -phone number is passed as parameter
	 * @return boolean whether valid or invalid
	 */
	public Boolean validatePhone(String phone) {
		String string = "[0-9]{2}\\s[1-9][0-9]{9}";
		Boolean result = Pattern.matches(string, phone);
		return result;
	}

	/**
	 * method to validate password
	 * 
	 * @param password -password is passed as parameter
	 * @return boolean whether valid or invalid
	 */
	public Boolean validatePassword(String password) {
		String string = "^(?=.*[0-9])(?=.*[A-Z]).{8,}$";
		Boolean result = Pattern.matches(string, password);
		return result;
	}
}
