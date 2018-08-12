/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import java.util.Scanner;

/**
 *
 * @author 16221
 */
public class Sort2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("please input date");

        String input = reader.nextLine();
        String aString[] = input.split(" ");
        System.out.println("befor sort");
        for(int i=0;i<aString.length;i++){
            
            System.out.println("a[ "+i+" ] = "+aString[i]);
        }
        //sort
        String temp;
        for (int i = 0; i < aString.length; i++) {
            for (int j = 0; j < aString.length; j++) {
                if (Integer.parseInt(aString[i]) > Integer.parseInt(aString[j])) { 
                    temp = aString[i];
                    aString[i] = aString[j];
                    aString[j] = temp;
                }
            }
        }
        System.out.println("after sort");
        for(int i=0;i<aString.length;i++){
            System.out.println("a[ "+i+" ] = "+aString[i]);
        }

    }

}
