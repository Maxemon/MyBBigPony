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
        System.out.print(a);
        boolean b= true;
        Scanner sc = new Scanner(System.in);
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
