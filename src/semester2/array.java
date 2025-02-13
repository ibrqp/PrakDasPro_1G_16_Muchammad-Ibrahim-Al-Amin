package semester2;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {

        
        // String[] mk = {" Pancasila", " Konsep Teknologi Informasi", " Critical Thingking dan Problem Solving", " Matematika Dasar", " Bahasa Inggris", " Dasar Pemrograman", " Praktikum Dasar Pemrograman", " Keselamatan dan Keseharan terja"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Mata Kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();
        double nilaiAkhir = 0.0;
        String[] mk = new String[jumlahMK];
        double[] bobot = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        for (int i = 0; i < mk.length; i++) {
            System.out.print("Nama Matkul: ");
            mk[i] = sc.nextLine();
            
        }
        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        int[] nilai = new int[8];
        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilai[i] = sc.nextInt();
        }
        for (int i = 0; i < jumlahMK; i++) {

            if (nilai[i] > 80 || nilai[i] == 100) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4;
            } else if (nilai[i] > 73 || nilai[i] < 80) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (nilai[i] > 65 || nilai[i] < 73) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3;
            } else if (nilai[i] > 60 || nilai[i] < 65) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (nilai[i] > 50 || nilai[i] < 60) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2;
            } else if (nilai[i] < 50) {
                System.out.println("Tidak Lulus");
            } else {
                System.out.println("Ada kesalahan Mohon Diulangi");
            }

        }

        System.out.println("======================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("======================");

        System.out.println("MK      \t\t" + "Nilai Angka\t" + " Nilai Huruf\t" + "Bobot Nilai");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(mk[i] + "\t" + nilai[i] + ".00" + "\t\t" + nilaiHuruf[i] + "\t\t" + bobot[i]);
        }

        System.out.println("======================");
        for (int i = 0; i < jumlahMK; i++) {
            nilaiAkhir += bobot[i];
        }
        System.out.println("IP :" + (nilaiAkhir / jumlahMK));

    }
}
