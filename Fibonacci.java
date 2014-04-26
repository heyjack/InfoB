/******************************  Fibonacci.java  *****************************/

import AlgoTools.IO;

/**
 * @version 22.04.14
 *  
 * @author nbaumgartner
 */

public class Fibonacci implements FibonacciInterface{

  int n;

  public Fibonacci(){
    n = 0;
  }

  public int next(){
   n++;
   return(fib(n-1));
   }

  private int fib( int n){
    if(n <= 1){
      return n;
      }
    else{
      return fib(n-1) + fib(n-2);
      }

    }
}

