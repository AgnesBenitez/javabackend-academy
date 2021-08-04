/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author j.benitez.prudente
 */
public class Test {

    static int i;
    public static void main(String[] args) {
    person p = new person();
Integer x=10;
Integer y=10;
     Student s1 = new Student(1001);

     Student s2 = new Student(1001);
     Student s3=s1;

     System.out.println(s1.equals(p));

     System.out.println(s1.equals(s2));
boolean a=true;
     float f3[]={2.7f};
float f2[][]={{42.0f},{1.7f , 2.7f},{2.7f,2.7f}};
 if(f3==f2[2])
 {
    a=true; 
    System.out.println("es"+a);
 }
 else
 {
     a=false;
     System.out.println("es"+a);
 }

      System.out.println(f2[2]);
 
    }

 
                
         /*
 
        int temperature = 33;
	
		if(temperature < 0)
			System.out.println("Freezing");
		else if(temperature < 30)
			System.out.println("Pleasant");
		else if(temperature < 50)
			System.out.println("Hot");
		else
			System.out.println("Boiling");
	
	}
 */
    
}

