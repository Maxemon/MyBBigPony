package pony;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Кукуша on 10.03.2015.
 */
public class program {
    public static void main(String[] args) {


       Bottle Bottle1 = new Bottle(0.6);
        System.out.println("v:" + Bottle1.getVolume());
        System.out.println("f:"+Bottle1.getFill());
        Bottle1.addfill(0.7);
        System.out.println("f:"+Bottle1.getFill());
        Bottle1.removefill(0.1);
        System.out.println("f:"+Bottle1.getFill());
        boolean b= true;
      

 /*       for(int i = 0;  i<100; ++i){
            System.out.println(i);
        }

*/

    }
}
