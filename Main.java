package com.company;

public class Main {

// if the input is string, output this one
    static double employeeInfo (String name)
    {
     System.out.println("Hello" + name + " so glad you are here.");
     return 1234.2345;
    }

    //else if input is interger, then output this one
    static double employeeInfo (int number)
    {
        System.out.println("Your number is: " + number);
        return 2345.3456;
    }


    public static void main(String[] args) {
	//Add the employee part to get it to do what you need it to do.
        employeeInfo(258);
        employeeInfo(" Reggie");
    }
}
