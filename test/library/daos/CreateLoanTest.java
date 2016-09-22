/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.daos;

import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.daos.ILoanDAO;
import library.interfaces.entities.ELoanState;
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
public class CreateLoanTest {
    
    Member member;
    Book book;
    ILoan iLoan;
    ILoanDAO loanDAO;
    
    @Before
    public void setUp() {
        book = new Book("Author1","ITC515","0055455",12345);
        member = new Member("James", "Mack", "046977777", "email1", 123);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreateLaon() {
    
        ELoanState expResult = ELoanState.PENDING;
        iLoan = loanDAO.createLoan(member, book);
        Loan loan = (Loan)iLoan;
        ELoanState result = loan.getState();
        assertEquals(expResult, result);
        System.out.println("Loan "+loan);
    }
}
