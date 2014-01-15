package net.tomoyamkung.jaxb.sample01;

public class BookWithNoSettter {

	/**
	 * タイトル。
	 */
	private String title;
	
	/**
	 * 出版社。
	 */
	private String publisher;

	public BookWithNoSettter() {}

	public BookWithNoSettter(String title, String publisher) {
		this.title = title;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
