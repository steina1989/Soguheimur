package is.hi.soguheimur.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.soguheimur.model.User;

/**
 * Interface for the UserRepository
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
    /**
     * To fetch all of the users
     * @return list of users.
     */
    List <User> findAll();
    
    /**
     * Adds a user.
     * @param user 
     */
    User save (User user);
    

	User findByUserName(String username);
    
}
