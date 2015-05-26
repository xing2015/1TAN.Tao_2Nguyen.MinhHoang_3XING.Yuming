/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modle;

/*import static java.awt.Color."blue";
import static java.awt.Color."red";*/
import model.Module;
import model.Formation;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author xing
 */
public class FormationTest {
    Formation f;
    List<Module> mliste;
    Module m1;
    Module m2;
   

     @Before
    public void testInit() {
        f = new Formation();
        mliste = null;
        m1 =new Module("Java","java","red",100,150);
        m2 =new Module("Base de données","BD","blue",100,150);
        
    }
     public FormationTest() {
    }
     
    /**
     * Test of setNom method, of class Formation.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "Miage";
        f.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("Miage",f.nom);
    }

    /**
     * Test of setDuree method, of class Formation.
     */
    @Test
    public void testSetDuree() {
        System.out.println("setDuree");
        int duree = 100;
        Formation instance = new Formation();
        instance.setDuree(duree);
        // TODO review the generated test code and remove the default call to fail.
         assertEquals(100,instance.duree);
    }

    /**
     * Test of setListeModule method, of class Formation.
     */
    @Test
    public void testSetListeModule() {
        System.out.println("setListeModule");
        mliste =  new ArrayList<Module>();
        mliste.add(m1);
        mliste.add(m2);
        f.setListeModule(mliste);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("Java",f.listeModule.get(0).getNom());
        assertEquals("java",f.listeModule.get(0).getAbbreviation());
        assertEquals("red",f.listeModule.get(0).getCouleur());
        assertEquals(100,f.listeModule.get(0).getNbSeance());
    }

    /**
     * Test of getNom method, of class Formation.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Formation instance = new Formation();
        instance.nom = "C";
        String expResult = "C";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getDuree method, of class Formation.
     */
    @Test
    public void testGetDuree() {
        System.out.println("getDuree");
        Formation instance = new Formation();
        instance.duree =0;
        int expResult = 0;
        int result = instance.getDuree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

 
    

  
    
}
