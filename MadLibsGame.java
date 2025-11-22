import java.util.Scanner;

public class MadLibsGame {

    public static void main(String[] args) {

        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();
        
        // Other smaple, just remove the comment under to see
        // System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        // System.out.println("In an exhibit, I saw a " + noun1 + ".");
        // System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        // System.out.println("I was " + adjective3 + "!");

        System.out.println("\nToday is the long awaited " + adjective1 + " match!");
        System.out.println("The match right now is against Zote vs " + noun1 + ".");
        System.out.println("Zote was not " + adjective2 + " and " + noun1 + " is " + verb1 + "!");
        System.out.println("The audience were " + adjective3 + ".");
        System.out.println("Little did Zote knew that " + noun1 + " is still " + verb1 + ".");

        // Zote can be change to noun2, gotta create scanner for noun2 if it is.

        // It really doesn't make sense and I suppose that is one of the point.

        scanner.close();

    }
    
}
