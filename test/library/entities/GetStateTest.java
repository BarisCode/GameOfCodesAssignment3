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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nikul
 */
public class GetStateTest {
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testGetState() {  
        IBook book = new Book("Author1","ITC515","0055455",12345);
        IMember member = new Member("James", "Mack", "046977777", "email1", 123);
        Date borrowDate = new Date(2016,05,10);
        Date returnDate = new Date(2016, 07, 10);
        
        Loan instance = new Loan(book, member, borrowDate, returnDate);
        
        ELoanState expResult = ELoanState.PENDING;
        ELoanState result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }    
}
