package Pertemuan11;

import java.util.Scanner;

public class Flowchart2 {

    public static void main(String[] args) {
        double[][] survey = new double[10][6];
        double total = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("jawaban pertanyaan ke-" + (j + 1) + " (1-5) : ");
                survey[i][j] = sc.nextDouble();
                total += survey[i][j];
            }
            System.out.print("rata rata " + total / survey[i].length);
            System.out.println();
        }
    }
}
