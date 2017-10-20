package is.hi.soguheimur.configuration;

import java.util.Locale;
import org.springframework.core.SpringVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * @author Steina Dögg sdv6@hi.is
 * 
 * Description: Configuration for the Thymeleaf and Spring MVC.
 */

@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {
	
	@Bean
	/**
	 * Configuration and creation of the Thymeleaf template resolver.
	 * It 'resolves' a template into objects that contain its metadata, template mode
	 * and other configuration such as the suffix and encoding properties.
	 * @return Thymeleaf template resolver
	 */
	public ClassLoaderTemplateResolver templateResolver() {
		ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
		templateResolver.setPrefix("templates/WEB-INF/"); // 
		templateResolver.setCacheable(false); 
		templateResolver.setSuffix(".html"); 
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setCharacterEncoding("UTF-8");

		return templateResolver;
		

		
	}
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		super();
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

   @Bean
   /**
    *  Creating and configuring the Thymeleaf template engine
    *  which is integrated with spring.
    * @return the template engine 
    */
   public SpringTemplateEngine templateEngine() {
	   SpringTemplateEngine templateEngine= new SpringTemplateEngine();
	   templateEngine.setTemplateResolver(templateResolver());
	   return templateEngine;
   }
   
   @Bean
   /**
    * Creating and configuring the ThymeLeaf viewResolver.
    * Takes care of receiving the view objects and outputs them into
    * our html files.
    * @return a viewResolver
    */
   public ViewResolver viewResolver() {
	   ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
	   viewResolver.setTemplateEngine(templateEngine());
	   
	   viewResolver.setCharacterEncoding("UTF-8");
	   return viewResolver;
   }
   
   
   
}
