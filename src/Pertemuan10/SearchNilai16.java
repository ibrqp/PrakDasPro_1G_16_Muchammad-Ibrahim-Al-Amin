package Pertemuan10;

import java.util.Scanner;

public class SearchNilai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int inputan = sc.nextInt();

        int[] arrNilai = new int[inputan];
        int hasil = -1;
        int key;
        int nilai;
        for (int i = 0; i < inputan; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai = sc.nextInt();
            arrNilai[i] = nilai;
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;
            }
        }
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();
    }
}
