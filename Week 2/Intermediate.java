public class Intermediate {
    public static void main(String[] args){
        int x = 67;

        x += (-4 / (int)23.2);

        System.out.println(x);
        // the output will be 0 because it is an int and
        // the number is less than 1.

        // this answer is wrong because of +=
        // the value of x is still 67 because
        // 67 + 0(the answer for (-4 / (int)23.2))
        // is still 67. I forgot the + sign in +=

        int x2 = 7;
        double y = 6.7;

        System.out.println(y < x2 && x2 > x2 + (-2));
        // true because x2 is greater than y and
        // x2 is still greater than x2 - 2.


        char x3 = '6';
        int y2 = 6;

        System.out.println(x3 == y2);
        // false because it is comparing the thing itself
        // not the data inside of the variable.
        // comparing the data inside of the varibles, you
        // use .equals()
    }
}
