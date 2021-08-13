import java.util.*;
public class EjemploTreeSet {
 
    public static void main (String[] args)
    {
        TreeSet<String> s3 = new TreeSet<String>();
        s3.add("Hola");
        s3.add("Hola amigo");
        s3.add("Encantado de conocerte");
        s3.add("Se me hace tarde");
        s3.add("Espero verte pronto");
        s3.add("Adios");
        s3.add("Adios"); //Intentamos añadir un duplicado.
 
        System.out.println("Numero de elementos: " + s3.size() + "\n");
 
        Iterator i = s3.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
 
        System.out.println ("\nlower(\"Encantado de conocerte\"): "
        + s3.lower("Encantado de conocerte"));
        System.out.println("floor(\"Encantado de conocerte\"): "
        + s3.floor("Encantado de conocerte"));
        System.out.println("higher(\"Encantado de conocerte\"): "
        + s3.higher("Encantado de conocerte"));
        System.out.println("ceiling(\"Encantado de conocerte\"): "
        + s3.ceiling("Encantado de conocerte"));
 
        // Devolvemos el set en orden descendente
        NavigableSet<String> reverse =   s3.descendingSet();
 
        //Lo mostramos
        Iterator r1 = reverse.iterator();
        while (r1.hasNext()){
            System.out.println(r1.next());
        }
 
        //Hacemos un pollFirst y pollLast
        //Devuelve y elimina el primer elemento
        System.out.println("\nreverse.pollFirst: " + reverse.pollFirst());
        //Devuelve y elimina el ultimo elemento
        System.out.println("reverse.pollLast: " + reverse.pollLast() + "\n");
 
        //Vemos cómo queda el set
        Iterator r2 = reverse.iterator();
        while (r2.hasNext()){
            System.out.println(r2.next());
        }
 
    }
}
