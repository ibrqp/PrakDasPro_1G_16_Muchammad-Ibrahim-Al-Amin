package Pertemuan3;

import java.util.Scanner;

public class P3_Tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tarifPerKwh = 1500;
        int batasPenggunaan = 500;

        System.out.print("Masukkan jumlah penggunaan listrik dalam kWh: ");
        int penggunaanKwh = input.nextInt();

        int totalTagihan = penggunaanKwh * tarifPerKwh;
        boolean melebihiBatas = penggunaanKwh > batasPenggunaan;
         
        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Apakah penggunaan melebihi 500 kWh? " + melebihiBatas);
    }
}