package is.hi.soguheimur.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * @author Steina Dogg Vigfusdottir sdv6@hi.is
 * Oct 21, 2017
 * HBV501G Software Project 1 University of Iceland
 * 
 * A class for the body of the publication.
 * The only meta data yet is the story ID.
 * 
 */
@Entity
@Table(name="publicationText")
public class PublicationText {
	
	private long id;
	private String text;
	
	public PublicationText(long id, String text)
	{
		this.id = id;
		this.text = text;
	}
	
	public PublicationText() {
		
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}