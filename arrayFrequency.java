import java.util.Arrays;
import java.util.Scanner;

public class arrayFrequency {
    public static void main(String[] args) {
        
        // variables

        Scanner in = new Scanner(System.in);
        int i;

        // input

        System.out.println("Masukkan jumlah elemen pada array.");
        int amount = in.nextInt();
        System.out.println();

        // process

        int array[] = new int[amount];

        // for loop input

        for (i = 0; i < amount; i++) {

            if (i == 0) {
                System.out.println("Masukkan nilai elemen pertama.");
            } else {
                System.out.println("Masukkan nilai elemen ke-" + (i + 1) + ".");
            }
            array[i] = in.nextInt();
            System.out.println();

        }

        // for loop array contents

        System.out.print("Isi Array: ");
        for (i = 0; i < array.length; i++) {
            if (i < (array.length - 1)) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i] + ".");
            }
        }
        System.out.println();

        // for loop debut output

        Arrays.sort(array);
        for (i = 0; i < array.length; i++) {

            if (i == 0 || array[i] != array[i-1]) {

                int debut = 0;
                for (int j = 0; j < array.length; j++) {

                    if (array[i] == array[j]) {
                        debut++;
                    }

                }
            
                System.out.println("Elemen " + array[i] + " muncul " + debut + " kali.");

            }
        }

        // credits

        credits.creditsAuto();
    }
}
