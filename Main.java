package com.company;
// redoing  for class, hope I get it right

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String args[]) {
//Instead of names of books I am going to do Authors.

        List<String> authors = new ArrayList<>();
        authors.add("Christine Feehan");
        authors.add("Nora Roberts");
        authors.add("Bella Forrest");
        authors.add("Fern Michaels");
        authors.add("Susan Wiggs");

        System.out.println("From first to last original list " + authors);

        Collections.reverse(authors); // finely got it right.

        System.out.println("Reversed list: " + authors);

        List<String> output = reverseListRecursively(authors);
        System.out.println("Reversed Authors, and reversed again: " + output);

    }

    private static List<String> reverseListRecursively(List<String> list) {
        if (list.size() <= 1) {
            return list;  //don't for the return or it will not like it.
        }

        List<String> reversed = new ArrayList<>();

        reversed.add(list.get(list.size() - 1)); //should last element
        reversed.addAll(reverseListRecursively(list.subList(0, list.size() - 1)));
        return reversed;
    }  // made some errors on the way. I got this d*** thing to work.
}
