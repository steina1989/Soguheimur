package is.hi.byrjun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import is.hi.byrjun.model.User;
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
	            return "soguheimur/wrongUser";
	        }
	    }
}