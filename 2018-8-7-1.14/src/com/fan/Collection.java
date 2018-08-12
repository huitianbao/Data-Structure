/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fan;

/**
 *
 * @author 16221
 */
public class Collection {

    private Object aObject[]=null;
    int size = aObject.length;

    public boolean isEmpty() {
        if (size <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void makeEmpty() {
        aObject = null;

    }

    public void insert(Object data) {
        aObject[aObject.length] = data;
    }

    public void insert(int index, Object data) {  //  插入完成之后 data所在的位置是 是 第 index 个
        for (int i = aObject.length - 1; i >= index - 1; i--) {
            aObject[i] = aObject[i + 1];
        }
        aObject[index - 1] = data;

    }

    public void remove(int index) {
        for (int i = index - 1; i < aObject.length - 1; i++) {
            aObject[i] = aObject[i + 1];
        }

    }

    public boolean isPresent(Object x) {
        boolean flag = false;
        for (int i = 0; i < aObject.length; i++) {
            if (aObject[i].equals(x)) {
                flag = true;
            }

        }

        return flag;

    }

    //========================================================
    //方便测试
    public void print() {
        System.out.println("the data is ");
        for (int i = 0; i < aObject.length; i++) {
            System.out.print(aObject[i] + "  ");
        }
    }

}
