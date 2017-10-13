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
@RequestMapping("/compose")
public class StoryCreationController {

	@Autowired
	PublicationService pubService;

	/*
	 * Returns the submitStory.jsp file.
	 */
	@RequestMapping("/newStory")
	public String Story() {
		return "create_story/createStory";
	}

	/**
	 * 
	 * When user wants to submit a story, it gets pushed to the database.
	 * 
	 * @param titill
	 * @param model
	 * @return a jsp page depending on success of user submition of a story.
	 * 
	 */
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String newStory(@RequestParam(value = "title") String title, @RequestParam(value = "text") String text) {

		PublicationMeta pub = new PublicationMeta(title, text);
		pubService.save(pub);
		return "create_story/submSuccess";
	} // Should probably do something else if saving fails

}
