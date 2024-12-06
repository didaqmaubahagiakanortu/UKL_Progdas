import java.util.Scanner;

public class astralExpress {
    
    // method

    static double expenses(int a, int b, int c) {

        double price = 0;
        if (a <= 10) {
            price = b * 4250;
        } else if (a <= 20) {
            price = b * 6000;
        } else {
            price = b * 8000;
        }

        if (c > 100) {
            price += 50000;
        }

        return price;
    }

    public static void main(String[] args) throws InterruptedException {
        
        // variables

        Scanner in = new Scanner(System.in);
        int volume;

        // cover

        System.out.println("Selamat datang di Astral Express");
        System.out.println();

        // input

        System.out.println("Masukkan jarak pengiriman (km)");
        int distance = in.nextInt();

        System.out.println("\nMasukkan berat paket (kg)");
        int weight = in.nextInt();
        
        System.out.println("\nMasukkan panjang paket (cm)");
        int length = in.nextInt();

        System.out.println("\nMasukkan lebar paket (cm)");
        int width = in.nextInt();

        System.out.println("\nMasukkan tinggi paket (cm)");
        int height = in.nextInt();
        System.out.println();

        // process

        volume = length * width * height;

        // delay

        System.out.println("Mohon menunggu data pengiriman anda diproses.");
        Thread.sleep(3000);
        System.out.println();

        // output

        System.out.println("Data Pengiriman Astral Express");
        System.out.println("\nJarak pengiriman: " + distance + " km");
        System.out.println("Berat paket: " + weight + " kg");
        System.out.println("Volume paket: " + volume + " cm²");
        System.out.println("Biaya pengiriman: Rp" + expenses(distance, weight, volume));
        
    }
}