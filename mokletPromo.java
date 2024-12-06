public class mokletPromo {

    // method

    static void moklet(int a, String b) {
       System.out.println(a + ". Saya " + b + "."); 
    }

    public static void main(String[] args) throws InterruptedException{
        
        // array

        String dialogues[] = { "anak Wikusama", "anak Moklet", "angkatan 33", "senang"};

        // for loop

        for (int i = 50; i > 0; i--) {
            if (i == 1) {
                moklet(i, dialogues[3]);
            } else if (i % 3 == 0) {
                moklet(i, dialogues[2]);
            } else if (i % 2 == 0) {
                moklet(i, dialogues[1]);
            } else {
                moklet(i, dialogues[0]);
            }
            Thread.sleep(500);
        }

        // credits

        credits.creditsAuto();
    }
}
