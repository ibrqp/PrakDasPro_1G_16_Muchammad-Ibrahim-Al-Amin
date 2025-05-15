package semester2.TugasP10;

import java.util.Scanner;

public class KrsDemo15 {
    public static void main(String[] args) {
        AntriKRS15 antrian = new AntriKRS15();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cetak Statistik");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    antrian.enqueue(new Mahasiswa15(nama, nim, prodi, kelas));
                    break;
                case 2:
                    antrian.process();
                    break;
                case 3:
                    antrian.printQueue();
                    break;
                case 4:
                    antrian.printFrontTwo();
                    break;
                case 5:
                    antrian.printLast();
                    break;
                case 6:
                    antrian.printStats();
                    break;
                case 7:
                    antrian.clear();
                    System.out.println("Antrian dikosongkan.");
                    break;
                case 0:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        input.close();
    }
}
