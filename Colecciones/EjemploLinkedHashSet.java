import java.util.*;
public class EjemploLinkedHashSet {
 
    public static void main (String[] args)
    {
        LinkedHashSet<String> s2 = new LinkedHashSet <String>();
        s2.add("Hola");
        s2.add("Hola amigo");
        s2.add("Encantado de conocerte");
        s2.add("Se me hace tarde");
        s2.add("Espero verte pronto");
        s2.add("Adios");
 
        s2.add("Adios"); //Intentamos añadir un duplicado.
 
        System.out.println("Numero de elementos: " + s2.size() + "\n");
 
        Iterator i = s2.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
