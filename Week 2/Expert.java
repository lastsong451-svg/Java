public class Expert {
    public static void main(String[] args){
        // COMPOUND ASSIGNMENT
        double balance = 100.0;


        System.out.println("COMPOUNDING");
        balance += 67.7;
        System.out.println("Balance after += 67.7: " + balance);

        balance *= 6.7;
        System.out.println("Balance after *= 6.7: " + balance);

        balance *= 6.9;
        System.out.println("Balance after *= 6.9: " + balance);

        // POSTFIX INCREMENT
        /*
            Why 67 becomes 68
                Variable++ uses the current thing inside the variable first
                before increasing it by 1.
        */
        int postfix = 67;

        System.out.println();
        System.out.println("POSTIX INCRE<ENT");

        System.out.println("Postfix++ (original value): " + postfix++);
        System.out.println("Postfix after postfix++: " + postfix);


        // PREFIX INCREMENT
        /*
            Why 77 is still 77
                ++Variable increases the data of the variable first
                before using it.
        */
        int prefix = 76;

        System.out.println();
        System.out.println("PREFIX INCREMENT");

        System.out.println("++Prefix (Original value): " + ++prefix);
        System.out.println("Prefix after ++prefix: " + prefix);



    }
}
