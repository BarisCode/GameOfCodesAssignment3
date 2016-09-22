/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.entities;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Nikul
 */
 
 // Run with suite class
@RunWith(Suite.class)

// All test cases of the Loan class are added to suitecase to test a Loan entity.
@Suite.SuiteClasses({library.entities.GetIDTest.class, library.entities.GetBorrowerTest.class, library.entities.GetBookTest.class, library.entities.CompleteTest.class, library.entities.GetStateTest.class, library.entities.IsOverDueTest.class, library.entities.CheckOverDueTest.class})
public class LoanTest {

    @Before
    public void setUp() throws Exception {
    }
}
