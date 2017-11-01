package is.hi.soguheimur.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * Error controller
 * @author Steina Dogg Vigfusdottir sdv6@hi.is
 * Nov 1, 2017
 * HBV501G Software Project 1 University of Iceland
 *
 */
@Controller
public class SoguheimurErrorController implements ErrorController {
	
    @Autowired
    private ErrorAttributes errorAttributes;
    
    
	@RequestMapping(value = "/error")
	public String error(HttpServletRequest request, ModelMap model) {
		model.addAttribute("attributes",getErrorAttributes(request,false));
		return "Error/error";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
	
    /**
     * Fetches the request and its stack trace
     * @param includeStackTrace ef true þá er skilað stack trace annars ekki 
     * @return Map/Set of 2-tuples name/value pairs
     */
    private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
		RequestAttributes requestAttributes = new ServletRequestAttributes(request);
		return this.errorAttributes.getErrorAttributes(requestAttributes,
				includeStackTrace);
	}

}