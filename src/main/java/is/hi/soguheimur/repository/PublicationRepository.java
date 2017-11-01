package is.hi.soguheimur.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import is.hi.soguheimur.model.Publication;

/**
 * JPA will take care of implementing these methods.
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 */
public interface PublicationRepository extends JpaRepository<Publication, Long> {
	
	Publication save (Publication pbMeta);
    
	Publication findById(long id);
	
}
