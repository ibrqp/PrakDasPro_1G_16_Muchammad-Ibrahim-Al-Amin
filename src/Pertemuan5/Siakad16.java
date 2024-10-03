package Pertemuan5;

import java.util.Scanner;

public class Siakad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama,nim, nilaiKualifikasi, nilaiAkhirHuruf;
        byte absen;
        char kelas;
        float nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;


        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.next().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextFloat() * (20 / 100f);
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextFloat() * (20 / 100f);
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextFloat() * (30 / 100f) ;
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextFloat() * (30 / 100f) ;

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUTS + nilaiUAS);

        if (80 < nilaiAkhir && nilaiAkhir <=100){
            nilaiAkhirHuruf = "A";
            nilaiKualifikasi = "Sangat Baik";
        }else if (73 < nilaiAkhir && nilaiAkhir <=80){
            nilaiAkhirHuruf = "B+";
            nilaiKualifikasi = "Lebih Dari Baik";
        }else if (65 < nilaiAkhir && nilaiAkhir <=73){
            nilaiAkhirHuruf = "B";
            nilaiKualifikasi = "Baik";
        }else if (60 < nilaiAkhir && nilaiAkhir <=65){
            nilaiAkhirHuruf = "C+";
            nilaiKualifikasi = "Lebih Dari Cukup";
        }else if (50 < nilaiAkhir && nilaiAkhir <=60){
            nilaiAkhirHuruf = "C";
            nilaiKualifikasi = "Cukup";
        }else if (30 < nilaiAkhir && nilaiAkhir <=50){
            nilaiAkhirHuruf = "D";
            nilaiKualifikasi = "Kurang";
        }else{
            nilaiAkhirHuruf = "E";
            nilaiKualifikasi = "Gagal";
        }
        System.out.println("Nama: " +nama+ " Nim: "+ nim);
        System.out.println("Kelas: " +kelas+ " Absen: "+ absen);
        System.out.println("Nilai Akhir: " +nilaiAkhir);
        System.out.println("Nilai Akhir Huruf: " +nilaiAkhirHuruf);
        System.out.println("Kualifikasi: " +nilaiKualifikasi);
    }
}
