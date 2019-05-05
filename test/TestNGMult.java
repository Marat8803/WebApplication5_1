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
public class TestNGMult {
    
@DataProvider (name="mult")
    public static Object [][] testData () {
    return new Object [][]{{1,4,4},{-20,-5,100}};
    }
    
    @Test (dataProvider = "mult")
    public void testAddition (double a, double b, double s){
        Client cl = new Client ();
        cl.setA(a);
        cl.setB(b);
        double res=cl.multiplication();
        assertEquals(res, s, "error");
    }
    
}
