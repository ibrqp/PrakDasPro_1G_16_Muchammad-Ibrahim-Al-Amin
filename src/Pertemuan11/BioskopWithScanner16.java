package Pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println();
            System.out.println("Menu 1: Input data penonton, 2: Tampilkan daftar penonton, 3: Exit ");
            System.out.print("Pilih Menu : ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Kursi tidak tersedia. Silakan masukkan lagi.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi Tidak Tersedia. Silakan masukkan lagi.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                    }

                    System.out.print("Input penonton lainnya? (y/n)");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (menu == 2) {
                for (String[] row : penonton) {
                    for (String elemen : row) {
                        System.out.print((elemen != null ? elemen : "***") + " ");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                break;
            } else {
                System.out.println("Data yang anda masukkan salah");
            }
        }
    }
}
