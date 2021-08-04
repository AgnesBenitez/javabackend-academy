public class Name2 {
    private final String first, last;
	
    public Name2(String first, String last) {
        this.first = first;
        this.last = last;
    }
	
	public boolean equals(Object o) {
        if (!(o instanceof Name2)) {
            return false;
		}
		
        Name2 n = (Name2)o;
        return n.first.equals(first) && n.last.equals(last);
    }
	
    public static void main(String[] args) {
		Name2 n1 = new Name2("Joshua", "Benitez");
		Name2 n2 = new Name2("Joshua", "Benitez");
        System.out.println("n1.equals(n2): " + n1.equals(n2));
		System.out.println("n1.hashCode() == n2.hashCode(): " + (n1.hashCode() == n2.hashCode()));
    }
}