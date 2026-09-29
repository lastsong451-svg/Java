public class Expert{
    static class Student{
        String names;
        int[] Quizzes;

        Student(String name, int[] Quizzes){
            this.names = name;
            this.Quizzes = Quizzes;
        }

        // Calculates the averages of each scores of each student's.
        double average(){
            double total = 0;

            // score inherets one part of Quizzes for every iteration.
            for(double score : Quizzes){
                total += score;
            }
            return total / Quizzes.length;
        }
    }

    // This is to search if a person is included in the ranks
    static int LinearSearch(Student[] students, String name){
        for(int i = 0; i < students.length; i++){
            // I used the ignorecase() so i can ignore capital letters in
            // the names when searching if they are in the leaderboards.
            if(students[i].names.equalsIgnoreCase(name)){
                int rank = 1;

                for(int j = 0; j < students.length; j++){
                    if(students[j].average() > students[i].average()){
                        rank++;
                    }
                }
                return rank;
            }
        }
        return -1;
    }

    static void Sort(Student[] students){
        // -1 because of the if else conditions with students[j] + 1
        // would be a non-existent one if the last already only j.
        for(int i = 0; i < students.length - 1; i++){
            for(int j = 0; j < students.length - 1 - i; j++){
                // this is where -1 is important because of j + 1 here.
                // basically if my array only has 4 students and i don't
                // jave the -1, then the j + 1 searchers for student 5
                // which is non-existent.
                if(students[j].average() < students[j + 1].average()){
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }


    static void main(String[] args){

        String[] names = {"Elgave", "Yohanze", "Aldous", "Mike", "Jheric", "Didal"};
        int[][] Quiz = {
                {95, 92, 98, 95},
                {90, 93, 91, 92},
                {88, 85, 91, 88},
                {88, 85, 91, 88},
                {88, 85, 91, 88},
                {75, 78, 76, 77}
        };

        Student[] students = new Student[names.length];
        for(int i = 0; i < students.length; i++){
            students[i] = new Student(names[i], Quiz[i]);
        }
        // Sorts the students by their averages
        Sort(students);

        System.out.println();
        System.out.println("===============================");
        System.out.println("\t   CLASS LEADERBOARD");
        System.out.println("===============================");
        System.out.println("Rank\t|\tName\t|\tAvarage");
        System.out.println("-------------------------------");

        // Initially at 1 because so it can be sorted to highest to lowest
        int ranks = 1;
        for(int i = 0; i < students.length; i++){
            // Makes it so the ranks of student with the same
            // average have the same rank i > 0 because the
            // first student has no previous student to compare with.
            if(i > 0 && students[i].average() != students[i - 1].average()){
                ranks = i + 1;
            }
            System.out.println(ranks + "\t\t|\t"  + students[i].names + "\t|\t" +  students[i].average());
        }

        // where the Linear Search is printed and where the
        // names i wanna search is initialized.
        System.out.println();
        String[] searches = {"Mike", "MikeTheGreat", "MikeTheGoat"};
        for(int i = 0; i < searches.length; i++){
            int rank = LinearSearch(students, searches[i]);

            if(rank == -1){
                System.out.println(searches[i] + " was not found.");
            }
            else{
                System.out.println(searches[i] + " is ranked #" + rank);
            }
        }
    }
}

