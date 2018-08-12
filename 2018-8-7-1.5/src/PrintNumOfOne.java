
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16221
 */


//解决：利用这样一个事实：如果N是奇数，那么它等于N/2的二进制表示中1的个数加1。
//
//           通过自己笔算还能发现，如果N是偶数，那么它的个数等于，N一直除以2直到变成一个奇数，这个奇数的个数
public class PrintNumOfOne {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
      //  System.out.println("input N");
       // int n=reader.nextInt();
     //   System.out.println(PrintOne());
        for (int i = 0; i < 10; i++) {
            System.out.println(Integer.toBinaryString(i)+"  "+PrintOne(i));
        }
        
        
    }
    
    private static int PrintOne(int n){
        if (n==0) {
            return 0;
        } else if (n%2!=0) {
            return PrintOne(n/2)+1;
        }else{
            return PrintOne(n/2);
        }
        
        
        
    }

    
}
