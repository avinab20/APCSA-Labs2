
/**
 * Write a description of class Varsity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Varsity<E> extends CommonSports<E>
{
  
    String[] schools = {"ESD", "BL", "JPII", "TCA", "PCA"};

     public String opponent(){
         String opp = schools[(int)(Math.random()*5)];
         return opp;
    }
}
