package is.hi.soguheimur.configuration;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * @author Steina Dögg sdv6@hi.is
 * 
 * Configuration for the Locale functionality.
 */
@Configuration
public class LocaleConfiguration {
	
	/**
	 * 
	 * @return
	 */
	   @Bean
	   public LocaleResolver localeResolver() {
	       SessionLocaleResolver slr = new SessionLocaleResolver();
	       slr.setDefaultLocale(Locale.ROOT);
	       return slr;
	   }
}
