import java.util.Scanner;

public class MathClass {
    
    public static void main(String[] args) {
        
        // System.out.println(Math.PI); // 3.141592653589793
        // System.out.println(Math.E); // 2.718281828459045

        double result;

        result = Math.pow(2, 5); // 2^5 = 32 or 2 * 2 * 2 * 2 * 2 = 32
        result = Math.abs(-5); // 5 : makes it positive absolutely
        result = Math.sqrt(9); // 9^0.5 = 3
        result = Math.round(3.14); // 3.14 -> 3 normal round
        result = Math.ceil(3.14); // 3.14 -> 4 round up
        result = Math.floor(3.99); // 3.99 -> 3 round down

        System.out.println(result);


        // HYPOTENUSE  c = Math.sqrt(a² + b²); // c = √(a^2 + b^2)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // c = (a^2 + b^2)^0.5 // I can't type square root, so ^0.5 will do, but I can copy paste it √

        System.out.println("The hypotenuse (side c) is: " + c + "cm");


        // circumference = 2 * Math.PI * radius; // circumference = 2 * 3.141592653589793 * radius
        // area = Math.PI * Math.pow(radius, 2); // area = 3.141592653589793 * radius^2
        // volume = 4/3 * Math.PI * Math.pow(radius, 3); // volume = 4/3 * 3.141592653589793 * radius^3

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius; // circumference = 2 * 3.141592653589793 * radius
        area = Math.PI * Math.pow(radius, 2); // area = 3.141592653589793 * radius^2
        volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3); // volume = 4/3 * 3.141592653589793 * radius^3

        System.out.printf("The circumference is: %.1fcm\n", circumference); // this only prints 31.4 instead of 31.41592653589793
        System.out.println("The area is: " + area + "cm²"); // numlock = true + alt + 0178 -> ² or just do ^2
        System.out.println("The volume is: " + volume + "cm³"); // numlock = true + alt + 0179 -> ³ or just do ^3 // some terminal can't read ³, at least UTF-8

        scanner.close();

    }

}