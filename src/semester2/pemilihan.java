package semester2;

import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float nilaiUas, nilaiKuis, nilaiTugas, nilaiUts;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextFloat() * (20 / 100f);

        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextFloat() * (20 / 100f);

        System.out.print("Masukkan Nilai UTS: ");
        nilaiUts = sc.nextFloat() * (30 / 100f);

        System.out.print("Masukkan Nilai UAS: ");
        nilaiUas = sc.nextFloat() * (30 / 100f);

        System.out.println("======================");
        System.out.println("======================");

        if(nilaiKuis > 100 || nilaiKuis < 0 || nilaiTugas > 100 || nilaiTugas < 0 || nilaiUts < 0 || nilaiUts  < 0 || nilaiUas > 100 || nilaiUas < 0) {

            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
            return;
        }
 
        float totall = nilaiTugas + nilaiKuis + nilaiUts + nilaiUas;
        int total = (int)totall;

        // System.out.println(total);
        if (total > 80 || total == 100) {
            System.out.println("Nilai Akhir : " + total);
            System.out.println("Nilai Huruf : A");
        } else if (total > 73 || total < 80) {
            System.out.println("Nilai Akhir : " + total);
            System.out.println("Nilai Huruf : B+");
        } else if (total > 65 || total < 73) {
            System.out.println("Nilai Akhir : " + total);
            System.out.println("Nilai Huruf : B");
        } else if (total > 60 || total < 65) {
            System.out.println("Nilai Akhir : " + total);
            System.out.println("Nilai Huruf : C+");
        } else if (total > 50 || total < 60) {
            System.out.println("Nilai Akhir : " + total);
            System.out.println("Nilai Huruf : C");
        } else if (total < 50) {
            System.out.println("Tidak Lulus");
        } else{
            System.out.println("Ada kesalahan Mohon Diulangi");
        }
        System.out.println("======================");
        System.out.println("======================");
        System.out.println("SELAMAT ANDA LULUS");

    }
}

