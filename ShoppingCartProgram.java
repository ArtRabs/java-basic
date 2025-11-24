import java.util.Scanner;

public class ShoppingCartProgram {

    public static void main(String[] args) {

        // SHOPPING CART PROGRAM
        
        Scanner scanner = new Scanner(System.in);

        int userinput = 0;

        System.out.print("Enter a number: ");
        userinput = scanner.nextInt();

        System.out.println(userinput);

        scanner.close();

    }
}