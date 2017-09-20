package is.hi.byrjun.repository;

import is.hi.byrjun.model.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Implementation of UserRepository.
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 */
@Repository
public class UserRepositoryImp implements UserRepository{

    private final List<User> listOfUsers;

    public UserRepositoryImp() {
        this.listOfUsers = new ArrayList<User>();
    }
    
    @Override
    public List<User> getAll() {
        return listOfUsers; 
    }

    @Override
    public void add (User user) {
        listOfUsers.add(user);
    }

}
