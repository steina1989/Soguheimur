package is.hi.soguheimur.controller;

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
 * Controller for the composing part of the service.
 *  
 * @author Steina Dögg sdv6@hi.is
 * 
 */
@Controller
@RequestMapping("/compose")
public class ComposeController {

	private String parent = "compose/"; // The folder that gets prepended to returned strings.
	@Autowired
	PublicationService pubService;
	@Autowired
	UserService userService;

	/*
	 * Returns the submitStory file.
	 */
	@RequestMapping("/newStory")
	public String Story(ModelMap map) {
		map.addAttribute("story", new Publication());
		return parent + "composer";
	}

	/**
	 * Creates a new publication object and pushes it to the database with its owners' id.
	 * 
	 * @param title of the story
	 * @param text of the story
	 * @return
	 */
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String newStory(@RequestParam(value = "title") String title, @RequestParam(value = "text") String text) {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String email = authentication.getName();
		User user = userService.findUserByEmail(email);
		Publication pub = new Publication(title, text, user);
		pubService.save(pub);
		return parent + "submSuccess";
	}
	

	/**
	 * Loads a user story by id into the editor if the user owns it.
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String editStory(@RequestParam(value="id", required=true) long id, ModelMap map) {
		System.out.println(id);		
		Publication pub = pubService.findById(id);
		map.addAttribute("story", pub);
		return parent + "composer";
	}
	
	/**
	 * Loads a user story by id into the editor if the user owns it.
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String editStory(ModelMap map) {
		Publication pub = (Publication)map.get("publication");
		System.out.println(pub.getText());
		//map.addAttribute("story", pub);
		return parent + "composer";
	}


}
