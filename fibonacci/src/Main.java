public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = recursiveFib(x);
        int j = x % 10;
        int k = x % 100;

        if (j == 1 &&  k != 11) {
            System.out.println("The " + x + "th number in the fibonacci sequence is " + y);
        }
        else if (j == 2 && k != 12) {
            System.out.println("The " + x + "nd number in the fibonacci sequence is " + y);
        }
        else if (j == 3 && k != 13) {
            System.out.println("The " + x + "rd number in the fibonacci sequence is " + y);
        }
        else {
            System.out.println("The " + x + "th number in the fibonacci sequence is " + y);
        }
    }

    /**
     * Returns the nth number in the Fibonacci sequence using recursion.
     * If n is less than or equal to 1, n is returned instead
     *
     * @param n represents the nth integer in the fibonacci sequence
     * @return int
     */
    public static int recursiveFib(int n) {
        if(n <= 1) {
            return n;
        }

        return recursiveFib(n-1) + recursiveFib(n-2);
    }
}