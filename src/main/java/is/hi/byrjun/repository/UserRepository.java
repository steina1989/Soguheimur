package is.hi.byrjun.repository;
import is.hi.byrjun.model.User;
import java.util.List;

/**
 * Interface for the UserRepository
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 */
public interface UserRepository  {
	
    /**
     * To fetch all of the users
     * @return list of users.
     */
    List <User> getAll();
    
    /**
     * Adds a user.
     * @param user 
     */
    void add (User user);
}
