package Pertemuan4;

import java.util.Scanner;

public class Kuis16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tanggal16;
        int bulan16;
        int tahun16;
        int SE16;

        System.out.println("Nama    : MUCHAMMAD IBRAHIM AL AMIN");
        System.out.println("NIM     : 244107020062");
        System.out.println("Absen   : 16");
        System.out.println("=========== QUIZ 1 TI - 1E ===========");
        
        System.out.print("Masukkan tanggal berangkat: ");
        tanggal16 = input.nextInt();
        System.out.print("Masukkan bulan berangkat: ");
        bulan16 = input.nextInt();
        System.out.print("Masukkan tahun berangkat: ");
        tahun16 = input.nextInt();

        System.out.println("=========== Masukkan berapa lama anda SE ===========");
        System.out.print("Masukkan lama SE dalam Hari: ");
        SE16 = input.nextInt();

        int tahunSE16 = SE16 / 360;
        int sisaHari16 = SE16 % 360;
        int bulanSE16 = sisaHari16 / 30;
        int hariSE16 = sisaHari16 % 30;

        int totalHari16 = tanggal16 + hariSE16;
        int totalBulan16 = bulan16 + bulanSE16;
        int totalTahun16 = tahun16 + tahunSE16;

        int hariDalamBulan16 = 30;
        int bulanDalamTahun16 = 12;

        int bulanKepulangan16 = (totalBulan16 + (totalHari16 - 1) / hariDalamBulan16) % bulanDalamTahun16;
        int tahunKepulangan16 = totalTahun16 + (totalBulan16 + (totalHari16 - 1) / hariDalamBulan16) / bulanDalamTahun16;
        int tanggalKepulangan16 = (totalHari16 - 1) % hariDalamBulan16 + 1;

        String tanggalKepulanganStr16 = tanggalKepulangan16 + "-" + bulanKepulangan16 + "-" + tahunKepulangan16;

        System.out.println("Tanggal berangkat: " + tanggal16 + "-" + bulan16 + "-" + tahun16);
        System.out.println("Lama SE dalam tahun: " + tahunSE16 + " tahun " + bulanSE16 + " bulan " + hariSE16 + " hari");
        System.out.println("Tanggal kepulangan anda SE: " + tanggalKepulanganStr16);

    }
}
