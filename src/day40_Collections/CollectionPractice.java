package day40_Collections;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        Collection<Integer> collection= new ArrayList<>();
        // can call all the methods of Collection type

        collection.add(100);
        collection.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700));

        System.out.println(collection);

        System.out.println( ((ArrayList) collection).get(2) ); // downcasting from ArrayList because collection doesn't have get() method.
        //System.out.println((Stack)collection.pop());
        System.out.println("--------------------------------");

        Collection<Integer> collection2 = new HashSet<>(); // no duplicates
        collection2.addAll(Arrays.asList(100, 200, 100, 200, 300, 400, 500, 600, 700, 100, 100, 100));

        System.out.println(collection2);
//   System.out.println(  ( (ArrayList)collection2 ).get(4)  ); // cannot cast to convert one collection type to another instead use constructor

        System.out.println(  new ArrayList<>(collection2).get(4)  );

        List<Integer> l = new ArrayList<>(collection2);// just assigning to variable


    }
}
