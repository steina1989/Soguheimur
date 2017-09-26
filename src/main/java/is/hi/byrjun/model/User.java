package is.hi.byrjun.model;

import java.util.Date;

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
	
	private String fullName;
	private String userName;
	private Date bornDate;
	private String email;
	private String aboutMe;
	private String school;
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Date getBornDate() {
		return bornDate;
	}


	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAboutMe() {
		return aboutMe;
	}


	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getFullName() {
		return fullName;
	}
	

	public void setName(String name) {
		this.fullName = name;
	}

	public User(String n, String l) {
		fullName = n;
	}

	@Override
	public String toString() {
		return String.format("<BR>" + "nafn: " + fullName + "<BR>" + "lykilord: ");
	}

}
