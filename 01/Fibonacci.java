/******************************  Fibonacci.java  *****************************/

import AlgoTools.IO;

/**
 * @version 22.04.14
 *  
 * @author nbaumgartner
 */

public class Fibonacci implements FibonacciInterface{

  private int n;

//Klassen Conrtuktor
  public Fibonacci(){
    n = 0;  //Anfangswert auf 0
  }

	/**
	 * @return gibt die Fib Zahl zurrück
	 */
  public int next(){
   n++;
   return(fib(n-1));  //Aufruf der Hauptfunktion
   }

	/**
	 * @return gibt die Nte Fib zahl zurrück
	 * @param int n die Nte fib zahl
	 */
  private int fib( int n){
    if(n <= 1){ 
      return n; //rekursions Anker
      }
    else{
      if(n > 46){   //Ausnahme bei großen Werten
      System.out.println("Maximaler Integer Wert überschritten!\nErgebnis über:");
      return 2147483647;
      }
      else{   //Rekursion
        return fib(n-1) + fib(n-2);   //Fib Formel
      }

    }
}

