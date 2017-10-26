
package is.hi.soguheimur.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import is.hi.soguheimur.model.PublicationMeta;
import is.hi.soguheimur.model.PublicationText;
import is.hi.soguheimur.repository.PublicationMetaRepository;
import is.hi.soguheimur.repository.PublicationTextRepository;

/**
 * 
 * @author Steina Dogg Vigfusdottir sdv6@hi.is
 * Oct 21, 2017
 * HBV501G Software Project 1 University of Iceland
 * 
 * Services for models publicationMeta and publicationText.
 * It's mostly used to 
 */
@Service
public class PublicationService {
	@Autowired PublicationMetaRepository pubMetaRep;
	@Autowired PublicationTextRepository pubTextRep;

    
    public PublicationMeta save(PublicationMeta pub) {
        return pubMetaRep.save(pub);
    }
    
    public PublicationText save(PublicationText pub) {
    	return pubTextRep.save(pub);
    }
    
    public PublicationMeta findById(long id) {
    	return pubMetaRep.findById(id);
    }
    
    
    
}
