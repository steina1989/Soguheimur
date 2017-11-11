package is.hi.soguheimur.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Steina Dögg sdv6@hi.is
 * 
 * Description: Encapsulates a Publication.
 * 
 */
@Entity
public class Publication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String title;
	private Date date;
	private int rating;
	private ArrayList<String> tags;
	@Basic(fetch = FetchType.LAZY )
	@Column(columnDefinition = "TEXT")
	private String text;	
	@ManyToOne(targetEntity=User.class)
	@JoinColumn(name="user_id")
	private User user;
 
	
	public Publication(String title, String text, User user)
	{
		this.title = title;
		this.text = text;
		this.user = user;
		this.date = new Date();
	}
	
	public Publication() {
		
	}
	
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}

	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public ArrayList<String> getTags() {
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}


	
	
	
}
