package semester2.jobsheet9;

import java.util.Scanner;

public class SuratIzinDemo15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat15 stack = new StackSurat15(10);

        int pilih;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin berdasarkan nama mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    stack.push(new Surat15(id, nama, kelas, jenis, durasi));
                    System.out.println("Surat berhasil ditambahkan.");
                    break;
                case 2:
                    Surat15 surat = stack.pop();
                    if (surat != null) System.out.println("Surat dari " + surat.namaMahasiswa + " diproses.");
                    break;
                case 3:
                    Surat15 peekSurat = stack.peek();
                    if (peekSurat != null) System.out.println("Surat terakhir: " + peekSurat.namaMahasiswa);
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String searchName = scan.nextLine();
                    stack.searchByName(searchName);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        scan.close();
    }
}
