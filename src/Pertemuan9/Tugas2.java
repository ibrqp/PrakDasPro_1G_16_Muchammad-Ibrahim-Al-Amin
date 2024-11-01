package Pertemuan9;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah politeknik yang ingin didaftarkan: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();

        for (int j = 1; j <= jumlahPoliteknik; j++) {
            System.out.print("\nMasukkan nama Politeknik ke-" + j + ": ");
            String namaPoliteknik = sc.nextLine();
            System.out.println("\nData untuk " + namaPoliteknik + ":");

            String atletBadminton = "";
            String atletTenisMeja = "";
            String atletBasket = "";
            String atletBolaVoli = "";

            System.out.println("Cabang Olahraga: Badminton");
            for (int a = 1; a <= 5; a++) {
                System.out.print("Masukkan nama atlet Badminton ke-" + a + ": ");
                atletBadminton += sc.nextLine() + "\n";
            }

            System.out.println("\nCabang Olahraga: Tenis Meja");
            for (int a = 1; a <= 5; a++) {
                System.out.print("Masukkan nama atlet Tenis Meja ke-" + a + ": ");
                atletTenisMeja += sc.nextLine() + "\n";
            }

            System.out.println("\nCabang Olahraga: Basket");
            for (int a = 1; a <= 5; a++) {
                System.out.print("Masukkan nama atlet Basket ke-" + a + ": ");
                atletBasket += sc.nextLine() + "\n";
            }

            System.out.println("\nCabang Olahraga: Bola Voli");
            for (int a = 1; a <= 5; a++) {
                System.out.print("Masukkan nama atlet Bola Voli ke-" + a + ": ");
                atletBolaVoli += sc.nextLine() + "\n";
            }

            System.out.println("\nHasil untuk " + namaPoliteknik + ":");
            System.out.println("Atlet Badminton: ");
            System.out.print(atletBadminton);

            System.out.println("Atlet Tenis Meja: ");
            System.out.print(atletTenisMeja);

            System.out.println("Atlet Basket: ");
            System.out.print(atletBasket);

            System.out.println("Atlet Bola Voli: ");
            System.out.print(atletBolaVoli);
        }
    }
}
