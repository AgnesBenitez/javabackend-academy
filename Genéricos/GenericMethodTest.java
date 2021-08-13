public class GenericMethodTest {
    //Java generic Method, el cual regresa un boolean.
    public static <T> boolean isEqual (GenericType<T> g1, GenericType<T> g2){
        return g1.get().equals(g2.get());
    }
    public static void main(String[] args) {
        //creamos instancias a partir de la clase GenericType que creamos
     GenericType<String> g1 = new GenericType<String>();
     GenericType<String> g2 = new GenericType<String>();

     g1.set("abc");
     g2.set("abc");

     //Forma normal de llamar al metodo generico
     boolean isEqual = GenericMethodTest.<String>isEqual(g1,g2);
        System.out.println("isEquals(g1,g2) 1 of 2 "+ isEqual);
        //Forma 2 de llamar al medo generico
        isEqual = GenericMethodTest.isEqual(g1,g2);
        System.out.println("isEquals(g1,g2) 1 of 2 "+ isEqual);

    }
}
