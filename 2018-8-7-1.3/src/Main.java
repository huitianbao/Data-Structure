/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16221
 */
public class Main {
    public static void main(String[] args) {
        printOut(37);
        
    }
    public static void printOut(int n){
        if(n>=10){
            printOut(n/10);
        }
        printDigit(n%10);
    }

    private static void printDigit(int i) {
       // System.out.print(i);
    }
    
    
    public static void printoutDouble(double n){
        if(n>=10){
            printoutDouble(n/10);
        }
        printoutDouble(n%10);
    }
}
