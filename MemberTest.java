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
    
    @After
    public void tearDown() {
    }

    
}

