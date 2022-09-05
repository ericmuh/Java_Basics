package com.ericmuh;

public class Main { // This is a class named Main, that is public

    public static void main(String[] args) { 
        /* This is a function that returns void(nothing), that is also static
         it also takes in a list of strings as its arguments
         write your code here

         Static ==> the variable belongs to a class ..
         which means that we dont have to create a new instance of the Class to call the method/variable.
         ==== CREATING a intance ====
        SomeClass obj = new SomeClass()
        obj.someMethod()
        */
        System.out.println("Hello World");


        // DATA Types {PRIMITIVE}

        /*
                Tpype   || Bytes || Range
            ==========================
                Byte    || 1     ||    [-128, 127]
                short   || 2     ||    [-32K, 32K] ==> 32 bits
                int     || 4     ||    [-2B, 2B]   ==> 64 bits
                long    || 8     ||                ==> 64 bits
                float   || 4     ||    decimals    ==> 32 bits
                double  || 8     ||    decimals    ==> 64 bits
                char    || 2     ||  A, B, C, …
                boolean || 1     ||  true / false
        */

        // DECLARING VAIRIABLES
        Byte someByte    =  40;
        int someInt      =  50;
        float someFloat  =  50.5F;
        char someChar    =  "Q";
        boolean someBol  = true
    }
}
