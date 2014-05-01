/******************************  Ticker.java  *********************************/

import AlgoTools.IO;

/**
 * @version 01.05.14
 *
 * @author nbaumgartner
 */

public class Ticker {

    private static Ticker instance = null;
    private boolean first;


    private Ticker(){
      first = true;
    }

    public static Ticker getInstance(){
      if(instance == null){
        instance = new Ticker();
      }
      return instance;
    }

    public void print(String text){
    text = text.replaceAll("\n", "");       //hierbei muss \n nicht maskiert werden (\\n)
                                            //Replace benötigt kein Regex
    if(!first){
      System.out.print("+++");
      }
    System.out.print(text);
    first = false;
    }


}
