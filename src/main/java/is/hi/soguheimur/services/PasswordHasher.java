package is.hi.soguheimur.services;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class PasswordHasher {

	public static class HashPassword {  
	    public static String hashPassword(String password) throws NoSuchAlgorithmException{
	        MessageDigest md = MessageDigest.getInstance("MD5"); // Tilgreinir algrími sem á nota
	        md.update(password.getBytes()); // hleður inn strengi inn  algrími
	        byte[] b = md.digest(); // útkoma
	        StringBuffer sb = new StringBuffer();
	        for(byte b1 : b){
	            sb.append(Integer.toHexString(b1 & 0xff).toString()); // breytum útkomunni Hex 
	        }
	        return sb.toString();
	    }
	    public static void main(String[] args){ // eingöngu til að prufa Hash
	        String password = "password";
	        
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
