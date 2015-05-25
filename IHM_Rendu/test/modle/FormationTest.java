/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modle;

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
    List<Module[]> mliste;
    
    public FormationTest() {
    }

     @Before
    public void testInit() {
        f = new Formation();
        mliste = null;
        
    }
    
    @Test
    public void testSetFormation(){
        System.out.println("Si cooperant tous les 2 ");
        f.SetFormation("",200,mliste);
        
    }
    
}
