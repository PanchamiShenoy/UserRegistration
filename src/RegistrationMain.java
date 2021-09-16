import java.util.Scanner;

public class RegistrationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		UserRegistration register = new UserRegistration();

		System.out.println("Enter Firstname which starts with Cap and has minimum 3 characters");
		String firstName = scanner.nextLine();
		Boolean firstNameCheck = register.validateFirstName(firstName);
		if (firstNameCheck) {
			System.out.println("Valid first name");
		} else
			System.out.println("Invalid first name");

		System.out.println("\nEnter Secondname which starts with Cap and has minimum 3 characters");
		String secondName = scanner.nextLine();

		Boolean secondNameCheck = register.validateSecondName(secondName);
		if (secondNameCheck) {
			System.out.println("Valid second name");
		} else
			System.out.println("Invalid second name");

		System.out.println("Enter valid email");
		String email = scanner.nextLine();
		Boolean emailCheck = register.validateEmail(email);
		if (emailCheck) {
			System.out.println("Valid email");
		} else
			System.out.println("Invalid email");
		System.out.println("Enter valid phone number ");
		String phone = scanner.nextLine();
		Boolean phoneCheck = register.validatePhone(phone);
		if (phoneCheck) {
			System.out.println("Valid phone number");
		} else
			System.out.println("Invalid phone number");
	}
}
