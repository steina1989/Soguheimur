package is.hi.byrjun.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ásgerður Inna aia11@hi.is
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Ólafur Konráð oka4@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 *         Model class for a user.
 */

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public User(String n, String l) {
		name = n;
	}

	@Override
	public String toString() {
		return String.format("<BR>" + "nafn: " + name + "<BR>" + "lykilord: ");
	}

}
