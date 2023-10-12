package Jobsheet7_2;

import java.util.Scanner;

public class Menu27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        int menu;
        while (true) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^+");
            System.out.println("|    * PILIHAN MENU *     |");
            System.out.println("+^^^^^^^^^^^^^^^^^^^^^^^^^+");
            System.out.println("| [1] Data Pegawai        |");
            System.out.println("| [2] Perhitungan Gaji    |");
            System.out.println("| [3] Cetak Slip Gaji     |");
            System.out.println("| [4] Pencarian           |");
            System.out.println("| [5] Laporan             |");
            System.out.println("| [6] Keluar              |");
            System.out.println("+-------------------------+");
            System.out.print("Masukkan menu pilihan anda: ");
            menu = sc27.nextInt();
            if (menu == 1) {
                System.out.println("[1] Data Pegawai");
            } else if (menu == 2) {
                System.out.println("Perhitungan Gaji ");
            } else if (menu == 3) {
                System.out.println("Cetak Slip Gaji");
            } else if (menu == 4) {
                System.out.println("Pencarian");
            } else if (menu == 5) {
                System.out.println("Laporan");
            } else if (menu == 6) {
                break;
            }

        }while(menu!=5); 

    }
}
