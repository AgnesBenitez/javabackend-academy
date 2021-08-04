package operadores;

import operadores.MyDate;

public class DateTest {

    public static void main(String[] args) {
        MyDate m1 = new MyDate(2, 8, 2019);

        MyDate m2 = new MyDate(2, 8, 2019);

        MyDate m3 =null;

        if (m1 == m2) {

            System.out.println("m1==m2");

        } else {

            System.out.println("m1!=m2");

        }

        if (m1.equals(m2)) {

            System.out.println("m1 is equal to m2");

        } else {

            System.out.println("m1 is not equal to m2");

        }
      if(m1.equals(m3) || m2.equals(m3)==true) {

      System.out.println("m3 is equal to m1 or m2");

}else {

      System.out.println("m3 is not equal to m1 or m2");

}  
        
        

    }
}
