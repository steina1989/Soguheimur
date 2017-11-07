package is.hi.soguheimur.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import is.hi.soguheimur.model.User;
import is.hi.soguheimur.services.PasswordEncoder;
import is.hi.soguheimur.services.UserService;

/**
 * Controller for the login at soguheimur
 * 
 * @author Steina Dögg sdv6@hi.is
 * 
 */

@Controller
@RequestMapping("/") //
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping("")
	public String home() {
		return "home/home";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}


	// Login form with error
	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String registerPost(ModelMap model, User user) {
		if (!userService.existsUserName(user))  {
			String nonCrypt = user.getPasswordHash();
			String encrypted = PasswordEncoder.createEncodedPassword(nonCrypt);
			user.setPasswordHash(encrypted);
			userService.save(user);	
			model.addAttribute("success",true);
		}
		model.addAttribute("success",false);
		
		return "register";
	}
	

	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String registerGet(ModelMap model, User user) {
		return "register";
	}
	

}
