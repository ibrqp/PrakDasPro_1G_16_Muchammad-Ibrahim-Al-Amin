package Pertemuan3;

import java.util.Scanner;

public class P3_Tugas2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double persentaseBonus = 0.10;
        double persentasePajak = 0.05;

        
        System.out.print("Masukkan jumlah jam kerja per bulan: ");
        int jamKerja = input.nextInt();
        System.out.print("Masukkan upah per jam: ");
        
        double upahPerJam = input.nextDouble();
        double gajiBulanan = jamKerja * upahPerJam;
        double bonus = gajiBulanan * persentaseBonus;
        double totalSebelumPajak = gajiBulanan + bonus;
        double pajak = totalSebelumPajak * persentasePajak;       
        double totalSetelahPajak = totalSebelumPajak - pajak;

        System.out.println("Gaji bulanan sebelum pajak: Rp " + gajiBulanan);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Gaji bersih setelah pajak: Rp " + totalSetelahPajak);
    }
}