/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16221
 */
public class PrintDouble2_ss {

    public static void PrintInt(int N) {
        if (N >= 10) {
            PrintInt(N / 10);
        }
        printDigit(N % 10);
    }

    private static void printDigit(int i) {
        System.out.print(i);
    }

    private static void printOut(double N, int accuracy) {
        if (N < 0) {
            System.out.print("-");
            N = -N;

        }
        int n = (int) N;
        PrintInt(n);
        double decimal = N - n;
        if (decimal > 0) {
            System.out.print(".");
            double add = 0.5;
            for (int i = 0; i < accuracy; i++) {
                add = add / 10;
            }
            
            //=====================================================================
            System.out.println("=====N  "+N);
            N = N + add;
           System.out.println("=====N  "+N); 
          
            for (int i = 0; i < accuracy; i++) {
                decimal = decimal * 10;
            }
            PrintInt((int) decimal);
        }
    }

    public static void main(String[] args) {
        printOut(-1208.123456, 3);
    }

}
