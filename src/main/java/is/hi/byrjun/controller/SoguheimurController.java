package is.hi.byrjun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import is.hi.byrjun.model.Notandi;
import is.hi.byrjun.services.SoguheimurService;

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
@RequestMapping("/soguheimur") // Makes all path relative to /soguheimur
public class SoguheimurController {
	
	 @Autowired
	    SoguheimurService soguheimurService;
	
	 @RequestMapping("/create")
	 public String create(){
	    	return "soguheimur/createProfile";
	    }
	 
	 
	 @RequestMapping("/logIn")
	 public String logIn(){
	    	return "soguheimur/logIn";
	    }
	 
	 @RequestMapping(value = "/welcome", method = RequestMethod.POST)
	    public String welcome(@RequestParam(value = "nafn", required = false)
	            String nafn, ModelMap model) {

	        if (soguheimurService.erNafnRett(nafn)) {
	            Notandi k = new Notandi(nafn, "1234");
	            model.addAttribute("notandi", k);
	            return "soguheimur/welcome";
	        } else {
	            model.addAttribute("nafn", nafn);
	            return "soguheimur/wrongUser";
	        }
	    }
}