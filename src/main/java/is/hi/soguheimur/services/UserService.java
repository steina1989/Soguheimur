
package is.hi.soguheimur.services;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import is.hi.soguheimur.model.User;
import is.hi.soguheimur.repository.UserRepository;

/**
 * User services and connection to the user repository.
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg Vigfúsdóttir sdv6@hi.is
 */
@Service
public class UserService   {
	@Autowired UserRepository userRep;
	
	public boolean test() {
		return true;
	}

    public boolean checkValidName(String name) {
    	return true;
    }
    public List<User> allUsers() {
        return userRep.findAll();   
    }
    
    public User save(User user) {
        return userRep.save(user);
    }
    
    public User findUserByUsername(String userName) {
    	return userRep.findByUserName(userName);
    }
	public User findByEmail(String email) {
		return userRep.findByEmail(email);
		
	}
	public boolean existsUserName(User user) {
		return (userRep.findByEmail(user.getEmail()) != null);
	}
	public User findUserByEmail(String email) {
		return userRep.findByEmail(email);
	}




    
}
