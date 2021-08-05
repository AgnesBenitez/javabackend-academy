
class PasoParametros{
 
    public static void main(String[] args){
 
    //Para un entero comprobamos que se modifica la copia, despues vuelve a su valor orig.
        int entero = 100;
        System.out.println("Antes de modificar: " + entero);
        modificar(entero);
        System.out.println("Despues de modificar: " + entero);
 
    //Para un array de un entero, comprobamos que con la copia de la referencia
    //podemos cambiar su contenido.
        int[] array = new int[1];
        array[0] = 100;
        System.out.println("\nAntes de modificar: " + array[0]);
        modificarContenido(array);
        System.out.println("Despues de modificar: " + array[0]);
 
    //Para el mismo array de entero, comprobamos que no podemos modificar la referencia.
        System.out.println("\nAntes de modificar: " + array[0]);
        modificar(array);
        System.out.println("Despues de modificar: " + array[0]);
 
    }
 
    static void modificar(int e){
        e = 200;
        System.out.println("Dentro de modificar: " + e);
    }
 
    static void modificarContenido(int[] a){
        a[0] = 200;
        System.out.println("Dentro de modificarContenido: " + a[0]);
    }
 
    static void modificar (int[] a){
    //Creamos un nuevo array "b" y hacemos que "a" apunte a este nuevo array.
    //Funciona solo dentro del metodo, puesto que "a" aquí es una copia.
        int[] b = new int[1];
        b[0] = 300;
        a = b;
        System.out.println("Dentro de modificar: " + a[0]);
    }
 
}