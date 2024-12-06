import java.util.Scanner;

public class positiveFactorial {
    
    // method

    static int factorial(int a) {
        int result = 1;
        for (int i = a; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        
        // variables

        Scanner in = new Scanner(System.in);

        // input

        System.out.println("Masukkan nilai yang diinginkan.");
        int number = in.nextInt();

        // output

        System.out.println("Faktorial dari " + number + " adalah " + factorial(number) + ".");

        // credits

        credits.creditsAuto();

    }

}
