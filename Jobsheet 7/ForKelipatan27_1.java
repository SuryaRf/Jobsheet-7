import java.util.Scanner;

public class ForKelipatan27_1 {
    public static void main(String[] args) {
        Scanner scan27 = new Scanner(System.in);

        int kelipatan; 
        int jumlah = 0;
        int counter = 0;
        int total = 0;
        double rataRata = 0.0;
        

        System.out.print("Masukan bilangan kelipatan (1-9) : ");
        kelipatan = scan27.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }
       
            rataRata = (double) total / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n",kelipatan,total);
        System.out.printf("Rata-rata dari seluruh bilangan %d kelipatan yang ditentukan%.2f\n",kelipatan,rataRata);

    }

    
}