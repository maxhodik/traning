package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<?> a = new ArrayList<>();
        MyArrayList my = new MyArrayList();

        my.add(1);
        System.out.println("size: " + my.getSize());
       my.add(Integer.valueOf(2));
       System.out.println("size: " + my.getSize());

        my.add(Integer.valueOf(3));
        System.out.println("size: " + my.getSize());
        my.insert(0,0);
        System.out.println("size: " + my.getSize());
        my.insert(18,1);
        System.out.println("size: " + my.getSize());

        my.insert(13,2);
        System.out.println("size: " + my.getSize());
        my.insert(7,6);
        System.out.println("size: " + my.getSize());
        my.insert(15,7);
        System.out.println("size: " + my.getSize());
       // my.getByIndex(2);
//        my.delByIndex(7);
//        my.delByIndex(2);
        System.out.println("size: " + my.getSize());
        Object[] objects = new Object[]{31,313,331};
        my.addList(objects, 8);
        System.out.println("size: " + my.getSize());

//        my.add(Integer.valueOf(4));
//        System.out.println("size: " + my.getSize());
//        my.add(Integer.valueOf(5));
//        System.out.println("size: " + my.getSize());
//        my.add(Integer.valueOf(6));
//        System.out.println("size: " + my.getSize());

        my.show();

//        HashMap<String, String> map = new HashMap<>();
//        String i = "1";
//        String u = "first";
//        map.put(i, u);
//        map.get("1");
//        List<String> linkedList = new LinkedList<>();
//        ArrayList<String> arrayList = new ArrayList<>();
//        System.out.println(i.equals(u));
     //   ArrayList
       // List<Integer> myList = MyArrayList<>();
      //  for (Integer integer : myList) {
       //     System.out.println(integer);
        }
    }

