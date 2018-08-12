
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
public class Function2 {

    public static void main(String[] args) {
        //1 接受参数

        Scanner read = new Scanner(System.in);
        System.out.println("请输入 要分离的数组");
        String dateString = read.nextLine();
        System.out.println("请输入开始分离的位置");
        int index = read.nextInt();
        //======================================================================
        System.out.println("dateString is " + dateString);
        System.out.println("index is " + index);
//=============================================================================
        String spString[] = dateString.split(" ");
        
         for (int i = 0; i < spString.length; i++) {
             System.out.println("spString["+i+"] is "+spString[i]);

        }

        String leftString = null;
        for (int i = 0; i < index; i++) {
           
            leftString = leftString+spString[i]+ " ";

        }

        System.out.println("splitstring[0] is "+spString[0]+"\nthe left is " + leftString);
        String rightString = null;
        for (int i = index; i < spString.length; i++) {
         
            rightString = rightString+spString[i] + " ";

        }
        System.out.println("the right is  " + rightString);
        String answerStrings = rightString.split(" ").toString() + leftString.split(" ").toString();
        System.out.println("the answer is   " + answerStrings);

    }

}
