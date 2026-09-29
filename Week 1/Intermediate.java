public class Intermediate {
    public static void main(String[] args){
        // Declare and initialize the variables
        int quantity = 67;
        double unitPrice = 10.67;
        String storeName = "Mike's Great Store";

        // declare and compute the total cost
        double totalCost = quantity * unitPrice;

        // print the variables

        System.out.println(storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit price: " + unitPrice);
        System.out.println("Total cost: " + totalCost);

        /*
        Why have total cost as int is bad:
            The first thing that came to mind is that the given answer is always in decimals
            if said numbers are not whole.
        */
    }
}
