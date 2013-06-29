package com.coolisland.castor.helloworld.books;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

public class ImprovedBook implements XmlSerializationInterface {
	private static Log log = LogFactory.getLog(ImprovedBook.class); 
	
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;

	private String ISBN = null;
	private String title = null;
	private List<Author> author = new ArrayList<>();
	
	public ImprovedBook() {
		String method = "ImprovedBook"; 
		log.debug("Starting " + method + " Constructor");
	}


	public ImprovedBook(String isbn, String title, List<Author> authors) {
		String method = "ImprovedBook"; 
		log.debug("Starting " + method + " Constructor with params");
		
		ISBN = isbn;
		this.title = title;
		this.author.addAll(authors);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author
				+ "]";
	}

	/**
	 * @return the iSBN
	 */
	public String getISBN() {
		String method = "getISBN"; 
		log.debug("Starting " + method);
		
		log.debug(method + " returning " + ISBN);
		
		return ISBN;
	}

	/**
	 * @param iSBN
	 *            the iSBN to set
	 */
	public void setISBN(String iSBN) {
		String method = "setISBN"; 
		log.debug("Starting " + method);
		
		ISBN = iSBN;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		String method = "getTitle"; 
		log.debug("Starting " + method);
		
		log.debug(method + " returning " + title);
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		String method = "setTitle"; 
		log.debug("Starting " + method);
		
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public List<Author> getAuthor() {
		String method = "getAuthor"; 
		log.debug("Starting " + method);
		
		log.debug(method + " returning " + author);
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(List<Author> authors) {
		String method = "setAuthor"; 
		log.debug("Starting " + method);
		
		this.author.addAll(authors);
	}


	@Override
	public void marshaller() {
		String method = "marshaller";
		log.debug("Starting " + method);
		
	}


	@Override
	public void unmarshaller() {
		String method = "unmarshaller";
		log.debug("Starting " + method);
		
		
	}


	public Marshaller getMarshaller() {
		String method = "getMarshaller";
		log.debug("Starting " + method);
		
		return marshaller;
	}


	public void setMarshaller(Marshaller marshaller) {
		String method = "setMarshaller";
		log.debug("Starting " + method);
		
		this.marshaller = marshaller;
	}

	
	public void setUnmarshaller(Unmarshaller unmarshaller) {
		String method = "setUnmarshaller";
		log.debug("Starting " + method);
		
		this.unmarshaller = unmarshaller;
	}
	
	public Unmarshaller getUnmarshaller() {
		String method = "getUnmarshaller";
		log.debug("Starting " + method);
		
		return unmarshaller;
	}
	
}
