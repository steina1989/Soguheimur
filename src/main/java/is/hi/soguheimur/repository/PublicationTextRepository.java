package is.hi.soguheimur.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import is.hi.soguheimur.model.PublicationText;

/**
 * 
 * @author Steina Dogg Vigfusdottir sdv6@hi.is
 * Oct 21, 2017
 * HBV501G Software Project 1 University of Iceland
 * 
 * Repository for publicationTexts.
 */
public interface PublicationTextRepository extends JpaRepository<PublicationText, Long> {
	

}
