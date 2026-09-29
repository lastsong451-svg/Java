public class Advanced {
    public static void main(String[] args){
        double average = 90;
        int absences = 4;


        if((average >= 75 && absences <= 3) || average >= 90){
            System.out.println("PASS");
            // pass the student if their absences is equal or less than 3
            // and above 75 but below 90 average.
        }
        else System.out.print("FAIL");
        // not in any of the above conditions so the student failed.
    }

}
