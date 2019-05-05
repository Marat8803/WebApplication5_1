/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import newpackage1.Client;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author Marat
 */
public class TestNGAdd {
    
@DataProvider (name="add")
    public static Object [][] testData () {
    return new Object [][]{{1,4,5},{-20,-5,-25}};
    }
    
    @Test (dataProvider = "add")
    public void testAddition (double a, double b, double s){
        Client cl = new Client ();
        cl.setA(a);
        cl.setB(b);
        double res=cl.addition();
        assertEquals(res, s, "error");
    }
    
}
