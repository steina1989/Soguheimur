package is.hi.soguheimur.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import is.hi.soguheimur.model.PublicationMeta;
import is.hi.soguheimur.services.PublicationService;

/**
 * Controller for the project soguheimur
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 */
@Controller
@RequestMapping("/browse") // Makes all path relative to /browse
public class BrowsingController {
	
    @Autowired
    private MessageSource messageSource;

	@Autowired
	PublicationService pubService;
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/thdemo")
	public String viewDemo(ModelMap model) {
		model.addAttribute("message", "Hello world");
		return "demo/thdemo";
	}

	/*
	 * Returns a story by id.
	 */
	@RequestMapping(value = "/{id}")
	public String viewStory(@PathVariable("id") long id, ModelMap model) {

		PublicationMeta pmeta = pubService.findById(id);
		if (pmeta != null) {
			model.addAttribute("storyText", pmeta.getText());
			model.addAttribute("storyTitle", pmeta.getTitle());
		} else {
			model.addAttribute("storyText", "Sorry engin saga hér.");

		}

		return "browse/viewStory";
	}

}