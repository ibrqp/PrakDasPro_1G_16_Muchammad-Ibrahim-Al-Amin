package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double rata2, nilaiLulus = 0, nilaiTidakLulus = 0;
        int jmlLulus = 0, jmlTidakLulus = 0;
        int jumlah;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = sc.nextInt();
        int[] nilaiMhs = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                jmlLulus++;
                nilaiLulus += nilaiMhs[i];
            } else {
                jmlTidakLulus++;
                nilaiTidakLulus += nilaiMhs[i];
            }
        }
        System.out.println("Rata-rata nilai lulus = " + nilaiLulus / jmlLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + nilaiTidakLulus / jmlTidakLulus);
    }
}
