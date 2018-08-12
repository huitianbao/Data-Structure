/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.util.Scanner;

/**
 *
 * @author 16221
 */
public class Sort3_ss {

    public static void main(String[] args) {
        System.out.println("input data");

        Scanner reader = new Scanner(System.in);
        String inString = reader.nextLine();
        String[] a = inString.split(" ");

        System.out.println("before");
        for (int i = 0; i < a.length; i++) {

            System.out.println("a [ " + i + " ] =" + a[i]);

        }

        String tempString;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (Integer.parseInt(a[i]) > Integer.parseInt(a[j])) {
                    tempString = a[i];
                    a[i] = a[j];
                    a[j] = tempString;
                }

            }

        }
        System.out.println("after");
        for (int i = 0; i < a.length; i++) {

            System.out.println("a [ " + i + " ] =" + a[i]);

        }

    }

}
