import java.util.Scanner;

public class DoWhileCuti27_2 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah cuti: ");
        jatahCuti = sc27.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc27.next();

            if (konfirmasi.equalsIgnoreCase("y")){
            
            System.out.print("Jumlah hari: ");
            jumlahHari = sc27.nextInt();

            if (jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
            } else {
                System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                break;
            }
        } else if (konfirmasi.equalsIgnoreCase("t")) {
            break;
        }
     } while (jatahCuti > 0);
    }
}
