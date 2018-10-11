package com.company;

public class Main {

    public static void main(String[] args) {
        String col1 = "blue";
        String col2 = "yellow";
        setName(col1,col2);
    }

    private static void setName(String  col1, String col2,) {
        //private int number;

        if (col1 == "blue" && col2 == "yellow") {
            throw new IllegalArgumentException();
        }
        System.out.println("Type two primary Colors: ");
    }
}