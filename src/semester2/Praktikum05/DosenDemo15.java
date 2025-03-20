package semester2.Praktikum05;

import java.util.Scanner;

public class DosenDemo15 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen15 data = new DataDosen15();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting Usia ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting Usia DSC (Tertua ke Termuda)");
            System.out.println("5. Sorting Usia DSC (Tertua ke Termuda)");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (Laki-laki / Perempuan): ");
                    String jenisk = sc.nextLine();
                    boolean jk = jenisk.equalsIgnoreCase("perempuan") ? false : true;
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();
                    data.tambah(new Dosen15(kode, nama, jk, usia));
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data setelah sorting ASC:");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data setelah sorting DSC (Selection Sort):");
                    data.tampil();
                    break;
                case 5:
                    data.insertionSort();
                    System.out.println("Data setelah sorting DSC (Insertion Sort):");
                    data.tampil();
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
