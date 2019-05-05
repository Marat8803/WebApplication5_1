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
public class TestNGSub {
    
@DataProvider (name="sub")
    public static Object [][] testData () {
    return new Object [][]{{1,4,-3},{-20,-5,-15}};
    }
    
    @Test (dataProvider = "sub")
    public void testAddition (double a, double b, double s){
        Client cl = new Client ();
        cl.setA(a);
        cl.setB(b);
        double res=cl.subtraction();
        assertEquals(res, s, "error");
    }
    
}
