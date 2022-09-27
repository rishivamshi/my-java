public class Main {
    public static void main(String[] args) {
// java has 8 primitive data types - byte, short, int, long, float, double, char and boolean.
//      char takes a single character and we can even input unicode values by using format (backslashu(followed by unicode) ex. /u0044
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

//      boolean is initialised with boolean
        boolean testTrue = true;
        boolean testFalse = false;

// Strings - String is not a primitive datatype, it is actually a class. Strings in java are immutable
        String myString = "this is a string";
        System.out.println(myString);
        myString = myString + " \u00A9 2022";
        System.out.println(myString);
// Strings can be added to int datatype
        String myNumber = "1010";
        int myNum = 2020;
        myNumber = myNumber + myNum;
        System.out.println(myNumber);

// If else
         boolean isAlien = false;
         if(isAlien == false)
             System.out.println("It is not an alien!");
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
// https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        
    }
}