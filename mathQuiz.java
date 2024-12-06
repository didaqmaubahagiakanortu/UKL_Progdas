import java.util.Random;
import java.util.Scanner;

public class mathQuiz {

    // method

    static int randomValue(int a) {
        Random rng = new Random();
        int random = rng.nextInt(a) + 1;
        return random;
    }
    public static void main(String[] args) {
        
        // array

        String operator[] = {"*", "/", "%"};

        // variables

        Scanner in = new Scanner(System.in);
        int operand = 0;
        int num1 = 0;
        int num2 = 0;
        int correctAnswer = 0;

        // cover

        System.out.println("Selamat datang di Quiz Prof. Nobody!");
        System.out.println("\nApakah anda sudah siap?");
        char decision = in.nextLine().charAt(0);
        System.out.println();

        // quiz

        if (decision == 'Y' || decision == 'y') {
           
            do { 
                
                operand = randomValue(3) - 1;
                num1 = randomValue(10);

                switch (operand) {
                    case 0 -> {
                        num2 = randomValue(10);
                        correctAnswer = num1 * num2;
                    }
                    case 1 -> {
                        while (num1 % num2 != 0) {
                            num2 = randomValue(num1);
                        }
                        correctAnswer = num1 / num2;
                    }
                    default -> {
                        num2 = randomValue(num1);
                        correctAnswer = num1 % num2;
                    }
                }

                System.out.println(num1 + " " + operator[operand] + " " + num2 + "?");
                int answer = in.nextInt();

                if (answer == correctAnswer) {
                    System.out.println("Anda benar! Jawabannya adalah " + correctAnswer + ".");
                } else {
                    System.out.println("Anda salah! Jawabannya adalah " + correctAnswer + ".");
                }
                System.out.println();
                in.nextLine();

                System.out.println("Apakah anda ingin melanjutkan?");
                decision = in.nextLine().charAt(0);
                System.out.println();

            } while (decision == 'Y' || decision == 'y');

            System.out.println("Terimakasih sudah bermain!");

        } else {

            System.out.println("Baiklah, selamat mencoba lain kali!");

        }

        // credits

        credits.creditsAuto();

    }
}
