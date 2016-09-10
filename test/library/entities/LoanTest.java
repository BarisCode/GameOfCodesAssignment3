/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.entities;

import java.util.Date;
import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Nikul
 */
public class LoanTest {
    
    public LoanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of commit method, of class Loan.
     */
    @Test
    public void testCommit() {
        System.out.println("commit");
        int loanId = 0;
        Loan instance = null;
        instance.commit(loanId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of complete method, of class Loan.
     */
    @Test
    public void testComplete() {
        System.out.println("complete");
        Loan instance = null;
        instance.complete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOverDue method, of class Loan.
     */
    @Test
    public void testIsOverDue() {
        System.out.println("isOverDue");
        Loan instance = null;
        boolean expResult = false;
        boolean result = instance.isOverDue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkOverDue method, of class Loan.
     */
    @Test
    public void testCheckOverDue() {
        System.out.println("checkOverDue");
        Date currentDate = null;
        Loan instance = null;
        boolean expResult = false;
        boolean result = instance.checkOverDue(currentDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBorrower method, of class Loan.
     */
    @Test
    public void testGetBorrower() {
        System.out.println("getBorrower");
        Loan instance = null;
        IMember expResult = null;
        IMember result = instance.getBorrower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBook method, of class Loan.
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        Loan instance = null;
        IBook expResult = null;
        IBook result = instance.getBook();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Loan.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Loan instance = null;
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class Loan.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Loan instance = null;
        ELoanState expResult = null;
        ELoanState result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Loan.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Loan instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
