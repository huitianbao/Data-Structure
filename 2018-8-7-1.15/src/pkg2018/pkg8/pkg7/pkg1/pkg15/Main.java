/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2018.pkg8.pkg7.pkg1.pkg15;

import imply.ComImply_Area;
import interfacemy.Comparator;
import util.Rectangle;

/**
 *
 * @author 16221
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //1.构造 Rectangle  数组
        Rectangle rectangle[] = null;

        for (int i = 0; i < 10; i++) {
            // Rectangle r = new Rectangle(i, 2*i);

            rectangle[i] = new Rectangle(i, 2 * i);

        }
        Comparator comparator = new ComImply_Area();
        //  double max=rectangle[0].getLength()*rectangle[0].getWidth();
        double max = 0;
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle.length; j++) {
                if (comparator.compare(rectangle[i], rectangle[j])) {
                    max = rectangle[i].getLength() * rectangle[i].getWidth();
                } else {
                    max = rectangle[j].getLength() * rectangle[j].getWidth();
                }
            }

        }
        
        
        System.out.println("max   is    "+max);

    }

}
