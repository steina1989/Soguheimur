package is.hi.byrjun.services;

import java.util.List;

import is.hi.byrjun.model.User;

/**
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 *
 */
public interface UserService {
    /**
     * Checks whether a namestring contains not less than two names seperated by space.
     * @param name The whole name of a person.
     * @return True if the name is properly formatted, false otherwise.
     */
    public boolean checkValidName(String name);

    /**
     * 
     * @return list of all users.
     */
	List<User> allUsers();

	
	User save(User user); 
}
