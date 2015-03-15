package pony;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Кукуша on 10.03.2015.
 */
public class program {
    public static void main(String[] args) {
        int a = (int) (100 * Math.random());
        int vv;

   /*    Bottle Bottle1 = new Bottle(0.6);
        System.out.println("v:" + Bottle1.getVolume());
        System.out.println("f:"+Bottle1.getFill());
        Bottle1.addfill(0.7);
        System.out.println("f:"+Bottle1.getFill());
        Bottle1.removefill(0.1);
        System.out.println("f:"+Bottle1.getFill());
        boolean b= true;
      */  Scanner sc = new Scanner(System.in);
        while(b) {
            System.out.println(" Введите число");
            vv = sc.nextInt();
            if  (vv<a){
                System.out.println(" Данное число меньше а");
            } else if (vv>a) {
                System.out.println(" Данное число больше а");
            } else {
                System.out.print("Молодец");
                b= false;
            }
        }

 /*       for(int i = 0;  i<100; ++i){
            System.out.println(i);
        }

*/

    }
}
