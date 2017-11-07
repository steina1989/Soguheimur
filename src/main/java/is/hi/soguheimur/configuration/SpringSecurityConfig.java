package is.hi.soguheimur.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;

/**
 * 
 * @author Steina Dogg Vigfusdottir sdv6@hi.is
 * Oct 19, 2017
 * HBV501G Software Project 1 University of Iceland
 * 
 * Override the Spring Security configure method for the projects' purposes.
 * Create an instance of our custom authenticationProvider
 * and add it to the AuthenticationManagerBuilder instead of the default one.
 */
@Configuration
@EnableWebSecurity
@ComponentScan("is.hi.soguheimur.configuration")
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	
    @Autowired
    private SoguheimurAuthentProvider authProvider;
 
    @Override
    protected void configure(
      final AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authProvider);
    }


    /**
	 * Configure the behavior of the HttpSecurity.
	 */
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
	    http
	    	.authorizeRequests()
	    	.antMatchers("/css/**","/browse/**").permitAll()
	    	.antMatchers("/usr/**","/compose/**").hasRole("USER")
	    	.and()
	        .formLogin()
	        .loginPage("/login")
	        .failureUrl("/login-error")
	        .and()
	        .logout()
	        .logoutSuccessUrl("/");
	    
	}
	 

}