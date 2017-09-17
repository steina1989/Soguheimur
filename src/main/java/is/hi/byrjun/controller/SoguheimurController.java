package is.hi.byrjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Authors:
 * Ásgerður Inna aia11@hi.is
 * Hrafnhildur Olga hoh44@hi.is
 * Ólafur Konráð oka4@hi.is
 * Steina Dögg sdv6@hi.is
 * 
 * Controller for the form.
 */

@Controller
@RequestMapping("/soguheimur") // Makes all path relative to /demo
public class SoguheimurController {
	
	 @RequestMapping("/create")
	 public String create(){
	    	return "soguheimur/createProfile";
	    }
}