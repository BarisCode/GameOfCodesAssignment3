package library.interfaces.daos;

import java.util.List;

import library.interfaces.entities.IBook;

public interface IBookDAO {
	
	public IBook addBook(String author, String title, String callNo);  // add book author name, title and number
	
	public IBook getBookByID(int id);	// returns book by Id number
	
	public List<IBook> listBooks();	// shows list of books
	
	public List<IBook> findBooksByAuthor(String author);	// Finds books by author 

	public List<IBook> findBooksByTitle(String title);	// finds books by book title
	
	public List<IBook> findBooksByAuthorTitle(String author, String title);	// finds books by author and book title

}
