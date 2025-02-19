package semester2;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'H', 'K', 'L', 'N', 'T'};
        String[] KOTA = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
            "PEKALONGAN", "KUDUS", "SURABAYA", "MALANG", "TEGAL"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char input = Character.toUpperCase(scanner.next().charAt(0));
        scanner.close();

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                System.out.println("Nama kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}

