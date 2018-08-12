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
// 第二种方法 先把前  k 个元素读入数组，递减排序，读新元素。小就忽略，大就放到正确的位置，同时挤出一个最小的元素
//  感觉就是在不断地更新 第  k  个位置上的元素啊，读完为止
public class Select3 {

    public static void main(String[] args) {
        System.out.println("请输入 N个数，空格隔开");
        Scanner reader = new Scanner(System.in);
        String in = reader.nextLine();
        System.out.println("请输入k");
        int k = Integer.parseInt(reader.next().toString());

        //对这个  String  操作，先读前  k  个进入
        String a[] = in.split(" ");
        System.out.println("before");
        for (int i = 0; i < k; i++) {
            System.out.println("a [ " + i + " ] = " + a[i]);

        }

        //对  前 k 个数据排序
        String tString;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (Integer.parseInt(a[i]) < Integer.parseInt(a[j])) {
                    tString = a[i];
                    a[i] = a[j];
                    a[j] = tString;
                }

            }

        }

        System.out.println("after sort");
        for (int i = 0; i < k; i++) {
            System.out.println("a [ " + i + " ] = " + a[i]);

        }
        
        //  再 读数据
        for (int i = k; i < a.length; i++) {
            if (Integer.parseInt(a[i]) >Integer.parseInt(a[k-1])) {
                //1  
            }
        }

    }

}
