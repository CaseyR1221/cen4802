public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = recursiveFib(x);
        int j = x % 10;
        int k = x % 100;

        if (j == 1 &&  k != 11) {
            System.out.println("The " + x + "th number in the finbonacci sequence is " + y);
        }
        else if (j == 2 && k != 12) {
            System.out.println("The " + x + "nd number in the finbonacci sequence is " + y);
        }
        else if (j == 3 && k != 13) {
            System.out.println("The " + x + "rd number in the finbonacci sequence is " + y);
        }
        else {
            System.out.println("The " + x + "th number in the finbonacci sequence is " + y);
        }
    }

    public static int recursiveFib(int n) {
        if(n <= 1) {
            return n;
        }

        return recursiveFib(n-1) + recursiveFib(n-2);
    }
}