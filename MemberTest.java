/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.entities;

import java.util.Date;
import java.util.List;
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
        member = new Member("James", "Mack", "046977777", "email1", 123);
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
    
    @Test
    public void testGetState() { // output should be BORROWING_ALLOWED as it is a default in constructor for new object
        String expResult = "BORROWING_ALLOWED";
        EMemberState result = member.getState();
        System.out.println(member.getState());
        assertEquals(String.valueOf(expResult), String.valueOf(result));
    }
    
    @Test
    public void testGetFirstName() {
        Member instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLastName() {
        Member instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetContactPhone() {
        Member instance = null;
        String expResult = "";
        String result = instance.getContactPhone();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetEmailAddress() {
        Member instance = null;
        String expResult = "";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetID() {
        Member instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHasOverDueLoans() {
        Member instance = null;
        boolean expResult = false;
        boolean result = instance.hasOverDueLoans();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHasReachedLoanLimit() {
        assertFalse(member.hasReachedLoanLimit());
    }
    
    @Test
    public void testHasFinesPayable() {
        assertFalse(member.hasFinesPayable());
    }
    
     @Test
    public void testHasReachedFineLimit() {
        assertFalse(member.hasReachedFineLimit());
    }
    
    @Test
    public void testGetFineAmount() {
        float expResult = 0.0F;
        float result = member.getFineAmount();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testGetLoans() {
        List<ILoan> expResult = Collections.<ILoan>emptyList(); 
        List<ILoan> result = member.getLoans();
        assertEquals(expResult, result);
    }
    
    @After
    public void tearDown() {
    }

    
}

