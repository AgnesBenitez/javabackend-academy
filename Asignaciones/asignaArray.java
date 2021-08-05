public class asignaArray{
  public static void main(String[] args){
      byte a = 3;
      short b = 30000;
      int c = 450;
      long d = 300000L;
      float e = 2500.203F;
      double f = 3234.25;
      char g = 'B';
      int [] enteros = new int[10];
      enteros[0] = a;
      enteros[1] = b;
      enteros[2] = c;
      enteros[3] = (int) d;
      enteros[4] = (int) e;v
      enteros[5] = (int) f;
      enteros[6] = g;
      enteros[7] = c/a;
      enteros[8] = (int) d/a;
      enteros[9] = (int) e/a;</p>
      for (int i = 0; i< enteros.length; i ++){
          System.out.println("enteros["+ i + "]: " + enteros[i]);
      }
    }
 }
