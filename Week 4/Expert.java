import java.util.Scanner;

public class Expert {



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] warehouse = {
                          {1, 2, 3},
                          {4, 5, -1},
                          {-1, 8, 9}
                          };

        int choice;


        do {
            System.out.println("\t\t\t\t\t\t\t\tWAREHOUSE");
            System.out.println("****************************************************************************");
            System.out.println("1 = Total warehouse | 2 = find critically low shelf | 3 = restock | 4 = exit");
            System.out.println("****************************************************************************");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            // totals how many are stocked in the warehouse
            if(choice == 1) {
                // here so it does not add previous shelf stocked
                // basically resetting the total for each run
                int total = 0;

                for(int i = 0; i < warehouse.length; i++) {
                    for(int j = 0; j < warehouse[i].length; j++) {
                        if(warehouse[i][j] == -1) {
                            continue;
                        }
                        total += warehouse[i][j];
                    }
                    System.out.println("Total inventory: " + total);
                }
            }

            // find the first critically low stocked in the warehouse
            else if(choice == 2) {
                for(int i = 0; i < warehouse.length; i++) {
                    for(int j = 0; j < warehouse[i].length; j++) {
                        if(warehouse[i][j] != -1 && warehouse[i][j] < 3) {
                            System.out.println("First critically low shelf: [" + i + "][" + j + "] | count: " + warehouse[i][j]);
                            break;
                        }
                    }
                }
            }

            // restock the warehouse by user input using static int to use return
            else if(choice == 3){
                System.out.print("Row to restock: ");
                int row = scanner.nextInt();
                System.out.print("Column to restock: ");
                int column = scanner.nextInt();


                // Here is where I used the return and the while loop inside of this function.
                int amount = restock();


                // Made it so when a damaged stock is now being addressed,
                // it will be restocked without adding the -1 in the math.
                if(warehouse[row][column] == -1) {
                    warehouse[row][column] = amount;
                }
                else{
                    warehouse[row][column] = warehouse[row][column] + amount;
                }
            }

            // Exiting the warehouse. eyyyyy.
            else if(choice == 4) {
                    System.out.println("Goodbye, Moonmen");
                    break;
            }


        }while(true);

    }
    static int restock(){
        // I dont know how to make this scanner global so yeah.
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("How many amount for restock: ");
            int amount = scanner.nextInt();

            if (amount > 0) {
                return amount;
            }
            System.out.println("INVALIDDDDD!!! Try again");
        }

    }
}
