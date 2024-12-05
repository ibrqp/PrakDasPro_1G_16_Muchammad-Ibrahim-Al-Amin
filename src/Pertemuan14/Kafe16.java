package Pertemuan14;

import java.util.Scanner;

public class Kafe16 {

    static double diskon = 0.0;
    static int hargaKeseluruhan = 0;

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
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
            diskon = 0;
            System.out.println("\nKode kode Diskon Invalid");
        }
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        hargaTotal -= (int) (hargaTotal * diskon);
        hargaKeseluruhan += hargaTotal;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON30");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
            System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
            System.out.print("Apakah anda ingin membeli lagi? (y/n)");
            String inputan = sc.nextLine();
            if (inputan.equalsIgnoreCase("n")) {
                System.out.println("\nTotal harga keseluruhan untuk pesanan Anda: Rp" + hargaKeseluruhan);
                break;
            } else if (inputan.equalsIgnoreCase("y")) {
                continue;
            } else {
                System.out.println("\nInputan tidak masuk");
            }
        }
    }


}
