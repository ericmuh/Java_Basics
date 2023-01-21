public class App { // This is a class named Main, that is public

    public static void main(String[] args) throws Exception {

        System.out.println("Hello World"); // Print Hello World
        // DECLARING VAIRIABLES

        // Byte someByte = 40;
        // System.out.println(someByte);
        // int someInt = 50;
        // System.out.println(someInt);
        // float someFloat = 50.5F;
        // System.out.println(someFloat);
        // char someChar = 'Q';
        // System.out.println(someChar);
        // boolean someBol = true;
        // System.out.println(someBol);

        // TYPE casting
        // intergers to floats
        int myInt = 80;
        double myConvertedDouble = myInt; // 80.0 --> wide Casting ( automatic )

        byte myConvertedByte = (byte) myConvertedDouble; // --> narrow casting ( manual )

        System.out.println(myConvertedByte);
        // STRINGS
        String myName = "Eric";

        // SomeString methods :https://www.w3schools.com/java/java_ref_string.asp
        System.out.println(myName.startsWith("c")); // prints false
        System.out.println(myName.endsWith("c")); // prints true

        // concatenation : https://www.w3schools.com/java/java_strings_specchars.asp
        String firstName = "Eric";
        String secondName = "Doe";
        System.out.println(firstName + " " + secondName);
        System.out.println(firstName.concat(secondName));

        // MATH : https://www.w3schools.com/java/java_ref_math.asp
        int maximum = Math.max(5, 10);
        int minimum = Math.min(30, 60);
        double squareRoot = Math.sqrt(49);
        double absoluteValue = Math.abs(-50.6); // positive numbers
        System.out.println(absoluteValue);
        int randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);

        // CONDITIONAL STATEMENTS
        if (randomNumber == 90) {
            System.out.println("you are the lucky winner");
        } else if (randomNumber < 50) {
            System.out.println("You short too low");
        } else {

            System.out.println("Try again later..");
        }
        // Tenary operator ( short had if else)
        String result = randomNumber > 30 ? "Small number" : (randomNumber == 90 ? "big Number" : "you lose");
        System.out.println(result);

        // switch
        switch (randomNumber) {
            case 80:
                System.out.println("your number is 80");
                break;
            case 90:
                System.out.println("your number is 80");
                break;
            default:
                break;
        }

        // LOOPS
        int increment = 0;

        // While
        while (increment < 10) {
            increment++;
            System.out.println(increment);

            // do while runs first then checks for condition
        }
        do {
            increment++;
            System.out.println("do " + increment);
        } while (increment < 10);

        // For Loop.
        for (int i = 0; i < 5; i++) {
            System.out.println("for " + i);
        }

        // For Each
        int[] myNumbers = { 1, 2, 5, 6, 7, 8, 9 };
        for (int i : myNumbers) {
            System.out.println("for each" + i);
        }

        // break and continue statments.
        // Break ==> goes out of the loop
        // continue ==> stops and then continues

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i); // prints 0,1,2
        }
        // Continue
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i); // prints 0,1,2,4,5 skips 3
        }

        // ARRAYS .. type[] name = {value1, value2, ....}
        String[] myArray = { "America", "Africa", "Europe" };
        int[] myNumberArray = { 1, 60, 90 };
        int[][] twoDimensionalArray = { { 50, 50, 100 }, { 90, 50, 70 } };

        // looping through the array
        // for (int i = 0; i < myArray.length; i++) {
        // System.out.println(myArray[i]);
        // }

        // looping through a two dimensional array;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.println(twoDimensionalArray[i][j]);
            }
        }

        // METHODS
        System.out.println(addTwoNumbers(2, 6));
        System.out.println(addTwoNumbers(50.4, 1.5));

        // OOP
        Car myCar = new Car("Volvo", 1998);
        myCar.carDetails();

    }

    static int addTwoNumbers(int a, int b) {
        return a + b;

    }

    // Method OverLoading :
    // https://www.w3schools.com/java/java_methods_overloading.asp
    static double addTwoNumbers(double a, double b) {
        return a + b;

    }

    // Recursion
    static int sum(int c) {
        if (c > 0) {
            return c + sum(c - 1);
        } else {
            return 0;
        }
    }

}

// OOP
class Car {
    String brand; // fields/attributes for he car Class
    final double PI = 3.142; // final key word for constant variable ( cant be overriden)
    int mftDate;

    // methods: https://www.w3schools.com/java/java_class_methods.asp
    public String carDetails() {
        System.out.println(this.brand + " " + this.mftDate);
        return this.brand + this.mftDate;
    }

    // Constructor Method
    public Car(String brand, int mftDate) {
        this.brand = brand;
        this.mftDate = mftDate;

    }

}


