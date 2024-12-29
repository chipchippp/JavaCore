package JavaCollection.Array;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("C");
        list.add("A");

        list.sort(String::compareTo);

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("==add==");
        list.add(0, "Java");
        for (String s : list) {
            System.out.println(s);
        }

        list.remove(1);
//        list.remove("Java");
        System.out.println("==remove==");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("==get/set==");
        String s = list.get(1);
//        System.out.println(s);
        list.set(1, "Java Collection");
        for (String s1 : list) {
            System.out.println(s1);
        }

        System.out.println("==size==");
        if (list.size() > 0) {
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }

        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }

        System.out.println("==clear==");
        list.clear();
        for (String s1 : list) {
            System.out.println(s1);
        }
        if (list.size() > 0) {
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }

        System.out.println("==addAll==");
        List<String> list1 = new ArrayList<>();
        list1.add(("A1"));
        list1.add(("B1"));
        list1.add(("C1"));
        list1.add(("D1"));

        list.addAll(list1);
        for (String s1 : list) {
            System.out.println(s1);
        }

        System.out.println("A1 = " +list.indexOf("A1"));

        System.out.println("==subList==");
        List<String> list2 = new ArrayList<>();
        list.add("B");
        list.add("C");
        list.add("A");

        List<String> list3 = list.subList(1, 3);
        for (String s1 : list3) {
            System.out.println(s1);
        }
    }
}
