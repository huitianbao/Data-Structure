/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16221
 */
public class NewClass {

    public static void main(String[] args) {
//        Object aObject[] = null;
//        aObject[0] = "1";
//        System.out.println(aObject.length);

        String aString[] = null;
        //aString[0] = "ddd";
       // System.out.println(aString.length);
       
        for (int i = 0; i < 10; i++) {
            aString[i]=i+"";
        }
        for (int i = 0; i < aString.length; i++) {
            System.out.println(aString[i]);
        }
    }

}
