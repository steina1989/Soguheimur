package is.hi.soguheimur.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;

@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(final HttpSecurity http) throws Exception {
	    http
	    	.authorizeRequests()
	    	.antMatchers("/css/**","/browse/**").permitAll()
	    	.antMatchers("/usr/**").hasRole("USER")
	    	.and()
	        .formLogin()
	        .loginPage("/login")
	        .failureUrl("/login-error")
	      .and()
	        .logout()
	        .logoutSuccessUrl("/index");
	}
	
	
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception  {
        auth
            .inMemoryAuthentication()
	            .withUser("admin").password("demo").roles("USER");
    }

}