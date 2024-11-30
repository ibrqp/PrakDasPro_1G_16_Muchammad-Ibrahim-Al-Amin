package Pertemuan14;

import java.util.Scanner;

public class Kafe16 {

    
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        double diskon = 0.0;
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");

        if (kodePromo == "DISKON50") {
            diskon = 0.5;
            System.out.println("\nAnda mendapatkan diskon 50%");
        } else if (kodePromo == "DISKON30") {
            diskon = 0.3;
            System.out.println("\nAnda mendapatkan diskon 30%");

        } else {
            System.out.println("Kode Invalid");
        }
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

            int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
          
            return hargaTotal;

    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");

        Scanner sc = new Scanner(System.in);
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);

            System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
