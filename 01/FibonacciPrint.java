/******************************  FibonacciPrint.java  *************************/

import AlgoTools.IO;
import java.io.*;
/**
 * @version 22.04.14
 *  
 * @author nbaumgartner
 */

public class FibonacciPrint {

  public static void main(String[] argv) {
   
    System.out.println("Fibonacci Folgen von f(0) bis f(n)");
    System.out.println();



    String line = null;
    int val = 0;

     int n = -1;
     while(n < 0){
      try {
        System.out.print("Bitte eine Zahl >= 0 : ");
        BufferedReader is = new BufferedReader( new InputStreamReader(System.in));
        line = is.readLine();
        val = Integer.parseInt(line);
        }

      catch (NumberFormatException ex){
        System.err.println("Keine gültige Nummer: " + line);
        }
      catch (IOException e) {
        System.err.println("Unerwarteter Fehler: " + e);
        }

      n = val;
      }

     Fibonacci obj = new Fibonacci();
     System.out.println();
     System.out.println("| n |  f(n)  |");
     System.out.println("+---+--------+");
     for(int i=0; i<n+1; i++){
      System.out.printf("|%3d|", i);
      System.out.printf("%8d|%n",obj.next());
      }
  }
}

