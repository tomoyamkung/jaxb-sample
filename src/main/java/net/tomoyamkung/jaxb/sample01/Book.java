package net.tomoyamkung.jaxb.sample01;

/**
 * 本を表すクラス。
 * 
 * @author tomoyamkung
 *
 */
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
	 * デフォルトコンストラクタが無いと marshal 時に javax.xml.bind.DataBindingException が発生してしまう。
	 */
	public Book() {}

	public Book(String title, String publisher) {
		this.title = title;
		this.publisher = publisher;
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
}
