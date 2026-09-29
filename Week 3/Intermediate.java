public class Intermediate {
    public static void main(String[] args){
        double purchaseAmount = 0;
        double price = 10;


        if(purchaseAmount < 1) {
            System.out.println("ERRROROERE!! No purchases made");
        }
        else if(purchaseAmount >= 1 && purchaseAmount < 15){
            System.out.println("RECEIPT");
            System.out.println("***********************************************");
            System.out.println("Discount %: 0% of total | discount tier 0");
            System.out.println("Purchase amount: " + purchaseAmount);
            System.out.println("Total price: " + (price * purchaseAmount));
            System.out.println("***********************************************");

        }
        else if(purchaseAmount >= 15 && purchaseAmount < 35){
            price *= 0.95;
            System.out.println("RECEIPT");
            System.out.println("***********************************************");
            System.out.println("Discount %: 5% of total | discount tier 1");
            System.out.println("Purchase amount: " + purchaseAmount);
            System.out.println("Total price: " + (price * purchaseAmount));
            System.out.println("***********************************************");

        }
        else if(purchaseAmount >= 35 && purchaseAmount < 67){
            price *= 0.90;
            System.out.println("RECEIPT");
            System.out.println("***********************************************");
            System.out.println("Discount %: 10% of total | discount tier 2");
            System.out.println("Purchase amount: " + purchaseAmount);
            System.out.println("Total price: " + (price * purchaseAmount));
            System.out.println("***********************************************");

        }
        else{
            price *= 0.85;
            System.out.println("RECEIPT");
            System.out.println("***********************************************");
            System.out.println("Discount %: 15% of total | discount tier 3");
            System.out.println("Purchase amount: " + purchaseAmount);
            System.out.println("Total price: " + (price * purchaseAmount));
            System.out.println("***********************************************");

        }

    }
}
