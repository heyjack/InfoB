/******************************  Börse.java  **********************************/

import AlgoTools.IO;

/**
 * @version 01.05.14
 *
 * @author nbaumgartner
 */

public class Börse {

  public static void main(String[] argv) {

     Ticker News = Ticker.getInstance();
     Company Apple = new Company("Apple");
     Company Sony = new Company("Sony");
     Company King = new Company("Burger\n-King");

    System.out.println();
     News.print(Sony.changeStockPrice(350.0));
     News.print(Sony.changeStockPrice(210.3));
     News.print(Sony.changeStockPrice(5.4));
     News.print(Sony.changeStockPrice(5.4));

  //   News.print(Sony.insolvenz());

    System.out.println();
    System.out.println();




  }
}
