package pertemuan6;

import java.util.Scanner;

public class Tugas3_Pertemuan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merek, kategori;
        int ukuran, harga = 0;

        System.out.print("Masukkan Merek Sepatu (Converse/Sketcher/Nike): ");
        merek = input.nextLine();
        
        System.out.print("Masukkan Kategori Sepatu: ");
        kategori = input.nextLine();
        
        System.out.print("Masukkan Ukuran Sepatu: ");
        ukuran = input.nextInt();

        if (merek.equals("Converse")) {
            if (kategori.equals("Slip On")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                    }
                }
            } else if (kategori.equals("High Top")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                    }
                }
            }
        } else if (merek.equals("Sketcher")) {
            if (kategori.equals("Woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                    }
                }
            } else if (kategori.equals("Man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                    }
                }
            }
        } else if (merek.equals("Nike")) {
            if (kategori.equals("Kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                    }
                }
            } else if (kategori.equals("Adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                    }
                }
            }
        }

        if (harga == 0) {
            System.out.println("Sepatu tidak tersedia untuk kategori dan ukuran yang dimasukkan.");
        } else {
            System.out.println("Harga sepatu: Rp " + harga);
        }

        input.close();
    }
}
