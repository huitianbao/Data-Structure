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
public class 选择问题 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader=new Scanner(System.in);
        String dateString=reader.nextLine();
        String ddString[]=dateString.split(" ");
        
        //排序 冒泡
        
        for (int i = 0; i < ddString.length; i++) {
            
            
        }
        for (int i = 0; i < ddString.length-1; i++) {
            if (Integer.parseInt(ddString[i])<Integer.parseInt(ddString[i+1])) {
                swap(Integer.parseInt(ddString[i]),Integer.parseInt(ddString[i+1]));
            }
            
        }
        
        for (int i = 0; i < ddString.length; i++) {
            System.out.println(ddString[i]);
            
        }
        
    }
    
    public static void swap(int a,int b){
        int t;
        t=a;a=b;b=t;
    }
    
}
