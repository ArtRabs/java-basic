public class StringMethods {

    public static void main(String[] args) {

        String name = "ArtRabs";

        int lenght = name.length(); // counts the number of characters "ArtRabs" = 7 if "Art Rabs" = 8
        char letter = name.charAt(1); // always starts from 0 = A, 1 = r, 2 = t, 3 = R ...
        int index = name.indexOf("t"); // the opposite use of charAt so A = 0, r = 1, t = 2, R = 3 ...
        int lastIndex = name.lastIndexOf("A"); // same as indexOf but the last index, example if string is "ARTRABS", then last index of A is 4

        System.out.println(lenght); // 7
        System.out.println(letter); // r
        System.out.println(index); // 2
        System.out.println(lastIndex); // 0

        name = name.toUpperCase(); 
        System.out.println(name); // ARTRABS

        name = name.toLowerCase(); 
        System.out.println(name); // artrabs

        name = name.trim(); // if "   artrabs   " = "artrabs"
        System.out.println(name); // artrabs

        name = name.replace("a", "e");
        System.out.println(name); // ertrebs

        System.out.println(name.isEmpty()); // false

        if (name.isEmpty()) {

            System.out.println("Your name is empty");

        }
        else {

            System.out.println("Hello " + name); // Hello ertrebs

        }

        if (name.contains(" ")) {

            System.out.println("Your name contains a space");

        }

        else {

            System.out.println("Your name DOESN'T contain any space");

        }

        if (name.equals("password")) { // use equalsIgnoreCase for case insensitive, if someone use "Password" or "PASSWORD" or "pAsSwOrD" instead of "password"

            System.out.println("Your name can't be password");

        }

        else {

            System.out.println("Hello " + name);

        }

    }
    
}