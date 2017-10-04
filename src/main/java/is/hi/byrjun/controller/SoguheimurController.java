package is.hi.byrjun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import is.hi.byrjun.model.PublicationMeta;
import is.hi.byrjun.model.User;
import is.hi.byrjun.services.PublicationService;
import is.hi.byrjun.services.UserService;


/**
 * Controller for the project soguheimur
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 */
@Controller
@RequestMapping("/browse") // Makes all path relative to /browse
public class SoguheimurController {
	
	 @Autowired
	    PublicationService pubService;
	
	
	/*
	 * Returns the createProfile.jsp file.
	 */
	 @RequestMapping(value="/{id}")
	 public String viewStory(@PathVariable("id") long id, ModelMap model) {
		 
		 
		 // TO DO: sækja söguna gegnum gagnagrunn, en ekki búa bara til random sögu.
		 PublicationMeta publicationMeta = new PublicationMeta("Þursahamar. Bók 1","Einusinni var eitthvað og á að koma í nýrri línu");
		 
		 
		 model.addAttribute("storyText",publicationMeta.getText());
		 model.addAttribute("storyTitle",publicationMeta.getTitle());
		 
    	 return "soguheimur/viewStory";	
	    }
	 


}