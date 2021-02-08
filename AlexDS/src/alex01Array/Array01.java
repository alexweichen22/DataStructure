package alex01Array;
/*
DAY 01 TASKS
        ============
        Day01Arrays
        Ask user for the size of the array to create, it must be 1 or greater.
        Show an error and end program if it's invalid.
        Also do not allow the program to crash if the entered value is not numerical.
        In such case also show an error and end the program.

        Allocate array of int values of the size user requested.

        Generate random numbers 1-100 and assign them to each item of that array.

        Display all numbers from the array comma-separated on a single line.

        Find and display all numbers in that array are prime numbers, comma-separated on a single line.

*/
public class Array01 {
    public static void main(String[] args) {

    }
    public static boolean isPrime(int input){
        if (input <=1) {
            return false;
        }
        else{
                for (int i = 2; i <= Math.sqrt(input); i++) {
                if(input % i ==0) return false;
            }
                return true;}
        }
}
