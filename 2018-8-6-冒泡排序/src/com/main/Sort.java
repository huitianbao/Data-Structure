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
public class Sort {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("please input data:");
        String input = reader.nextLine();

        String a[] = input.split(" ");
        System.out.println("before sort================");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[ " + i + " ] = " + a[i]);

        }
        //
        String temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (Integer.parseInt(a[i]) > Integer.parseInt(a[j])) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
 System.out.println("after sort================");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[ " + i + " ] = " + a[i]);

        }
    }

}
