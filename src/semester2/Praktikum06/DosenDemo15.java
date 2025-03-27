package semester2.Praktikum06;

import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumDosen = sc.nextInt();
        sc.nextLine(); 

        DataDosen15 list = new DataDosen15(jumDosen);

        for (int i = 0; i < jumDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode Dosen  : ");
            String kode = sc.nextLine();
            System.out.print("Nama        : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P) : ");
            char jk = sc.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia        : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            System.out.println("-------------------------------------");
            list.tambah(new Dosen15(kode, nama, jenisKelamin, usia));
        }

        list.tampil();

        System.out.println("---------------------------------------");
        System.out.println("Pencarian Data Berdasarkan Nama");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan nama dosen yang dicari: ");
        String cariNama = sc.nextLine();
        int[] hasilNama = list.pencarianDataSequential15(cariNama);
        list.tampilHasilPencarian(hasilNama, "Nama", cariNama);

        System.out.println("---------------------------------------");
        System.out.println("Pencarian Data Berdasarkan Usia");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan usia dosen yang dicari: ");
        int cariUsia = sc.nextInt();
        System.out.println("---------------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("---------------------------------------");

        int[] hasilUsia = list.pencarianDataBinary15(cariUsia, 0, jumDosen - 1);
        list.tampilHasilPencarian(hasilUsia, "Usia", String.valueOf(cariUsia));
    }
}
