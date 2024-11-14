package Pertemuan11;

import java.util.Scanner;

public class SIAKAD16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][4];
        for (int i = 0; i < nilai.length; i++) {
            System.err.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai.length; j++) {
                System.err.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa / 3);
        }
        System.out.println("\n==================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");
        for (int j = 0; j < nilai.length; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / 4);
        }
    }
}
