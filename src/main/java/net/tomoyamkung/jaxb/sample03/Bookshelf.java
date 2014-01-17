package net.tomoyamkung.jaxb.sample03;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

public class Bookshelf {
	
	private List<Book> books;
	
	public Bookshelf() {
		books = new ArrayList<Book>();
	}

	@XmlElementWrapper
	@XmlElement(name = "book")
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void add(Book book) {
		books.add(book);
	}

}
