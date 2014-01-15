package net.tomoyamkung.jaxb.sample01;

import javax.xml.bind.JAXB;

import net.tomoyamkung.jaxb.sample01.BookWithNoSettter;

import org.junit.Before;
import org.junit.Test;

public class BookWithNoSetterTest {
	
	private BookWithNoSettter sut;

	@Before
	public void setUp() throws Exception {
		sut = new BookWithNoSettter("本のタイトル", "本の出版社");
	}

	@Test
	public void JAXBでmarshalする() throws Exception {
		JAXB.marshal(sut, System.out);
	}

}
