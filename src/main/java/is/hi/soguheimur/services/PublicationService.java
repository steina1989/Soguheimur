
package is.hi.soguheimur.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import is.hi.soguheimur.model.PublicationMeta;
import is.hi.soguheimur.model.User;
import is.hi.soguheimur.repository.PublicationRepository;
import is.hi.soguheimur.repository.UserRepository;

/**
 * User services and connection to the user repository.
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg Vigfúsdóttir sdv6@hi.is
 */
@Service
public class PublicationService {
	@Autowired PublicationRepository pubRep;

    
    public PublicationMeta save(PublicationMeta pub) {
        return pubRep.save(pub);
    }
    
    public PublicationMeta findById(long id) {
    	return pubRep.findById(id);
    }
    
}
