
import java.io.PrintStream;

/******************************  FibonacciPrintConsole.java  *************************/



/**
 * @version 26.04.14
 *  
 * @author nbaumgartner,jguese
 */

public class FibonacciPrintConsole {
  

  public static void main(String[] argv) {
   
  


    String line = null;
    int val = 0;

     int n = -1;
     while(n < 0){
      try {
 
       
        line = argv[0];
        val = Integer.parseInt(line);
        }

      catch (NumberFormatException ex){
        System.err.println("Keine gültige Nummer: " + line);
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
