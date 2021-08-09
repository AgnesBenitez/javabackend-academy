package holamundo;

import java.util.Scanner;

public class CadenaNombre {
	public static void main (String args[]) {
		String nombre="";
		String n="";
		Scanner a=new Scanner(System.in);
		System.out.println("Ingresa tu nombre");
		nombre=a.nextLine();
		n=nombre.substring(0,1).toUpperCase();
		
	for(int i=0;i<nombre.length();i++)
		{
			if(nombre.charAt(i) == ' ')
			{
				n=n.concat(nombre.substring(i+1,i+2).toUpperCase());
				
			}
		}
		System.out.println(n);
	}
	
}
