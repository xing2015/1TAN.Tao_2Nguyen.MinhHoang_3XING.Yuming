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
     s = new Seance("2015-01-01" ,"matin", "JAVA","ESIAG");
    }


    /**
     * Test of getDate method, of class Seance.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        String expResult = "2015-01-01";
        String result = s.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getHeure method, of class Seance.
     */
    @Test
    public void testGetHeure() {
        System.out.println("getHeure");
    
        String expResult = "matin";
        String result = s.getHeure();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setDate method, of class Seance.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "2015-08-01";
        s.setDate(date);
        String expResult = "2015-08-01";
        String result = s.getDate();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setHeure method, of class Seance.
     */
    @Test
    public void testSetHeure() {
        System.out.println("setHeure");
        String heure = "apremidi";
        s.setHeure(heure);
        String result=s.getHeure();
        assertEquals("apremidi", result);
    }

    /**
     * Test of setModule method, of class Seance.
     */
    @Test
    public void testSetModule() {
        System.out.println("setModule");
        String module = "java";
        s.setModule(module);
        String result=s.getModule();
        assertEquals("java", result);
    }

    /**
     * Test of setFormation method, of class Seance.
     */
    @Test
    public void testSetFormation() {
        System.out.println("setFormation");
        String formation = "MIAGE";
        s.setFormation(formation);
     
        String result=s.getFormation();
        assertEquals("MIAGE", result);
    }

    /**
     * Test of getModule method, of class Seance.
     */
    @Test
    public void testGetModule() {
        System.out.println("getModule");    
        String expResult = "JAVA";
        String result = s.getModule();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getFormation method, of class Seance.
     */
    @Test
    public void testGetFormation() {
        System.out.println("getFormation");
       
        String expResult = "ESIAG";
        String result = s.getFormation();
        assertEquals(expResult, result);
        
    }
    /**
     * Test of getDate method, of class Seance.
     */
    
}
