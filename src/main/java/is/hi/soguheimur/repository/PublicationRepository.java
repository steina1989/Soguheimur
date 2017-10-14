package is.hi.soguheimur.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.soguheimur.model.PublicationMeta;
import is.hi.soguheimur.model.User;

/**
 * Interface for the UserRepository
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 */
public interface PublicationRepository extends JpaRepository<PublicationMeta, Long> {
	
	PublicationMeta save (PublicationMeta pbMeta);
    
	PublicationMeta findById(long id);
}
