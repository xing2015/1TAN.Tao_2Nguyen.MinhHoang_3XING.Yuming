/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle;

import model.Calendrier;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TAN
 */
public class CalendrierTest {
    
    Calendrier c;
    
    public CalendrierTest() {
    }
    
    @Before
    public void initTest(){
     c = new Calendrier(2015,5);
    }

  

    /**
     * Test of getAnnee method, of class Calendrier.
     */
    @Test
    public void testGetAnnee() {
        System.out.println("getAnnee");
        int expResult = 2015;
        int result = c.getAnnee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }



    /**
     * Test of getMois method, of class Calendrier.
     */
    @Test
    public void testGetMois() {
        System.out.println("getMois");
        int expResult = 5;
        int result = c.getMois();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getCalendrier method, of class Calendrier.
     */
    @Test
    public void testGetCalendrier() {
        System.out.println("getCalendrier");
        String[] expResult = {null,null,null,null,"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31",null,null,null,null,null,null,null};
        String[] result = c.getCalendrier();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
