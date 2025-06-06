package pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan2_16 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        double harga, total_bayar;
        int pilihan_menu;
        String member, jenisPembayaran;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input16.nextInt();
        input16.nextLine();
        System.out.print("Apakah punya member (y/n) = ");
        member = input16.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            double diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.print("Masukkan pilihan menu yang benar");
                return;
            }

            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
            System.out.println("-------------------------------------");

            System.out.print("Apakah pembayaran melalui QRIS (y/n) = ");
            jenisPembayaran = input16.nextLine();
            if (jenisPembayaran.equalsIgnoreCase("y")) {
                total_bayar = total_bayar - 1000;
            }
            System.out.println("Total bayar = " + total_bayar);
            

        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu yang benar");
                return;
            }
            System.out.println("Total bayar = " + harga);
            System.out.println("-------------------------------------");

            System.out.print("Apakah pembayaran melalui QRIS (y/n) = ");
            jenisPembayaran = input16.nextLine();
            if (jenisPembayaran.equalsIgnoreCase("y")) {
                harga = harga - 1000;
            }
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-------------------------------------");
    }
}
