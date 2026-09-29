public class Intermediate {
    public static void main(String[] args){
        int[] student = {12, 21, 25, 16, 17, 22, 10, 15};
        int sum = 0;
        double average = 0;
        int highest = student[0], lowest = student[0];

        for(int i = 0; i < student.length; i++){
            sum += student[i];

            for(int j = 0; j < student.length; j++){
                if (student[i] > highest) {
                    highest = student[i];
                }
                if (student[i] < lowest) {
                    lowest = student[i];
                }
            }
        }
        average = (double)sum / 8.00;

        System.out.println("Sum of scores: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);


    }
}
