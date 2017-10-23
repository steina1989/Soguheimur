package is.hi.soguheimur.services;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;


public class PasswordHasher {

	public static class HashPassword {  
	    public static String hashPassword(String password) throws NoSuchAlgorithmException{
	        MessageDigest md = MessageDigest.getInstance("MD5"); // Specifies wich algorithim there is beaing used
	        md.update(password.getBytes()); // loads in the string
	        byte[] b = md.digest(); // outcome
	        StringBuffer sb = new StringBuffer();
	        for(byte b1 : b){
	            sb.append(Integer.toHexString(b1 & 0xff).toString()); // convert the outcome to hex 
	        }
	        return sb.toString();
	    }
	    public static String createUserSalt(){ // creates user salt that is unique to every user and is stored in the sql database
	    	 SecureRandom random = new SecureRandom();
	         byte bytes[] = new byte[20];
	         random.nextBytes(bytes);
	         String salt =  bytes.toString();

	    	return salt;
	    }
	    
	    
	    public static void main(String[] args){ // only to test hash
	       String salt = createUserSalt(); // should call into database to collect user salt
	       		System.out.println("this is the salt : " + salt);
	       String password = "password" + salt;  // 
	        	System.out.println(password);
	        try{
	            System.out.println(hashPassword(password));
	            System.out.println(hashPassword(password));
	        }
	        catch(NoSuchAlgorithmException e){ // ef tilgreind algrím er ekki til
	            System.out.println(e);
	        }
	        
	    }
	}
}
