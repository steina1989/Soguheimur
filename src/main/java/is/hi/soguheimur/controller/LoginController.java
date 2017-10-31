package is.hi.soguheimur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import is.hi.soguheimur.model.User;
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
	public String temporaryDev() {
		return "redirect:compose/newStory";
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

	@RequestMapping("/dev")
	public String dev(Authentication authentication) {
		User user = new User("admin", "demo");
		userService.save(user);
		return "login";
	}

}
