/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohamed
 */
public class platformTest {
    
    public platformTest() {
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
     * Test of name method, of class platform.
     */
    @Test
    public void testName() {
        System.out.println("Test name");
        int x = 1;
        String expResult = "PS4";
        String result = platform.name(x);
        assertEquals(expResult, result);
        System.out.println("Platform Unit Test 100%");
    }
    
}
