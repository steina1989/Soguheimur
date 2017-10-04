
package is.hi.byrjun.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import is.hi.byrjun.model.User;
import is.hi.byrjun.repository.UserRepository;

/**
 * User services and connection to the user repository.
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg Vigfúsdóttir sdv6@hi.is
 */
@Service
public class PublicationService {
	@Autowired UserRepository userRep;


    public boolean checkValidName(String name) {
    	return true;
    }
    public List<User> allUsers() {
        return userRep.findAll();   
    }
    
    public User save(User user) {
        return userRep.save(user);
    }
    
}
