package is.hi.soguheimur.services;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	public static void main(String [] args) {
		String UserPassword="Monkey";
		System.out.println("Password as entered by user : "+UserPassword);
		String EncodedPassword = createEncodedPassword(UserPassword);
		System.out.println( "Password after Encription : "+EncodedPassword);
		boolean confirmPasword = confirmPassword(UserPassword);
		System.out.println( "Password confirmation : "+confirmPasword);		
		
	}

public static String createEncodedPassword( String userPassword) {
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	String Password = encoder.encode(userPassword);
	// System.out.println(Password);
	return Password;
}
public static boolean confirmPassword(String password){
	String passwordEntered = createEncodedPassword(password);
	String passwordInDatabase = passwordEntered; // here needs a call upon database function
	
	if(passwordEntered == passwordInDatabase){
		return true;
	} else{
		return false;
	}
  }
}
