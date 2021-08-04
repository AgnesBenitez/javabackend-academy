/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacion_objetos;

import orientacion_objetos.Top;

/**
 *
 * @author j.benitez.prudente
 */
public class Bottom2 extends Top{
    
    public Bottom2(String s) {
        super(s);
         System.out.println("D");
        
    }
     public static void main(String[] args) {
      new Bottom2("C");
      System.out.println(" ");
    
}
}
