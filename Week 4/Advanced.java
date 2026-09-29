public class Advanced {
    public static void main(String[] args){


        for(int i = 0; i <= 10; i++){
            if(i == 6){
                System.out.println("SKIPPPEDDD!!");
                System.out.println("Row: " + i);
                continue;
                /*
                    When i(row) hits 6, it will be skipped.
                    But * will still appear 6 and 7 vanishes because
                    7 will only print 6 * because of break which has a
                    condition of i and j == 7 it will break.
                */
            }
            for(int j = 1; j <= i; j++){
                if(j == 7 && i == 7){
                    System.out.println();
                    System.out.println("BREAKKKK!!!");
                    System.out.println("Row: " + i + " | Column: " + j);
                    break;

                    /*
                        When I(row) reaches 7 same as j(column),
                        It will not input the * but instead input
                        BREAKKKKK!!! and what specific row and column it breaked.
                    */
                }
                else System.out.print("*");

            }
            System.out.println();
        }

    }
}
