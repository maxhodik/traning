package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        String i = "1";
        String u = "first";
        map.put(i, u);
        map.get("1");
        List<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(i.equals(u));
    }
}
