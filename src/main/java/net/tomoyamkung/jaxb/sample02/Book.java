package net.tomoyamkung.jaxb.sample02;

public class Book {

	/**
	 * タイトル。
	 */
	private String title;
	
	/**
	 * 出版社。
	 */
	private String publisher;

	/**
	 * ページ数。
	 */
	private int numberOfPages;

	/**
	 * デフォルトコンストラクタが無いと marshal 時に javax.xml.bind.DataBindingException が発生してしまう。
	 */
	public Book() {}

	public Book(String title, String publisher, int numberOfPages) {
		this.title = title;
		this.publisher = publisher;
		this.numberOfPages = numberOfPages;
	}

	public String getTitle() {
		return title;
	}

	/**
     * setter を定義しないと marshal することはできるが、このフィールドの値が出力されない。
     * 
     * @param title
     */
	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	/**
     * setter を定義しないと marshal することはできるが、このフィールドの値が出力されない。
     * 
     * @param publisher
     */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	/**
     * setter を定義しないと marshal することはできるが、このフィールドの値が出力されない。
     * 
     * @param numberOfPages
     */
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
}
