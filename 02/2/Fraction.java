/******************************  Fraction.java  *******************************/

import AlgoTools.IO;

/**
 * @version 01.05.14
 *  
 * @author nbaumgartner
 */

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int i){
      this.numerator = i;
      this.denominator = 1;
    }

    public Fraction(int i, int d){
      this(i);
      this.denominator = d;
    }

    public Fraction multiply(int factor){
      Fraction rÃ¼ck = new Fraction(this.getNum()*factor ,this.getDen());
      return rÃ¼ck;
    }

    public Fraction multiply(Fraction factor){
      int num = factor.getNum();
      int den = factor.getDen();
      Fraction rÃ¼ck = new Fraction(this.getNum()*factor.getNum(), this.getDen()*factor.getDen() );
      return rÃ¼ck;
    }

    public Fraction divide(Fraction divisor){
      int num = divisor.getNum();
      int den = divisor.getDen();
      //DUrch einen bruch wird geteilt, indem man den Kehrwert multipliziert
      Fraction rÃ¼ck = new Fraction(this.getNum()*divisor.getDen(), this.getDen()*divisor.getNum());
      return rÃ¼ck;
    }

    public Fraction multiply(Fraction... factors){
    Fraction ergebnis = new Fraction(this.getNum(), this.getDen());
      for(int i=0; i<factors.length; i++){
        ergebnis = ergebnis.multiply(factors[i]);
      }
    return ergebnis;
    }

    public String toString(){
      String rÃ¼ck = (""+getNum()+"/"+getDen());
      return rÃ¼ck;
    }


//GETTER
    public int getNum(){
      return this.numerator;
    }

    public int getDen(){
      return this.denominator;
    }
}

