package com.dhanashri;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {

        // List<String> list = new LinkedList<>();
        // List<String> list = new ArrayList<>();
        List<String> list = new Vector<>();

        list.add("India");
        list.add("US");
        list.add("AUS");
        list.add("China");

        System.out.println(list);

        // Random Access to elements --->

        list.add(2, "Spain");
        System.out.println(list);

        int size = list.size();
        System.out.println("size = " + size);

        System.out.println(list.get(4));

        System.out.println(list.remove(4));

        list.set(3, "France");
        System.out.println(list);

        // Searching ---->

        if (list.contains("India")) {
            System.out.println("India is in the list");
        } else {
            System.out.println("India not found ");
        }

        System.out.println(list.indexOf("India"));

        Collections.addAll(list, "China", "Russia", "Italy", "China");
        System.out.println(list.indexOf("China"));

        System.out.println(list); // list.toString());
        System.out.println(list.lastIndexOf("China"));

        // Iterator---->

        // old method--->
        ListIterator search = list.listIterator();
        while (search.hasNext()) {
            String print = (String) search.next(); // retruns object type
            System.out.println(print);
        }

        Iterator<String> search1 = list.iterator();
        while (search1.hasNext()) {
            String elements = search1.next();
            System.out.print(elements + " ");
        }

        ListIterator<String> search2 = list.listIterator();
        System.out.println("Forward list");
        while (search2.hasNext()) {
            System.out.println(search2.next());
        }

        System.out.println("\n");
        System.out.println("Reverse iterator");
        search2 = list.listIterator(list.size());
        while (search2.hasPrevious()) {
            System.out.println(search2.previous());

        }

        Collections.sort(list);
        System.out.println(" Sorted list" + list);

        Collections.shuffle(list);
        System.out.println(" Shuffled list" + list);

        list.clear();
        System.out.println(list);

    }

}
