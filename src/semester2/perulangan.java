package semester2;

import java.util.Scanner;

public class perulangan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nim : ");
        long nim = sc.nextLong();
        System.out.println("=======================");
        long n = nim % 100;
        if(n < 10){
            n += 10;
        }

        System.out.println("n :" + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                // System.out.print("");
                continue;
            } else if (i % 2 != 0) {
                System.out.print(" * ");
            } else {
                System.out.print(i);
            }
        }
    }

}
