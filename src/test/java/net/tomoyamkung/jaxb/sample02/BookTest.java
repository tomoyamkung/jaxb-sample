package net.tomoyamkung.jaxb.sample02;

import javax.xml.bind.JAXB;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
	
	private Book sut;

	@Before
	public void setUp() throws Exception {
		sut = new Book("本のタイトル", "本の出版社", 208);
	}

	@Test
	public void JAXBでmarshalする() throws Exception {
		JAXB.marshal(sut, System.out);
	}

}
