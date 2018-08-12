/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018.pkg08.pkg03.选择问题;

import java.util.Scanner;

/**
 *
 * @author 16221
 */

//1
// 方法一   对输入的数据排序，冒泡
public class Select2 {
    public static void main(String[] args) {
        System.out.println("请输入 N个数，空格隔开");
        Scanner reader = new Scanner(System.in);
        String in = reader.nextLine();
        System.out.println("请输入k");
        int k = Integer.parseInt(reader.next().toString());

        String a[] = in.split(" ");
        System.out.println("before");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a [ " + i + " ] = " + a[i]);

        }
        
        //排序了
        String tempString;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (Integer.parseInt(a[i])>Integer.parseInt(a[j])) {
                    tempString=a[i];a[i]=a[j];a[j]=tempString;
                }
                
            }
            
        }
        System.out.println("after");
         for (int i = 0; i < a.length; i++) {
            System.out.println("a [ "+i+" ] = "+a[i]);
            
        }
         
         if (k<=0||k>a.length) {
             System.out.println("输入的k有误");
            
        } else {
              System.out.println("第 K 个最大 的  是    "+a[k-1]);
        }
         
        
        
    }
    
}
