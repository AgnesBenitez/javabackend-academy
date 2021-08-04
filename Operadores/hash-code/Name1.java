public class Name1 {
    private final String first, last;
	
    public Name1(String first, String last) {
        this.first = first;
        this.last = last;
    }
	
    public static void main(String[] args) {
		Name1 n1 = new Name1("Joshua", "Benitez");
		Name1 n2 = new Name1("Joshua", "Benitez");
        System.out.println("n1.equals(n2): " + n1.equals(n2));
		System.out.println("n1.hashCode() == n2.hashCode(): " + (n1.hashCode() == n2.hashCode()));
    }
}