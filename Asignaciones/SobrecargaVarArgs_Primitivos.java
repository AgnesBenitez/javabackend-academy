class SobrecargaVarArgs_Primitivos {
 
public static void main (String[] args){
 
int intVar = 10;
 
System.out.println ("\nmetodo (intVar)\u003B");
metodo (intVar);
 
}
 
 static void metodo (long v) { System.out.print ( "-> amplia a long y ejecuta metodo (long v) \n");}
 static void metodo (int ... v) {System.out.print ( "-> ejecuta metodo (int.. v) \n");}
 
}
