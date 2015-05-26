/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import model.Module;
import java.lang.String;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author xing
 */
public class ModuleTest {
    Module m;
    
    @Before
    public void initTest(){
     m = new Module("Java","java","red",100,200);
    }
    
    
    public ModuleTest() {
       
    }

    /**
     * Test of getNom method, of class Module.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");       
        String expResult = "Java";
        String result = m.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setNom method, of class Module.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "C++";
        m.setNom(nom);
        String expResult = "C++";
        String result = m.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getAbbreviation method, of class Module.
     */
    @Test
    public void testGetAbbreviation() {
        System.out.println("getAbbreviation");      
        String expResult = "java";
        String result =  m.getAbbreviation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setAbbreviation method, of class Module.
     */
    @Test
    public void testSetAbbreviation() {
        System.out.println("setAbbreviation");
        String abbreviation = "c";
        m.setAbbreviation(abbreviation);
        String result =  m.getAbbreviation();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("c", result);
    }

    /**
     * Test of getCouleur method, of class Module.
     */
    @Test
    public void testGetCouleur() {
        System.out.println("getCouleur");
        String result = m.getCouleur();
        assertEquals("red", result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setCouleur method, of class Module.
     */
    @Test
    public void testSetCouleur() {
        System.out.println("setCouleur");
        String couleur = "blue";
        m.setCouleur(couleur);
        String result = m.getCouleur();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("blue", result);
    }

    /**
     * Test of getNbSeance method, of class Module.
     */
    @Test
    public void testGetNbSeance() {
        System.out.println("getNbSeance");
        int expResult = 100;
        int result = m.getNbSeance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of setNbSeance method, of class Module.
     */
    @Test
    public void testSetNbSeance() {
        System.out.println("setNbSeance");
        int nbSeance = 0;  
        m.setNbSeance(nbSeance);
        // TODO review the generated test code and remove the default call to fail.
      assertEquals(0,m.getNbSeance());

    }
    
}
