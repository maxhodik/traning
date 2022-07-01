package collections;

import com.company.details.Engine;

import java.util.*;


public class Main {
//    static void foreach(Iterable list) {
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
   // }
    public static void main(String[] args) {
        MyArrayList<Integer> my = new MyArrayList<>();
        MyArrayList<Engine> engines = new MyArrayList<>();
        MyArrayList<String> car = new MyArrayList<>();
        Iterable<Integer> iter;
        Iterator<Integer> iterator = my.iterator();




        engines.add(new Engine("ssd","dsd"));
//        System.out.println("size: " + my.getSize());

        engines.print();
       my.add(Integer.valueOf(2));
//       System.out.println("size: " + my.getSize());

        my.add(Integer.valueOf(3));
        my.add(Integer.valueOf(3));
        my.add(Integer.valueOf(3));
        my.add(Integer.valueOf(3));

        my.print();

        System.out.println("size: " + my.getSize());
       // System.out.println( my.toString());

        my.insert(0,0);
        System.out.println("size: " + my.getSize());
        my.insert(18,1);
        System.out.println("size: " + my.getSize());
        my.insert(13,2);
        System.out.println("size: " + my.getSize());
        my.insert(7,5);
        System.out.println("size: " + my.getSize());
        my.insert(15,6);
        System.out.println("size: " + my.getSize());
        my.print();
       // System.out.println(my.toString());
//        for (int i = 0; i < my.getSize(); i++) {
//            Object byIndex = my.getByIndex(i);
//           Engine engine = (Engine) byIndex;
//           System.out.println(engine.getCompany());
//        }
      //  my.show();

       my.getByIndex(2);
       my.delByIndex(1);
       my.print();
       //System.out.println( my.toString());
        my.delByIndex(2);
        my.print();
        System.out.println("size: " + my.getSize());
        Object[] objects = new Object[]{31,313,331};


        System.out.print("list: ");
        System.out.println(Arrays.toString(objects));
        my.addList(objects, 3);
        System.out.println("size: " + my.getSize());
        my.print();


      //  System.arraycopy();



       // my.show();

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

