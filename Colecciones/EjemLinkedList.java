import java.util.*;
public class EjemLinkedList {
    public static void main (String[] args){
        LinkedList nombres = new LinkedList();
        nombres.add("Ana");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.addFirst("Elena"); //insertamos al ppio.
        nombres.addLast("Bea"); //insertamos al final.
        nombres.add(2, "Lola"); //insertamos en posicion x
 
        System.out.println("\nContenido: " + nombres);
        System.out.println("getFirst(): " + nombres.getFirst());
        System.out.println("getLast(): " + nombres.getLast());
 
        System.out.println("\nHacemos peek(): " + nombres.peek());
        System.out.println("Contenido: " + nombres);
 
        System.out.println("\nHacemos poll(): " + nombres.poll());
        System.out.println("Contenido: " + nombres);
 
        System.out.println("\nHacemos offer(): " + nombres.offer("Luis"));
        System.out.println("Contenido: " + nombres);
 
    }
}
