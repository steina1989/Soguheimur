package is.hi.soguheimur.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.soguheimur.model.PublicationMeta;

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
