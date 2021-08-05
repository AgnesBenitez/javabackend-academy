class SobrecargaPrimitivos {
    public static void main(String[] args){
 
        byte byteVar = 10;
        short shortVar = 10;
        char charVar = 10;
        long longVar = 10;
        float floatVar = 10.0f;
 
        System.out.println ("\nmetodo (byteVar)\u003B");
        metodo (byteVar); //Llamada con un argumento byte
 
        System.out.println ("\nmetodo (shortVar)\u003B");
        metodo (shortVar); //Llamada con argumento short
 
        System.out.println ("\nmetodo (charVar)\u003B");
        metodo (charVar); //Llamada con argumento char
 
        System.out.println ("\nmetodo (longVar)\u003B");
        metodo (longVar); //Llamada con argumento long
 
        System.out.println ("\nmetodo (floatVar)\u003B");
        metodo (floatVar); //Llamada con argumento float
 
    }
 
 static void metodo (int v) { System.out.print ("-> amplia a int y ejecuta metodo (int v) \n");}
 static void metodo (long v) { System.out.print ("-> amplia a long y ejecuta metodo (long v) \n");}
 static void metodo (double v){System.out.print ("-> amplia a double y ejecuta metodo (double v)\n");}
 
}
