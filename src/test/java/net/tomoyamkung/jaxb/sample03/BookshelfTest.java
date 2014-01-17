package net.tomoyamkung.jaxb.sample03;

import javax.xml.bind.JAXB;

import org.junit.Before;
import org.junit.Test;

public class BookshelfTest {
	
	private Bookshelf sut;

	@Before
	public void setUp() throws Exception {
		sut = new Bookshelf();
		sut.add(new Book("本のタイトル１", "本の出版社１", 208));
		sut.add(new Book("本のタイトル２", "本の出版社２", 2080));
		sut.add(new Book("本のタイトル３", "本の出版社３", 20800));
	}

	@Test
	public void JAXBでmarshalする() throws Exception {
		JAXB.marshal(sut, System.out);
	}

}
