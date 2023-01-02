# Java Basics

Basics of Java language .

## A simple Java Program to print Hello world

```java
public class App { // This is a class named Main, that is public

    public static void main(String[] args) throws Exception {
     /*
      * This is a function that returns void(nothing)
      * it also takes in a list of strings as its arguments
      * write your code here 
      */
      System.out.println("Hello World");


    }
}
```
### SOME KEY WORDS 

#### STATIC 
Static ==> the variable belongs to a class, it is marked to the class  which means that we dont have to create a new instance of the Class to call the static variable or static method
####  *==== CREATING a intance ====*
```java

  SomeClass obj = new SomeClass() // instance of class
  obj.someMethod()  // calling a method on the class 

```
         
### declaring Variables

To declare a variable we use its datatype and then name;

```java
    
    Char myCharacter = 'A'; // A character variable (single quotes)
    String MyString = "This is a string" // A string variable ( double quotes)
```

### DATA Types {PRIMITIVE}

  | Type    | Bytes | Range
  -------------------------------------------
  | Byte    | 1     | [-128, 127]             
  | short   | 2     | [-32K, 32K] ==> 32 bits
  | int     | 4     | [-2B, 2B] ==> 64 bits
  | long    | 8     | ==> 64 bits
  | float   | 4     | decimals ==> 32 bits
  | double  | 8     | decimals ==> 64 bits
  | char    | 2     | 'A', 'B', 'C', … ==> 16bits
  | boolean | 1     | true / false




 
