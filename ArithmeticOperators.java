public class ArithmeticOperators {

    public static void main(String[] args) {

    // Arithmetic Operators

    int x = 10;
    int y = 2;
    int z;

    z = x + y; // z = 12
    z = x - y; // z = 8
    z = x * y; // z = 20
    z = x / y; // z = 5
    z = x % y; // z = 0 <- In this case, the code read this latest line of code before the printing of z, so the z will rewrite it's output.
    // % is called modulus, useful for determining even or odd numbers

    System.out.println(z);

    // Augmented Assignment Operators

    int xx = 10;
    int yy = 3;

    xx += yy; // xx = xx + yy -> 10 = 10 + 3 -> xx = 13
    xx -= yy; // xx = xx - yy -> 13 = 13 - 3 -> xx = 10
    xx *= yy; // xx = xx * yy -> 10 = 10 * 3 -> xx = 30
    xx /= yy; // xx = xx / yy -> 30 = 30 / 3 -> xx = 10
    xx %= yy; // xx = xx % yy -> 10 = 10 % 3 -> xx = 1

    System.out.println(xx);

    // Increment and Decrement Operators

    int xxx = 1;

    xxx++; // xxx = xxx + 1 -> 1 = 1 + 1 -> xxx = 2
    xxx--; // xxx = xxx - 1 -> 2 = 2 - 1 -> xxx = 1

    System.out.println(xxx);

    // ORDER OF OPERATIONS [P-E-M-D-A-S]

    double result = 3 + 4 * (7 - 5) / 2.0;
    // result = 3 + 4 * (7 - 5) / 2.0
    // result = 3 + 4 * (2) / 2.0
    // result = 3 + 8 / 2.0
    // result = 3 + 4.0
    // result = 7.0

    System.out.println(result);
    
    }
    
}