public class Advanced {
    public static void main(String[] args){
        // =========================================
        //          CENTIMETERS TO METERS
        // =========================================

        // Declared and Initialize the variable
        double centimeters = 167.69;

        // explicit narrowing calculation
        int meters = (int)(centimeters / 100); // 100 because 1 meter = 100cm
        double remainingCM = centimeters - (meters * 100);

        // prints the variables
        System.out.println("Centimeters to meters and what is lost");
        System.out.println("centimeters: " + centimeters);
        System.out.println("meters: " + meters);
        System.out.println("Remaining centimeters: " + remainingCM);

        // =========================================
        //          IMPLICIT WIDENING
        // =========================================

        // Declared and Initialize for Implicit widening
        int number = 67;
        double convert = number;

        // prints the Implicit Widening
        System.out.print('\n');
        System.out.println("Implicit Widening");
        System.out.println("Int number: " + number);
        System.out.println("Double number (converted from int number): " + convert);

        /*
            Why cast is not needed for Implicit Widening
                to understand what cast is, it is this:

                    Int variable = (int)(Double_Variable);

                The (int) from the left of (Double_Variable) is called cast.

                The reason why cast is not needed for Implicit widening is
                because the data type can fit the smaller data type without
                cutting or changing anything to that data.

        */

        // =========================================
        //          EXPLICIT NARROWING
        // =========================================

        // Declared and Initialize for Explicit Narrowing
        double numba = 67.67;
        int Smol = (int)numba;

        // prints the Explicit Narrowing calculation
        System.out.print('\n');
        System.out.println("Implicit Widening");
        System.out.println("Double number: " + numba);
        System.out.println("Int number: " + Smol);

       /*
            Why data is lost in Explicit Narrowing
                Because you are forcing a larger data type into a
                smaller data type that it is incompatible without
                using casting. And with casting, data will be loss
                depending on the data from the larger data type.
       */
    }
}
