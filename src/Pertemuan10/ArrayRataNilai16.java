package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai16 {

    public static void main(String[] args) {
        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
    }

}
