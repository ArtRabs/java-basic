public class PrintfFormatting {
    
    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        // + = output a plus
        // , = comma grouping seperator
        // ( = negative number are encclosed in ()
        // space = display a minus if negative, space if positive

        String name = "Spongebob";  // %s
        char firstLetter = 'S';     // %c
        int age = 30;               // %d
        double height = 60.5;       // %f
        boolean isEmployed = true;  // %b

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);

        double price1 = 9.99;   // %.1f
        double price2 = 100.15; // %.2f
        double price3 = -54.01; // %.3f

        System.out.printf("Price 1: %.1f\n", price1); // 9.990000 -> 10.0 automatically rounded
        System.out.printf("Price 2: %.2f\n", price2); // 100.150000 -> 100.15
        System.out.printf("Price 3: %.3f\n", price3); // -54.010000 -> -54.010

        // + = output a plus
        // , = comma grouping seperator
        // ( = negative number are encclosed in ()
        // space = display a minus if negative, space if positive

        double price4 = 5.99;       // %+f
        double price5 = 75000.8;    // %,f
        double price6 = -99.99;     // %(f
        double price7 = -5054569;   // % f

        System.out.printf("Price 4: %+.2f\n", price4); // 5.990000 -> +5.99
        System.out.printf("Price 5: %,.2f\n", price5); // 75000.800000 -> 75,000.80
        System.out.printf("Price 6: %(.2f\n", price6); // -99.990000 -> (99.99)
        System.out.printf("Price 7: % .2f\n", price7); // -5054569.000000 -> -5054569.00 // if it is postive, it will just add a space ( 5054569.00)

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); // 1 -> 0001
        System.out.printf("%4d\n", id2); // 23 ->   23
        System.out.printf("%-4d\n", id3); // 456 -> 456 // left justified so it looks like this in print (456 )
        System.out.printf("%08d\n", id4); // 7890 -> 00007890
    }

}