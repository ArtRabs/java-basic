public class NestedIfStatements {

    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if (isStudent) {

            if (isSenior) {

                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");

                price *= 0.7; // 30% discount

            }

            else {

                System.out.println("You get a student discount of 10%");

                price *= 0.9; // 10% discount

            }
            
        }

        else {

            if (isSenior) {

                System.out.println("You get a senior discount of 20%");
                
                price *= 0.8; // 20% discount

            }

            else {

                price *= 1; // no discount

            }

        }

        System.out.printf("The price of a ticket is: $%.2f", price);
       
    }
    
}