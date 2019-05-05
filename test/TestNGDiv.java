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
public class TestNGDiv {
    
 @DataProvider (name="div")
    public static Object [][] testData () {
    return new Object [][]{{4,2,2},{-20,-5,4}};
    }
    
    @Test (dataProvider = "div")
    public void testAddition (double a, double b, double s){
        Client cl = new Client ();
        cl.setA(a);
        cl.setB(b);
        double res=cl.division();
        assertEquals(res, s, "error");
    }
    
}
