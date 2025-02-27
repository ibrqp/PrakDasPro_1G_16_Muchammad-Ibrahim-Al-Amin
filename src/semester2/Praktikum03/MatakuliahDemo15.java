package semester2.Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah15[] arrayOfMatakuliah = new MataKuliah15[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode      : ");
            kode = sc.nextLine();
            System.out.print("Nama      : ");
            nama = sc.nextLine();
            System.out.print("Sks       : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Julah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------------");

            arrayOfMatakuliah[i] = new MataKuliah15(kode, nama, sks, jumlahJam);

        }
        for (int j = 0; j < arrayOfMatakuliah.length; j++) {
            System.out.println("Data Matakuliah ke-1" + (j + 1));
            System.out.println("Kode       : "+ arrayOfMatakuliah[j].kode);
            System.out.println("Nama       : "+ arrayOfMatakuliah[j].nama);
            System.out.println("Sks        : "+ arrayOfMatakuliah[j].sks);
            System.out.println("Jumlah Jam : "+ arrayOfMatakuliah[j].jumlahJam);
            System.out.println("------------------------------");
        }
    }
}
