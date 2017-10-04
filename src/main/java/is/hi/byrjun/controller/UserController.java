package is.hi.byrjun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
@RequestMapping("/soguheimur") // Makes all path relative to /soguheimur
public class UserController {
	
	 @Autowired
	 UserService userService;
	 @Autowired
	 PublicationService publicationService;	
	 
	
	/*
	 * Returns the createProfile.jsp file.
	 */
	 @RequestMapping("/create")
	 public String create(){
	    	return "soguheimur/createProfile";
	    }
	 
	 /**
	  * 
	  * @param username
	  * @param model
	  * @return a jsp page depending on success of user creation.
	  */
	 @RequestMapping(value = "/newUser", method = RequestMethod.POST)
	    public String newUser(@RequestParam(value = "username", required = false)
	            String username, ModelMap model) {

	        if (userService.checkValidName(username)) {
	            User k = new User(username, "1234");
	            model.addAttribute("notandi", k);
	            System.out.println("Saved the user");
	            userService.save(k);
	            return "soguheimur/newUser";
	        } else {
	            model.addAttribute("username", username);
	            return "soguheimur/registrationFailed";
	        }
	    }
	 
	 /**
	  * 
	  * @return the login page.
	  */
	 @RequestMapping("/logIn")
	 public String logIn(){
		 User i = new User ("admin", "123");
		 userService.save(i);
	    	return "soguheimur/logIn";
	    }
	 
	 /**
	  * Welcomes and adds a new user that has tried submit their registration details.
	  * @param username name of user
	  * @return welcome page or wrongUser page.
	  */
	 @RequestMapping(value = "/welcome", method = RequestMethod.POST)
	    public String welcome(@RequestParam(value = "username", required = false)
	            String username, ModelMap model) {
	        if (userService.checkValidName(username)) {
	            User k = new User(username, "1234");
	            
	            model.addAttribute("notandi", k);
	            return "soguheimur/welcome";
	        } else {
	            model.addAttribute("username", username);
	            return "soguheimur/error";
	        }
	    }
	 
		/*
		 * Returns the homePage.jsp file.
		 */
		 @RequestMapping("/homePage")
		 public String homePage(){
		    	return "soguheimur/homePage";
		    }
		 
		 /*
		 * Returns the submitStory.jsp file.
		 */
		 @RequestMapping("/story")
			 public String Story(){
			    	return "soguheimur/submitStory";
			    }
			 
		 /**
		  * 
		  * @param titill
		  * @param model
		  * @return a jsp page depending on success of user submition of a story.
		  * INCOMPLETE!!!
		  */
		 @RequestMapping(value = "/newStory", method = RequestMethod.POST)
		 public String newStory(@RequestParam(value = "title")
		 String title, @RequestParam(value="text") String text) {
			 
			 PublicationMeta pub = new PublicationMeta(title,text);
			 publicationService.save(pub);
			 return "soguheimur/newStory";
		 }
			 
		 /*
		  * Returns the error.jsp file.
		  */
		 @RequestMapping("/error")
		 	public String error(){
			    	return "soguheimur/error";
		 	}
}