import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is you gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true or false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Hello " + name);
        System.out.println(", you are " + age + " years old.");
        System.out.println("Your gpa is: " + gpa);
        
        if (isStudent) {
            System.out.println("You are enrolled as student.");
        } 
        else {
            System.out.println("You are NOT enrolled as student.");
        }

        // COMMON ISSUES
        // remove the /* and */  to see sample common issues output

        /*
        System.out.print("Enter your age: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter you favorite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age2 + " years old.");
        System.out.println("Your favorite color is: " + color); */

        // This automatically enters to the next line, which makes the user not inputting anything in color.
        // To fix this, change scanner.nextLine() to scanner.next();
        // or adding scanner.nextLine(); under the int age2 = scanner.nextInt();

        // Calculate area of a rectangle

        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The are is: " + area + "cm²"); // cm^2 is alt + 0178

        scanner.close();

    }

}