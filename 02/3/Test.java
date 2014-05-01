/******************************  Test.java  ***********************************/

import AlgoTools.IO;

/**
 * @version 01.05.14
 *  
 * @author nbaumgartner
 */

public class Test {

  public static void main(String[] argv) {
     
     StringStack test = new StringStack();
     test.push("unten");
     test.push("1");
     test.push("2");
     test.push("oben");
  
     StringStack copy = new StringStack();
     copy = test.deepcopy();

     System.out.println();
     System.out.println("Orginal");
      while(!test.empty()){
        System.out.println(test.peek());
        test.pop();
      }

     System.out.println();
     System.out.println("DeepCopy");
      while(!copy.empty()){
        System.out.println(copy.peek());
        copy.pop();
      }


/*
     System.out.println("test: "+test.peek());
     System.out.println("copy: "+test.peek());
     System.out.println();
     test.pop();
     copy.pop();

     System.out.println("lÃ¶sche test: "+test.peek());
     test.pop();

     System.out.println("test: "+test.peek());
     System.out.println("copy: "+test.peek());

     System.out.println();
     test.pop();
     copy.pop();
 
     System.out.println("test: "+test.peek());
     System.out.println("copy: "+copy.peek());

     System.out.println();
     test.pop();
     copy.pop();

     boolean leer = test.empty();
     String s = "nein";
     if(leer) {
       s = "ja";
     }
     System.out.println("test leer?: "+s);
     System.out.println("copy: "+test.peek());
     System.out.println();
     copy.pop();

     System.out.println("copy: "+test.peek());
*/
  }
}

