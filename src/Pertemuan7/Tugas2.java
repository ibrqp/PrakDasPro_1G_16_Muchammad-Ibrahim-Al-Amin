package Pertemuan7;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        int jenis, durasi, total;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 keluar) : ");
            jenis = input.nextInt();

            if (jenis != 0) {
                if (jenis == 1 || jenis == 2) {

                    System.out.print("Masukkan Durasi Parkir (jam) : ");
                    durasi = input.nextInt();

                    if (durasi > 5) {
                        total = 12500;  
                    } else if (jenis == 1) {
                        total = durasi * 3000;  
                    } else {
                        total = durasi * 2000; 
                    }

                    System.out.println("Total yang harus dibayar: Rp " + total);
                } else {
                    System.out.println("Jenis kendaraan tidak valid. Silakan masukkan lagi.");
                }
            }
        } while (jenis != 0); 

        System.out.println("Terima kasih! Program selesai.");
        input.close();
    }
}
 