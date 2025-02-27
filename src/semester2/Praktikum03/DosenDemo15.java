package semester2.Praktikum03;

import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Dosen15[] arrayDosen = new Dosen15[3];
        Scanner sc = new Scanner(System.in);
        String jenisKelaminn;
        int count = 1;
        for (int i = 0; i < arrayDosen.length; i++) {
            arrayDosen[i] = new Dosen15("", "", false, 0);
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            arrayDosen[i].kode = sc.nextLine();
            System.out.print("Nama          : ");
            arrayDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelaminn = sc.nextLine().trim();
            arrayDosen[i].jenisKelamin = jenisKelaminn.equalsIgnoreCase("Pria") || jenisKelaminn.equalsIgnoreCase("L");
            System.out.print("Usia          : ");
            arrayDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------------");
        }
        
        DataDosen15.dataSemuaDosen(arrayDosen);
        DataDosen15.jumlahDosenPerJenisKelamin(arrayDosen);
        DataDosen15.rerataUsiaDosenPerJenisKelamin(arrayDosen);
        DataDosen15.infoDosenPalingTua(arrayDosen);
        DataDosen15.infoDosenPalingMuda(arrayDosen);
    }
}
