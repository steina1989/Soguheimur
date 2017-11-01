
package is.hi.soguheimur.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import is.hi.soguheimur.model.Publication;
import is.hi.soguheimur.repository.PublicationRepository;

/**
 * 
 * @author Steina Dogg Vigfusdottir sdv6@hi.is
 * Oct 21, 2017
 * HBV501G Software Project 1 University of Iceland
 * 
 * Services for Publications
 */
@Service
public class PublicationService {
	@Autowired PublicationRepository pubRep;

    public Publication save(Publication pub) {
    	return pubRep.save(pub);
    }

	public Publication findById(long id) {
		return pubRep.findById(id);
	}
    
    
}
