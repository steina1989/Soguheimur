package is.hi.soguheimur.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import is.hi.soguheimur.services.PublicationService;

/**
 * Controller for the login at soguheimur
 * 
 * @author Steina Dögg sdv6@hi.is
 * 
 */

@Controller
@RequestMapping("/") //
public class LoginController {
	
	@RequestMapping("")
	public String blablablablablablal() {
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
		if (authentication != null) System.out.println(authentication.toString());
		else System.out.println("------Auth null-------");
		return "login";
	}

}
