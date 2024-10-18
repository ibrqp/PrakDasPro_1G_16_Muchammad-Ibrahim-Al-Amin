package Pertemuan7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        int jmlTiket = 0, hargaTiket = 50000, totalTiket = 0;
        double diskon = 0, total = 0, totalUang = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket = sc.nextInt();


            if (jmlTiket < 0) {
                System.out.println("Input tidak valid. Silakan masukkan jumlah tiket yang benar.");
                continue;
            }

            if (jmlTiket == 0) {
                System.out.println("\nTotal tiket yang terjual hari ini : " + totalTiket);
                System.out.println("Total harga yang terjual hari ini : " + totalUang);
                break;
            }

            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            total = jmlTiket * hargaTiket;
            double totalSetelahDiskon = total - (total * diskon);

            totalTiket += jmlTiket;
            totalUang += totalSetelahDiskon;

            System.out.println("------------------------------------------------");
            System.out.println("Harga sebelum diskon: " + total);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Harga yang harus dibayar: " + totalSetelahDiskon);
            System.out.println("\nTotal tiket yang terjual hari ini: " + totalTiket);
            System.out.println("Total harga yang terjual hari ini: " + totalUang);
            System.out.println("------------------------------------------------");

        } while (true);

        sc.close();
    }
}
