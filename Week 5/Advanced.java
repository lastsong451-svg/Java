import java.util.Arrays;

public class Advanced {
    public static void main(String[] args){
        int[] scores = {12, 21, 25, 16, 17, 22, 10, 15};

        int find_value = 10;
        int foundAt = -1;


        for(int i = 0; i < scores.length; i++){
            if(find_value == scores[i]){
                foundAt = i;
            }
        }

        if(foundAt != -1){
            System.out.println("Target found at index #" + foundAt);
        }
        else System.out.println("Cannot find target value at this array");


        // COPY AND SORTED OF ORIGINAL SCORES
        // Arrays.copyOf() copies the original without affecting
        // the original when the value of the copy changes
        int[] copy = Arrays.copyOf(scores, scores.length);

        Arrays.sort(copy);


        // use a toString() so that i wont use for loops since its there.
        System.out.println("Original: " + Arrays.toString(scores));
        System.out.println("Sorted:   " + Arrays.toString(copy));


        /*
            WHY SORTING A COPY MIGHT MATTER HERE
                Sorting a copy matters here since we want
                to differentiate the original to the copy.
                With finding a specific value in the original array,
                it would change on the copy since it was sorted by lowest
                to highest. Basically the copy of the array matters in this
                because sorting would change the original values of the array.
        */

    }
}
