import java.util.Scanner;

public class ForKelipatan27 {
    public static void main(String[] args) {
        Scanner scan27 = new Scanner(System.in);

        int kelipatan; 
        int jumlah = 0;
        int counter = 0;
        int total = 0;
        double rataRata;
        

        System.out.print("Masukan bilangan kelipatan (1-9) : ");
        kelipatan = scan27.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n",kelipatan,total);

    }

    
}