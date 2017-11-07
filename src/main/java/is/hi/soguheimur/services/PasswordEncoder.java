package is.hi.soguheimur.services;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

// Bcript is better than most available encoders because it is too slow to be affected by brute force attacks within.
@Service
public class PasswordEncoder { // this main class is strictly for testing purposes, serves no other use
	public static void main(String [] args) {
		String UserPassword="Monkey";
		System.out.println("Password as entered by user : "+UserPassword);
		CharSequence EncodedPassword = createEncodedPassword(UserPassword);
		CharSequence newEncodedPassword = createEncodedPassword(UserPassword);
		System.out.println( "Password after Encription printed once : "+EncodedPassword);
		System.out.println( "Password after Encription printed twice : "+newEncodedPassword);
		boolean confirmaPasword = confirmPassword(UserPassword,createEncodedPassword(UserPassword));
		System.out.println( "Password confirmation : "+confirmaPasword);				
	}

	
	public static String createEncodedPassword( String userPassword) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12); // decides the length and strength of password
		String Password = encoder.encode(userPassword); // encripting the string input from user
		// System.out.println(Password);
	
		return Password;
	}
	
	public static boolean confirmPassword(String passwordFromUser, String passwordFromDatabase){
		
		return BCrypt.checkpw(passwordFromUser,passwordFromDatabase);
	}

}


 