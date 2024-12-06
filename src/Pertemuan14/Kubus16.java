package Pertemuan14;

import java.util.Scanner;

public class Kubus16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi dari kubus: ");
        int s = sc.nextInt();

        hitungVolume(s);
        luarPermukaanVolume(s);

        System.out.println("Volume Kubus : " + hitungVolume(s)+" cm³");
        System.out.println("Luar Permukaan Volume : " + luarPermukaanVolume(s)+ " cm³");
    }
    public static int hitungVolume(int sisi) {
        int V = sisi * sisi * sisi;
        return V;
    }
    public static int luarPermukaanVolume(int sisi) {
        int L = 6 * (sisi * sisi);
        return L;
    }
}
