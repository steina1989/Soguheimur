package is.hi.byrjun.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Steina Dögg sdv6@hi.is
 * 
 * Description: Encapsulates metadata of a publication.
 */
@Entity
@Table(name="publicationMeta")
public class PublicationMeta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String title;
	private Date date;
	private int rating;
	private ArrayList<String> tags;
	private String text;
	
	public PublicationMeta(String title, String text)
	{
		this.title = title;
		this.text = text;
	}
	
	public PublicationMeta() {
		
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
