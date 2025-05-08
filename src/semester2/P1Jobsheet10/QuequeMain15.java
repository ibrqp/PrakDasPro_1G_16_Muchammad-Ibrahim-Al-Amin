package semester2.P1Jobsheet10;

import java.util.Scanner;

public class QuequeMain15 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueque");
        System.out.println("2. Dequeque");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan kapasitas queque: ");
        int n = sc.nextInt();

        Queue15 Q = new Queue15(n);

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueque(dataMasuk);
                    if (Q.IsFull()) {
                        System.out.println("Queue overflow! Program dihentikan.");
                        return;
                    }
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        if (Q.IsFull()) {
                            System.out.println("Queue overflow! Program dihentikan.");
                            return;
                        }
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

}
