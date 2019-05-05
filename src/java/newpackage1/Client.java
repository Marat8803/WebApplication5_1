/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name ="client")
@ SessionScoped
public class Client implements Serializable{
   private double a;
   private double b;



    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
   
   public double addition(){
       //System.out.println(a+b);
       return a+b;
   }
  
   public double subtraction (){
       //System.out.println(a-b);
       return a-b;
   }
   
   public double division(){
       double i = 0;
       try {
           i=a/b;
           //System.out.println(i);
       }
       catch (ArithmeticException ex){
           System.out.println(ex.toString());
       }
       return i;
   }
   
   public double multiplication(){
       //System.out.println(a*b);
       return a*b;
   }
}

