package Jobsheet7_2;

import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        String nama, golongan, jenisK;
        int jamLembur;

        for (int j = 0; true; j++) {
            System.out.print("Nama Pegawai\t: ");
            nama = sc27.nextLine();
            System.out.print("Jenis kelamin (P/L) : ");
            jenisK = sc27.nextLine();

            System.out.println("Untuk Golongan :");
            System.out.println("A = Pengawai Paruh waktu");
            System.out.println("B = Pengawai Magang");
            System.out.println("C = Pengawai Tetap");
            System.out.println("D = manajer");

            System.out.print("Masukan Golongan (A-D) : ");
            golongan = sc27.nextLine();
            System.out.print("Masukan Waktu lembur (jam) : ");
            jamLembur = sc27.nextInt();
            System.out.print("lanjut ? (Y/N) : ");
            String lanjut = sc27.nextLine();
            lanjut = sc27.nextLine();

            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }

            System.out.printf("Karyawan dengan nama %s , jenis kelamin %s , dengan golongan %s , dan lembur selama %s jam ",
                    nama, jenisK, golongan, jamLembur);

        }
    }
}
