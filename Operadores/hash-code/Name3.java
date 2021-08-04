import java.util.*;

public class Name3 {
    private final String first, last;
	
    public Name3(String first, String last) {
        this.first = first;
        this.last = last;
    }
	
    public boolean equals(Object o) {
        if (!(o instanceof Name3)) {
            return false;
		}
		
        Name3 n = (Name3)o;
        return n.first.equals(first) && n.last.equals(last);
    }
	
    public static void main(String[] args) {
        Set<Name3> s = new HashSet<Name3>();
        s.add(new Name3("Joshua", "Benitez"));
        System.out.println(s.contains(new Name3("Joshua", "Benitez")));
    }
}