package is.hi.soguheimur.configuration;

import java.util.Arrays;
import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import is.hi.soguheimur.model.User;
import is.hi.soguheimur.services.UserService;

/**
 * 
 * @author Steina Dögg sdv@hi.is
 * 
 *         Description: A custom authentication provider, connecting Spring
 *         Security with our custom User model and relevant repository.
 */
@Component
public class SoguheimurAuthentProvider implements AuthenticationProvider {
	@Autowired UserService userService;

	/**
	 * Compares the input credentials with those stored in the database.
	 * 
	 * @return null if user/password combo do not match, otherwise a new
	 *         authenticationToken which SpringSecurity will proceed to use during a
	 *         session.
	 */
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		System.out.println("Authenticating");

		String name = authentication.getName();
		String password = authentication.getCredentials().toString();

		User user = userService.findUserByUsername(name);
		
		GrantedAuthority authorities = new SimpleGrantedAuthority("ROLE_USER");
		Collection<GrantedAuthority> collection = Arrays.asList(authorities);

		if (name.equals(user.getUserName()) && password.equals(user.getPasswordHash())) {
			UsernamePasswordAuthenticationToken a = new UsernamePasswordAuthenticationToken(
	                name, password, collection);
			return a;
		}
		else return null;
	}

	/**
	 * supports is an abstract method which needs to be implemented.
	 */
	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
