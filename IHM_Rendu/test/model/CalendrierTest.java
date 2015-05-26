/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IT
 */
public class CalendrierTest {
    
    public CalendrierTest() {
    }
    
  

    /**
     * Test of setAnnee method, of class Calendrier.
     */
    @Test
    public void testSetAnnee() {
        System.out.println("setAnnee");
        int annee = 0;
        Calendrier instance = new Calendrier();
        instance.setAnnee(annee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnee method, of class Calendrier.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        Calendrier instance = new Calendrier();
        int expResult = 0;
        int result = instance.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMois method, of class Calendrier.
     */
    @Test
    public void testSetMois() {
        System.out.println("setMois");
        int mois = 0;
        Calendrier instance = new Calendrier();
        instance.setMois(mois);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMois method, of class Calendrier.
     */
    @Test
    public void testGetMois() {
        System.out.println("getMois");
        Calendrier instance = new Calendrier();
        int expResult = 0;
        int result = instance.getMois();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalendrier method, of class Calendrier.
     */
    @Test
    public void testGetCalendrier() {
        System.out.println("getCalendrier");
        Calendrier instance = new Calendrier();
        String[] expResult = null;
        String[] result = instance.getCalendrier();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
