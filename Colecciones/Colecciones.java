package holamundo;

public class Colecciones {
	public static void main (String[] args)
    {
        HashSet<String> s1 = new HashSet <String>();
        s1.add("Hola");
        s1.add("Hola amigo");
        s1.add("Encantado de conocerte");
        s1.add("Se me hace tarde");
        s1.add("Espero verte pronto");
        s1.add("Adios");
 
        s1.add("Adios"); 
 
        System.out.println("Numero de elementos: " + s1.size() + "\n");
 
        Iterator i = s1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
