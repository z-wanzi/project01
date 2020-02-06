package com.company;

import java.util.ArrayList;

/**
 * @author zgy
 * @date 2020/2/6 - 10:14
 */
public class Templates {
    public static void main(String[] args) {
        String[] arr = new String[]{"Tom","Jerry"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }

        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);
        for (Object o : list) {
            
        }
        for (Object o : list) {
            
        }
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        //模板5
        ArrayList list1 = new ArrayList();
        list.add(123);
        list.add(123);
        list.add(123);


    }
    public void testUpdate(){


    }
}
