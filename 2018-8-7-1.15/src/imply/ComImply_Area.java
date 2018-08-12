/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imply;

import interfacemy.Comparator;
import util.Rectangle;


/**
 *
 * @author 16221
 */
public class ComImply_Area implements Comparator<Rectangle> {

    @Override
    public boolean compare(Rectangle a1, Rectangle a2) { // 第一个大于第二个为  真
        double area1=a1.getLength()*a1.getWidth();
        double area2=a2.getLength()*a2.getWidth();
        
        if (area1>area2) {
            return true;
        }else{
            return false;
        }
    }

}
