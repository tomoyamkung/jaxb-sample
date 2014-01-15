package net.tomoyamkung.jaxb.sample01;

import javax.xml.bind.JAXB;

import net.tomoyamkung.jaxb.sample01.BookWithPublicField;

import org.junit.Before;
import org.junit.Test;

public class BookWithPublicFieldTest {
	
	private BookWithPublicField sut;

	@Before
	public void setUp() throws Exception {
		sut = new BookWithPublicField();
		sut.title = "本のタイトル";
		sut.publisher = "本の出版社";
	}

	@Test
	public void JAXBでmarshalする() throws Exception {
		JAXB.marshal(sut, System.out);
	}

}
