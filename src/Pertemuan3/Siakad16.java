package Pertemuan3;
import java.util.Scanner;
 

public class Siakad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama,nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;


        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.next();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        Nilai-Akhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3 ;

        System.out.println("Nama: " +nama+ " Nim: "+ nim);
        System.out.println("Kelas: " +kelas+ " Absen: "+ absen);
        System.out.println("Nilai Akhir: " +nilaiAkhir);

    
    }
}
