public class Intermediate {
    public static void main(String[] args){

        int[] value = {1, 2, 3, 4, 5, -5, -1};
        int value1 = 0;
        int total = 0;

        // I used an array to make the while loop read a value one by one
        // until it reads -1.
        System.out.println("Current number; " + value[value1]);
        while(value[value1] != -1){
            total += value[value1];
            value1++;
            System.out.println("Current number; " + value[value1]);
        }

        System.out.println("Total: " + total);
    }
}
