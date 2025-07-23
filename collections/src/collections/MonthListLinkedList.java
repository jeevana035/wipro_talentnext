package collections;

import java.util.LinkedList;

public class MonthListLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList to store month names
        LinkedList<String> months = new LinkedList<>();

        // Add all the months to the LinkedList
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Print the months
        System.out.println("Months of the year (using LinkedList):");
        for (String month : months) {
            System.out.println(month);
        }
    }
}
