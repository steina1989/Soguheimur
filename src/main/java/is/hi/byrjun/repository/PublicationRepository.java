package is.hi.byrjun.repository;
import is.hi.byrjun.model.PublicationMeta;
import is.hi.byrjun.model.User;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface for the UserRepository
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 */
public interface PublicationRepository extends JpaRepository<PublicationMeta, Long> {
	
	
    
}
