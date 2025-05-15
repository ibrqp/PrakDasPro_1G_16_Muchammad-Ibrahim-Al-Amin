package semester2.Pertemuan12;
<<<<<<< HEAD

import java.util.Locale;
import java.util.Scanner;

public class SLLMain15 {
    public static void main(String[] args) {
        SingleLingkedList15 sll = new SingleLingkedList15();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jmlMhs = sc.nextInt();
        sc.nextLine();

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. AddFirst");
            System.out.println("2. AddLast");
            System.out.println("3. InsertAfter");
            System.out.println("4. InsertAt");
            System.out.println("5. Print");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Inputan: ");
            int inputan = sc.nextInt();
            sc.nextLine(); 

            if (inputan == 1) {
                Mahasiswa15 mhs = inputMahasiswa(sc);
                sll.addFirst(mhs);
                sll.print();
            } else if (inputan == 2) {
                Mahasiswa15 mhs = inputMahasiswa(sc);
                sll.addLast(mhs);
                sll.print();
            } else if (inputan == 3) {
                System.out.print("Masukkan nama Mahasiswa yang di InsertAfter: ");
                String key = sc.nextLine();
                Mahasiswa15 mhs = inputMahasiswa(sc);
                sll.insertAfter(key, mhs);
                sll.print();
            } else if (inputan == 4) {
                System.out.print("Masukkan index: ");
                int index = sc.nextInt();
                sc.nextLine(); 
                Mahasiswa15 mhs = inputMahasiswa(sc);
                sll.insertAt(index, mhs);
                sll.print();
            } else if (inputan == 5) {
                sll.print();
            } else if (inputan == 0) {
                System.out.println("Terima Kasih");
                sc.close();
                return;
            } else {
                System.out.println("Inputan tidak valid, segera ulangi!");
            }
        }
    }

    public static Mahasiswa15 inputMahasiswa(Scanner sc) {
        sc.useLocale(Locale.US);sc.useLocale(Locale.US);
        System.out.println("\nInput Data Mahasiswa");
        System.out.print("NIM    : ");
        String nim = sc.nextLine();
        System.out.print("Nama   : ");
        String nama = sc.nextLine();
        System.out.print("Kelas  : ");
        String kelas = sc.nextLine();
        System.out.print("IPK    : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 

        return new Mahasiswa15(nim, nama, kelas, ipk);
=======
public class SLLMain15 {
    public static void main(String[] args) {
        SingleLingkedList15 sll = new  SingleLingkedList15();
        Mahasiswa15 mhs1 = new Mahasiswa15("Alvaro", "24212200", "1A", 4.0);
        Mahasiswa15 mhs2 = new Mahasiswa15("Bimon", "23212201", "2B", 3.8);
        Mahasiswa15 mhs3 = new Mahasiswa15("Cintia", "22212202", "3C", 3.0);
        Mahasiswa15 mhs4 = new Mahasiswa15("Dirga", "21212203", "4D", 3.6);


        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
>>>>>>> 6d4dfdcd1e909c85d8bb13ce787e6b0ff20365be
    }
}
