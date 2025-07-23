package collections;

import java.util.ArrayList;

public class NumberList {
    public static void main(String[] args) {
        // Create an ArrayList that stores only Number types
        ArrayList<Number> numberList = new ArrayList<>();

        // Add numbers of different types
        numberList.add(10);        // Integer
        numberList.add(3.14);      // Double
        numberList.add(2.5f);      // Float
        numberList.add(100L);      // Long

        // Print all elements
        System.out.println("Numbers in the list:");
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}