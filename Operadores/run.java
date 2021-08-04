/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import ejercicio.Empleado;
import ejercicio.Persona;
import ejercicio.Tecnico;

/**
 *
 * @author j.benitez.prudente
 */
public class run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Persona p1 = new Persona();
Persona p2 = new Empleado();
Empleado e1 = new Empleado();
Tecnico t1 = new Tecnico();
Boolean b;

int nota = 10;
int tres=3;
String cuatro="4";
String resultado = (nota >= 65)? "Aprobado!!!" : "Suspenso";
System.out.println(resultado);
StringBuilder o =new StringBuilder("Joshua Benitez Prudente");
System.out.println(1+cuatro+(2+tres)+tres);
System.out.println(o.reverse());
/*
b = p1 is instanceof Modales;
b = p1 is instanceof Object;
b = p1 is instanceof Empleado;
b = p1 is instanceof Tecnico;
 
b = p2 is instanceof Persona;
b = p2 is instanceof Empleado;
b = p2 is instanceof Modales;
b = p2 is instanceof Tecnico;
 
b = e1 is instanceof Empleado;
b = e1 is instanceof Modales;
b = e1 is instanceof Persona;
b = e1 is instanceof Tecnico;
 
b = t1 is instanceof Persona;
b = t1 is instanceof Modales;
b = t1 is instanceof Empleado;
b = t1 is instanceof Tecnico;
 
b = null is instanceof Persona;
b = e1 is instanceof String;

*/











    }
    
}
