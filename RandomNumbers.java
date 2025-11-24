import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        int number2;
        double number3;
        boolean isHeads;

        number1 = random.nextInt(1, 7); // numbers between 1 - 6
        number2 = random.nextInt(1, 101); // numbers between 1 - 100
        number3 = random.nextDouble(1, 50); // numbers between 1 - 49

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        isHeads = random.nextBoolean();

        if(isHeads) {
            System.out.println("Heads");
        }

        else {
            System.out.println("Tails");
        }

    }
}
