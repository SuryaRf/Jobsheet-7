package Jobsheet7_2;

import java.util.Scanner;
public class Pelanggan27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        String nama;
        char jawab;
        int jml = 0;
        do{
            System.out.print("Masukkan nama pelanggan: ");
            nama = sc27.nextLine();
            jml++;
            System.out.print("Apakah anda ingin memasukkan nama pelanggan baru (Y/T)? ");
            jawab = sc27.nextLine().charAt(0);
        } while (jawab == 'Y' || jawab == 'y');
        System.out.println("Jumlah pelanggan yang anda masukkan = " + jml);

    }
}