/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16221
 */
public class MyThoughtSS {

    //huoqu   decimal   zhihou
    //  decimal*10  jingdu   zai diaoyong   print int
    private static void PrintDigit(int n) {
        System.out.print(n);
    }

    private static void PrintOut(int n) {
        if (n >= 10) {
            PrintOut(n / 10);
        }
        PrintDigit(n % 10);
    }

    private static void PrintDouble(double n, int accuracy) {
        if (n < 0) {
            System.out.print("-");
            n = (-n);
        }
        int N = (int) n;
        PrintOut(N);

        double decminal = n - N;
        for (int i = 0; i < accuracy; i++) {
            decminal = decminal * 10;
        }
        int an = (int) decminal;
        System.out.print(".");
        PrintOut(an);

    }

    public static void main(String[] args) {
        PrintOut(37);
        System.out.println("");
        PrintDouble(-128.123456, 5);
    }
}
