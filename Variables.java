public class Variables {

    public static void main(String[] args) {
        // variable =   a reusable container for a value
        //              a variable behaves as if it was the value it contains

        // Primitive =  simple value stored directly in memory (stack)
        // I am giving you 10 gold
        // Reference =  memory address (stack) that points to the (heap)
        // I am giving you an "I owe you" that I owe you 10 gold

        //  Primitive   vs  Reference
        //  ---------       ---------  
        //  int             string
        //  double          array
        //  char            object
        //  boolean

        // 2 Steps to creating a variable
        // ------------------------------ 
        // 1. declaration
        // 2. assignment

        // int
        int age = 21;
        int year = 2025;
        int quantity = 1;

        System.out.println("My age is " + age);
        System.out.println("The year is " + year);
        System.out.println("Quantity: " + quantity);

        // double
        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price);
        System.out.println("GPA: " + gpa);
        System.out.println("Temperature: " + temperature);

        // char
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        // boolean
        boolean isStudent = true; // isStudent is a camelCase variable name
        boolean forSale = false;
        boolean isOnline = true;

        if(isStudent) {
            System.out.println("I am a student!");
        }
        else {
            System.out.println("I am not a student!");
        }

        System.out.println(forSale);
        System.out.println(isOnline);

        // camelCase
        // - Stars with a lower case letter
        // - Seperates words with a capital letter

        // String
        String name = "ArtRabs";
        String food = "ice cream";
        String email = "email@mymail.com";
        String car = "Fraud";
        String color = "green";

        System.out.println("My name is " + name + " and I like " + food);
        System.out.println("My email is " + email);
        System.out.println("My grade is " + grade);
        System.out.println("My car is a " + color + " " + car);
        System.out.println("The price is: " + currency + price);

        if (forSale) {
            System.out.println("There is a " + car + " for sale!");
        }
        else {
            System.out.println("There is no " + car + " for sale!");
        }

    }
    
}