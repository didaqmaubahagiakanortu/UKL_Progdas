import java.util.Scanner;

public class scoreRecap{

    // function or method

    static double averageScore(double a, double b) {
        double average = a / b;
        return average;
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        // variables

        Scanner in = new Scanner(System.in);
        double temp = 0;
        double totalScore = 0;
        double highestScore = 0;

        // cover

        System.out.println("Rekapitulasi Nilai SMA Akbar");
        System.out.println();

        // input

        System.out.println("Masukkan nama kelas.");
        String className = in.nextLine();

        System.out.println("\nMasukkan nama wali kelas.");
        String homeroomTeacher = in.nextLine();

        System.out.println("\nMasukkan jumlah siswa.");
        int studentAmount = in.nextInt();
        System.out.println();

        // for input loop

        for (int i = 1; i <= studentAmount; i++) {

            if (i == 1) {
                System.out.println("Masukkan nilai siswa pertama.");
            } else {
                System.out.println("Masukkan nilai siswa ke-" + i + ".");
            }
            temp = in.nextDouble();
            System.out.println();

            totalScore += temp;
            if (temp > highestScore) {
                highestScore = temp;
            }

        }

        // delay

        System.out.println("Mohon menunggu data kelas " + className + " diproses.");
        Thread.sleep(3000);
        System.out.println();

        // output

        System.out.println("Data Kelas " + className + "\n");
        System.out.println("\nWali kelas: " + homeroomTeacher);
        System.out.println("Jumlah siswa: " + studentAmount);
        System.out.println("\nTotal nilai: " + totalScore);
        System.out.println("Rata-rata nilai: " + averageScore(totalScore, studentAmount));
        System.out.println("Nilai tertinggi: " + highestScore);

        // credits

        credits.creditsAuto();

    }
}
