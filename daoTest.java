package library.test.unitTest.DAOobjects;

import static org.junit.Assert.*;

import org.junit.Test;

import library.daos.BookDAO;

public class daoTest {

	@Test
	public void test() {
		BookDAO bd = new BookDAO();
		bd.addBook("author1","titleX","001");
		bd.addBook("author2"," titleY","002");
		bd.addBook("author3", "titleZ", "003");
		bd.getBookByID(0);
		String s=bd.title1;
		assertEquals("The test fails","titleX",s);					//if helper is not null then test succeeds
		
	}

}
