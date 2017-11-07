package is.hi.soguheimur.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import is.hi.soguheimur.model.Publication;
import is.hi.soguheimur.model.User;
import is.hi.soguheimur.services.PublicationService;
import is.hi.soguheimur.services.UserService;

/**
 * Controller for the project soguheimur
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 */

@Controller
@RequestMapping("/usr") // Makes all path relative to /usr
public class UserController {

	private String parent = "user_profile/"; // The folder that gets prepended to returned strings.

	@Autowired
	UserService userService;
	@Autowired
	PublicationService publicationService;

	/*
	 * Returns the createProfile.jsp file.
	 */
	@RequestMapping("/create")
	public String create() {
		return parent + "createProfile";
	}

	/**
	 * 
	 * @param username
	 * @param model
	 * @return a jsp page depending on success of user creation.
	 */
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String newUser(@RequestParam(value = "username", required = false) String username, ModelMap model) {

		if (userService.checkValidName(username)) {
			User k = new User(username, "1234");
			model.addAttribute("notandi", k);
			System.out.println("Saved the user");
			userService.save(k);
			return parent + "newUser";
		} else {
			model.addAttribute("username", username);
			return parent + "registrationFailed";
		}
	}

	/**
	 * 
	 * @return the login page.
	 */
	@RequestMapping("/logIn")
	public String logIn() {
		User i = new User("admin", "123");
		userService.save(i);
		return parent + "logIn";
	}

	/**
	 * Welcomes and adds a new user that has tried submit their registration
	 * details.
	 * 
	 * @param username
	 *            name of user
	 * @return welcome page or wrongUser page.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String welcome(@RequestParam(value = "username", required = false) String username, ModelMap model) {
		if (userService.checkValidName(username)) {
			User k = new User(username, "1234");

			model.addAttribute("notandi", k);
			return parent + "welcome";
		} else {
			model.addAttribute("username", username);
			return parent + "/error"; // To do, there is no such page.
		}
	}

	/*
	 * Fetches list of stories by a username and returns the homePage with it.
	 */
	@RequestMapping("/homePage")
	public String homePage(ModelMap model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null) {
			String email = authentication.getName();
			User user = userService.findUserByEmail(email);
			List<Publication> list = user.getPublications();
			model.addAttribute("stories", list);
			return parent + "homePage";
		}
		return parent + "homePage";

	}

}