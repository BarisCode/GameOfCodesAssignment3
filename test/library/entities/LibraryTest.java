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
@RunWith(Suite.class)
@Suite.SuiteClasses({library.entities.MemberTest.class, library.entities.LoanTest.class})
public class LibraryTest {

    @Before
    public void setUp() throws Exception {
    }
    
}
