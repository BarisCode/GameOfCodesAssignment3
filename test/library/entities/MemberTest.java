/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.entities;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import library.interfaces.entities.ELoanState;
import library.interfaces.entities.EMemberState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author baris
 */
public class MemberTest {
    Loan instance;
    IBook book;
    IMember member;
    Date borrowDate, returnDate;
    
    public MemberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        book = new Book("Author1","ITC515","0055455",12345);
        member = new Member("James", "Mack", "046977777", "email@gmail.com", 123);
        borrowDate = new Date(2016,05,10);
        returnDate = new Date(2016, 07, 10);
        
        instance = new Loan(book, member, borrowDate, returnDate);
    }
    @Test
    public void testGetMember(){
        IMember expectedResult = member;
        IMember result = instance.getBorrower();
        assertEquals(expectedResult, result);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hasOverDueLoans method, of class Member.
     */
    @Test
    public void testHasOverDueLoans() {
        List<ILoan> list;
        Loan loan = new Loan(book, member, borrowDate, returnDate);
        assertFalse(member.hasOverDueLoans());
    }

    /**
     * Test of hasReachedLoanLimit method, of class Member.
     */
    @Test
    public void testHasReachedLoanLimit() {
        assertFalse(member.hasReachedLoanLimit());
    }

    /**
     * Test of hasFinesPayable method, of class Member.
     */
    @Test
    public void testHasFinesPayable() {
        assertFalse(member.hasFinesPayable());
    }

    /**
     * Test of hasReachedFineLimit method, of class Member.
     */
    @Test
    public void testHasReachedFineLimit() {
        assertFalse(member.hasReachedFineLimit());
    }

    /**
     * Test of getFineAmount method, of class Member.
     */
    @Test
    public void testGetFineAmount() {
        float expResult = 0.0F;
        float result = member.getFineAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getLoans method, of class Member.
     */
    @Test
    public void testGetLoans() {
        List<ILoan> expResult = Collections.<ILoan>emptyList(); 
        List<ILoan> result = member.getLoans();
        assertEquals(expResult, result);
    }
    /**
     * Test of getState method, of class Member.
     */
    @Test
    public void testGetState() { // output should be BORROWING_ALLOWED as it is a default in constructor for new object
        String expResult = "BORROWING_ALLOWED";
        EMemberState result = member.getState();
        System.out.println(member.getState());
        assertEquals(String.valueOf(expResult), String.valueOf(result));
    }

    /**
     * Test of getFirstName method, of class Member.
     */
    @Test
    public void testGetFirstName() {
        String expResult = "James";
        String result = member.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastName method, of class Member.
     */
    @Test
    public void testGetLastName() {
        String expResult = "Mack";
        String result = member.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getContactPhone method, of class Member.
     */
    @Test
    public void testGetContactPhone() {
        String expResult = "046977777";
        String result = member.getContactPhone();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmailAddress method, of class Member.
     */
    @Test
    public void testGetEmailAddress() {
        String expResult = "email@gmail.com";
        String result = member.getEmailAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getID method, of class Member.
     */
    @Test
    public void testGetID() {
        String expResult = "123";
        String result = String.valueOf(member.getID());
        assertNotNull(result);
        assertEquals(expResult, result);
    }
    
}