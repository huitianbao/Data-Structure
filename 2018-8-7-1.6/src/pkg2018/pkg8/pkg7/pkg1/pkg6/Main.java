/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018.pkg8.pkg7.pkg1.pkg6;

/**
 *
 * @author 16221
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void permute(String str) {
        char[] chars = str.toCharArray();
        permute(chars, 0, chars.length - 1);
    }

    public static void permute(char[] str, int low, int high) {
        if (low == high) {
            String cout = "";
            for (int i = 0; i <= high; i++) {
                cout += str[i];
            }
            System.out.println(cout);
        } else {
            for (int i = low; i <= high; i++) {
                swap(str, low, i);
                permute(str, low + 1, high);
                swap(str, low, i);
            }
        }
    }

    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ab";
        permute(str);
    }

}
