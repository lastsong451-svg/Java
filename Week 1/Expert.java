public class Expert {
    public static void main(String[] args){
        // =========================================
        //          BYTE OVERFLOWING
        // =========================================

        // DECLARED AND INITIALIZED
        byte number = 127;
        //  a byte can only hold -128 - 127 number of data.
        System.out.println("BYTE OVERFLOWING");
        System.out.println("Before overflowing: " + number);
        number++;
        System.out.println("After overflowing: " + number);

        // =========================================
        //          STRING VARIABLES
        // =========================================

        // DECLARED AND INITIALIZED
        String n1 = new String("Mike");
        String n2 = new String("Mike");
        String n3 = "Mike";

        System.out.println('\n');
        System.out.println("STRING VARIABLES");

        // new String will always give a separate string object,
        // basically it is like a doppelganger, where someone
        // will have a striking resemblance with you.

        // .equals() compares the contents of the Strings.


        // n1 and n2 are created using separate new String()
        // calls, so they refer to two different objects.
        System.out.println("n1 == n2: " + (n1 == n2));

        // .equals() compares the contents of the Strings.
        // Since both Strings contain Mike then this is true
        System.out.println("n1.equals(n2): " + n1.equals(n2));

        // n1 is created from a new String while n3 is a String
        // Literal. Therefore, they are different.
        System.out.println("n1 == n3: " + (n1 == n3));

        // .equals() compares the contents of the Strings.
        // Both contain Mike, so this is true.
        System.out.println("n1.equals(n3): " + n1.equals(n3));

        // n2 is created from a new String, while n3 is a String
        // literal. Therefore, they are different.
        System.out.println("n2 == n3: " + (n2 == n3));

        // .equals() compares the contents of the Strings.
        // And both Strings contain the same Mike.
        System.out.println("n2.equals(n3): " + n2.equals(n3));

        // =========================================
        //          ARRAYS
        // =========================================

        int[] original = new int[5];
        int[] copy = original;

        System.out.println('\n');
        System.out.println("ARRAYS");


        System.out.println("Before changing: ");
        System.out.println("Original: " + original[0]);
        System.out.println("Copy: " + copy[0]);

        // changing the copy to see if the original will change
        copy[0] = 76;


        System.out.println("After changing: ");
        System.out.println("Original: " + original[0]);
        System.out.println("Copy: " + copy[0]);

    }



}
