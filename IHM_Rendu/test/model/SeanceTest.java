/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import model.Seance;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author xing
 */
public class SeanceTest {
       Seance s;
    
    public SeanceTest() {
    }
    @Before
    public void initTest(){
    // s = new Seance(2, 05/2015/05,"3h", "JAVA","ESIAG");
    }
    /**
     * Test of getDate method, of class Seance.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Seance instance = new Seance();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeure method, of class Seance.
     */
    @Test
    public void testGetHeure() {
        System.out.println("getHeure");
        Seance instance = new Seance();
        String expResult = "";
        String result = instance.getHeure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
