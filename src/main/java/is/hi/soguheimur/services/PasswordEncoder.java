package is.hi.soguheimur.services;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// Bcript is better than moste available encoders because it is too slow to be affected by brute force attacks within.

public class PasswordEncoder { // this main class is strictly for testing purposes, serves no other use
	public static void main(String [] args) {
		String UserPassword="Monkey";
		System.out.println("Password as entered by user : "+UserPassword);
		String EncodedPassword = createEncodedPassword(UserPassword);
		System.out.println( "Password after Encription printed once : "+EncodedPassword);
		System.out.println( "Password after Encription printed twice : "+EncodedPassword);
		boolean confirmPasword = confirmPassword(UserPassword,UserPassword);
		System.out.println( "Password confirmation : "+confirmPasword);				
	}

public static String createEncodedPassword( String userPassword) {
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12); // decides the length and strength of password
	String Password = encoder.encode(userPassword); // encripting the string input from user
	// System.out.println(Password);
	return Password;
}
public static boolean confirmPassword(String passwordFromUser, String passwordFromDatabase){
	String passwordEntered = createEncodedPassword(passwordFromUser);
	if(passwordEntered == passwordFromDatabase){
		return true;
	} else{
		return false;
	}
  }
}
