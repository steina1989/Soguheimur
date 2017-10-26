package is.hi.soguheimur.configuration;

import java.util.Arrays;
import java.util.Collection;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Steina Dögg sdv@hi.is
 * 
 *         Description: A custom authentication provider, connecting Spring
 *         Security with our custom User model and relevant repository.
 */
@Component
public class SoguheimurAuthentProvider implements AuthenticationProvider {

	/**
	 * Compares the input credentials with those stored in the database.
	 * 
	 * @return null if user/password combo do not match, otherwise a new
	 *         authenticationToken which SpringSecurity will proceed to use during a
	 *         session. I believe this function is called every time a user enters a
	 *         page in which he needs authentication to load.
	 */
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		System.out.println("Authenticatinnnn");

		String name = authentication.getName();
		String password = authentication.getCredentials().toString();
		Collection<? extends GrantedAuthority> bla = authentication.getAuthorities();
		System.out.println(name);
		System.out.println(password);
		
		GrantedAuthority authorities = new SimpleGrantedAuthority("ROLE_USER");
		Collection<GrantedAuthority> collection = Arrays.asList(authorities);

		/*
		 * get user from repository by username if user.passhash != hash(password)
		 * return null else return a new usernamepwauthentiationtoken
		 */
		// return null;
		// author
		// Collection<? extends GrantedAuthority> authorities
		//
		UsernamePasswordAuthenticationToken a = new UsernamePasswordAuthenticationToken(
                name, password, collection);

		if (name.equals("admin") && password.equals("demo")) {
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
