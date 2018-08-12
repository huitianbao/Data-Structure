
import java.util.Scanner;
import jdk.nashorn.internal.codegen.CompilerConstants;

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
        int p;

        int data[];

        //1.接受数据
        System.out.println("请输入数组 回车结束:");

        Scanner reader = new Scanner(System.in);

        String input = reader.nextLine();

        System.out.println("the input is " + input);
        String splitString[] = input.split(" ");

        for (int i = 0; i < splitString.length; i++) {
            System.out.println(splitString[i]);

        }
//zuoyi
        String[] an = leftOne(splitString);
        for (int i = 0; i < splitString.length; i++) {
            System.out.println(an[i]);

        }
    }

    public static String[] leftOne(String[] d) {
        String splitString[] = d.toString().split(" ");
        String firstString = splitString[0];
        int n = firstString.length();

        // 开始移动
        for (int i = 0; i <= n - 2; i++) {
            splitString[i] = splitString[i + 1];

        }
        splitString[n - 1] = firstString;

        return splitString;
    }

    public String[] Left(String[] d, int p) {

        return null;

    }

}
