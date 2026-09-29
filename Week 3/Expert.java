public class Expert {
    public static void main(String[] args){

        // information of this dude
        String name = "Mike";
        int PIN = 12345;
        double balance = 100000;
        double withdraw = 50000;
        String tier = "";
        double dailylimit = 0;
        double fee_percentage;
        double fee = 0;
        double total = 0;

        if(name == "Mike"){
            if(PIN == 12345){

                // Checks your balance to assign your tier
                if(balance < 10000){
                    tier = "Bronze";
                }
                else if(balance >= 10000 && balance < 25000){
                    tier = "Silver";
                }
                else if(balance >= 25000 && balance < 100000){
                    tier = "Gold";
                }
                else if(balance >= 100000){
                    tier = "Platinum";
                }

                // checks your tier to assign a daily limit to
                // how much you can withdraw
                if(tier.equals("Bronze")){
                    dailylimit = 5000;
                }
                else if(tier.equals("Silver")){
                    dailylimit = 15000;
                }
                else if(tier.equals("Gold")){
                    dailylimit = 35000;
                }
                else if(tier.equals("Platinum")){
                    dailylimit = 50000;
                }
                else System.out.println("");


                // checks if your withdrawing is within scope for
                // your assigned daily limit by your tier
                if (withdraw <= dailylimit) {
                    switch (tier) {
                        case "Bronze":
                            fee_percentage = 0.03;
                            break;
                        case "Silver":
                            fee_percentage = 0.01;
                            break;
                        case "Gold":
                            fee_percentage = 0.007;
                            break;
                        case "Platinum":
                            fee_percentage = 0.005;
                            break;
                        default:
                            fee_percentage = 0;
                    }

                    // adds the calculated fee to how much
                    // you will withdraw.
                    fee = withdraw * fee_percentage;
                    total = withdraw + fee;

                    // checks if your total is higher than your balance
                    // when it is false there is probably some bad math
                    // in calculating total
                    if (total <= balance) {
                        // this is here because you withdrew more than half of your balance.
                        balance -= total;
                        System.out.println("RECEIPT");
                        System.out.println("Withdrawal: " + withdraw);
                        System.out.println("Fee: " + fee);
                        System.out.println("Total: " + total);
                        System.out.println("Balance: " + balance);
                    }
                    else System.out.println("DENIED!!! Insufficient balance");
                }
                else System.out.println("DENIED!!! Withdrawal exceeds your daily limit");
            }
            else System.out.println("DENIED!!! Invalid PIN");
        }
        else System.out.println("DENIED!!! Invalid Username");

    }
}
