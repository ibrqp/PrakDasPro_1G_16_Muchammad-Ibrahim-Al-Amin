package Pertemuan14;

import java.util.Scanner;

public class Tugas2 {

    static String hari[] = {"Hari ke 1", "Hari ke 2", "Hari ke 3", "Hari ke 4", "Hari ke 5", "Hari ke 6", "Hari ke 7"};
    static String menu[] = {"Kopi       ", "Teh        ", "Es Degan   ", "Roti Bakar", "Gorengan   "};
    static int penjualan[][] = {
        {20, 20, 25, 20, 10, 60, 10},
        {30, 80, 40, 10, 15, 20, 25},
        {5, 9, 20, 25, 10, 5, 45},
        {50, 8, 17, 18, 10, 30, 6},
        {15, 10, 16, 15, 10, 10, 55},};
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.println("------------");
            System.out.println("Pilihan Menu");
            System.out.println("1 : Edit Data");
            System.out.println("2 : Tampilkan data");
            System.out.println("3 : Menu Tertinggi Penjualan");
            System.out.println("4 : Rata Rata Penjualan");
            System.out.println("5 : Close");
            System.out.print("Pilih Menu: ");
            int menu = sc.nextInt();
            menu(menu);
            if (menu == 5) {
                break;
            }
        }
    }

    public static void menuTertinggi() {
        tampil();
        System.out.println();
        int i;
        String tertinggi = null;
        int total2 = 0;
        for (i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > total2) {
                total2 = total;
                tertinggi = menu[i];
            }
        }
        System.out.println("Penjualan Tertinggi Pada Menu " + tertinggi);
    }

    public static void menu(int menu) {
        if (menu == 2) {
            System.out.println("--------------");
            System.out.println("Data Penjualan");
            tampil();
        } else if (menu == 1) {
            System.out.println("-------------------");
            System.out.println("Edit Data Penjualan");
            edit();
        } else if (menu == 4) {
            rataRata();
        } else if (menu == 3) {
            menuTertinggi();
        }
    }

    public static void rataRata() {
        tampil();
        System.out.println();
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            int rataRata = 0;
            System.out.print("Rata Rata Penjualan " + menu[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
                rataRata = total / penjualan[i].length;
            }
            System.out.print(": " + rataRata);
            System.out.println();
        }
    }

    public static void tampil() {

        System.out.print(" \t\t");
        for (String h : hari) {
            System.out.print(h + "\t");
        }
        System.out.println();
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + "\t"); // Nama menu
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void edit() {
        int i = 0;
        tampil();
        sc.nextLine();

        System.out.println();
        System.out.print("Masukkan Nama Menu: ");
        String menuke = sc.nextLine();

        System.out.print("Masukkan Hari Ke (1-7): ");
        int harike = sc.nextInt();
        System.out.print("Edit Menjadi  : ");
        int editan = sc.nextInt();

        for (i = 0; i < menu.length; i++) {
            if (menu[i].trim().equalsIgnoreCase(menuke)) {
                break;
            }
        }
        penjualan[i][harike - 1] = editan;
        tampil();
    }
}
