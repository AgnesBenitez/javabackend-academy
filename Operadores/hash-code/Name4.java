import java.util.*;

public class Name4 {
    private final String first, last;
	
    public Name4(String first, String last) {
        this.first = first;
        this.last = last;
    }
	
	public int hashCode() {
		return 63 * first.hashCode() + last.hashCode();
	}
	
    public boolean equals(Object o) {
        if (!(o instanceof Name4)) {
            return false;
		}
		
        Name4 n = (Name4)o;
        return n.first.equals(first) && n.last.equals(last);
    }
	
    public static void main(String[] args) {
        Set<Name4> s = new HashSet<Name4>();
        s.add(new Name4("Joshua", "Benitez"));
        System.out.println(s.contains(new Name4("Joshua", "Benitez")));
    }
}