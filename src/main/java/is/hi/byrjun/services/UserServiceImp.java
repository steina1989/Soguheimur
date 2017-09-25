
package is.hi.byrjun.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import is.hi.byrjun.model.User;
import is.hi.byrjun.repository.UserRepository;

/**
 * Implementation of the methods of VeryfiInput
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg Vigfúsdóttir sdv6@hi.is
 */
@Service
public class UserServiceImp implements UserService{
	@Autowired UserRepository userRep;

    @Override
    public boolean checkValidName(String name) {
//        String [] splitName = name.split(" ");
//        System.out.println(splitName.length);
//        return splitName.length > 1;
    	return true;
    }
    
    @Override
    public List<User> allUsers() {
        return userRep.findAll();   
    }
    
    @Override
    public User save(User user) {
        return userRep.save(user);
    }
    
}
