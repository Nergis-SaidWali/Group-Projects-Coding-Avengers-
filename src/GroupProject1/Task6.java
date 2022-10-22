package GroupProject1;

public class Task6 {
    public static void main(String[] args) {

        /*
         * Write a program to swap 2 numbers without a temporary variable?
         */


        int x = 15;
        int y = 20;

        System.out.println("Before Swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);

        //add both the numbers and assign it to first
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);

    }

}


