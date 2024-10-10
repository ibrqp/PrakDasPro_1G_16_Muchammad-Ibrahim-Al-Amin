package Pertemuan5;

import java.util.Scanner;

public class CafeDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String makanan1 = null, makanan2, makanan3;
        double hargaMkn1, hargaMkn2, hargaMkn3, total, diskon = 0, totalStlDiskon;
        int jmlMkn1, jmlMkn2, jmlMkn3;

        System.out.print("\nMasukkan Nama Makanan 1 : ");
        makanan1 = input.nextLine();
        System.out.print("Masukkan Nama Makanan 2 : ");
        makanan2 = input.nextLine();
        System.out.print("Masukkan Nama Makanan 3 : ");
        makanan3 = input.nextLine();

        System.out.print("\nMasukkan Harga " + makanan1 + " : ");
        hargaMkn1 = input.nextDouble();
        System.out.print("Masukkan Harga " + makanan2 + " : ");
        hargaMkn2 = input.nextDouble();
        System.out.print("Masukkan Harga " + makanan3 + " : ");
        hargaMkn3 = input.nextDouble();

        System.out.print("\nMasukkan Jumlah " + makanan1 + " : ");
        jmlMkn1 = input.nextInt();
        System.out.print("Masukkan Jumlah " + makanan2 + " : ");
        jmlMkn2 = input.nextInt();
        System.out.print("Masukkan Jumlah " + makanan3 + " : ");
        jmlMkn3 = input.nextInt();

        total = (hargaMkn1 * jmlMkn1) + (hargaMkn2 * jmlMkn2) + (hargaMkn3 * jmlMkn3);
        System.out.println(total);

        if (total > 500000) {
            diskon = 0.10; 
        } else if (total > 200000) {
            diskon = 0.05; 
        } else if (total > 100000) {
            diskon = 0.02; 
        }else{
            diskon = 0;
        }

        totalStlDiskon = total - (total * diskon);

        System.out.println("\n==== Struk Pembayaran ====");
        System.out.println("Total belanja sebelum diskon: Rp" + total);
        if (diskon > 0) {
            System.out.println("Diskon diterapkan: " + (int)(diskon * 100) + "%");
        } else {
            System.out.println("Tidak ada diskon yang diterapkan.");
        }
        System.out.println("Total belanja setelah diskon: Rp" + totalStlDiskon);
        System.out.println("==========================");

        input.close();
    }
}
