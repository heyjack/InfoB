/******************************  Test.java  ***********************************/

import AlgoTools.IO;

/**
 * @version 01.05.14
 *  
 * @author nbaumgartner
 */

public class Test {

  public static void main(String[] argv) {
     
     System.out.println("Fraction Test");
     System.out.println();
     System.out.println("fÃ¼nf = Fraction(5)");
     Fraction fÃ¼nf = new Fraction(5);
     System.out.println(fÃ¼nf.toString());
     System.out.println();
     System.out.println("fÃ¼nf multiply(2)");
     fÃ¼nf = fÃ¼nf.multiply(2);
     System.out.println(fÃ¼nf.toString());
     System.out.println();
     System.out.println("sechse = Fraction(2,12)");
     Fraction sechs = new Fraction(12,2);
     System.out.println(sechs.toString());
     System.out.println();
     System.out.println("(5*2)*6 = 60");
     Fraction a = fÃ¼nf.multiply(sechs);
     System.out.println(a.toString());
     System.out.println();
     System.out.println("Teilen durch Bruch (60*4)");
     System.out.println("(120/2) / (1/4) = 240");
     Fraction viertel = new Fraction(1,4);
     a = a.divide(viertel);
     System.out.println(a.toString());
     System.out.println();
     System.out.println("2/1 * 4/1 * 4/2 = 16/2");
     Fraction x = new Fraction(2,1);
     Fraction y = new Fraction(4,1);
     Fraction z = new Fraction(4,2);
     Fraction b = new Fraction(1,1);
     b = b.multiply(x , y , z);
     System.out.println(a.toString());
  }
}

