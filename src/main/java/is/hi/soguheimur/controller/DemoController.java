package is.hi.soguheimur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Ásgerður Inna aia11@hi.is
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Ólafur Konráð oka4@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 *         Controller for the form
 */

@Controller
@RequestMapping("/demo") // Makes all path relative to /demo
public class DemoController {

	// For learning purposes
	@RequestMapping("/notandi")
	public String notandi(Model model) {
		model.addAttribute("nafn", "Hrafnhildur");
		return "demo/synaNotandi";
	}

	// For learning purposes
	@RequestMapping("/spyrjaNotanda")
	public String spyrjaNotandi() {
		return "demo/hvadaNotandi";
	}

	// Returns a page with the input name
	@RequestMapping(value = "/hver", method = RequestMethod.POST)
	public String hver(@RequestParam(value = "nafn", required = false) String nafn, ModelMap model) {
		model.addAttribute("nafn", nafn);
		return "demo/synaNotandi";
	}

}
