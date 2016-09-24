/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.daos;

import java.util.Date;
import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.daos.ILoanDAO;
import library.interfaces.daos.ILoanHelper;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nikul
 */
public class GetLoanByIDTest {
    
    // Create the required references.
    ILoanHelper helper;
    ILoanDAO dao;
    ILoan instance;
    IBook book;
    IMember member;
    Date borrowDate, returnDate;
    
    // Set up the book, member, loanMapDao object.
    @Before
    public void setUp(){
        book = new Book("Author1","ITC515","0055455",12345);
        member = new Member("James", "Mack", "046977777", "email1", 123);
        borrowDate = new Date(2016,05,10);
        returnDate = new Date(2016, 07, 10);
        
       // instance = helper.makeLoan(book, member, borrowDate, returnDate);
       dao = new LoanMapDAO(helper);
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    // Test the getLoanByID() method of the LoanMapDAO class
    @Test
    public void testGetLoanByID() {
        
    }
}
