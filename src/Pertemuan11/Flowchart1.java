package Pertemuan11;

import java.util.Scanner;

public class Flowchart1 {

    public static void main(String[] args) {
        double[][] hasilSurvey = new double[10][6];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < hasilSurvey.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < hasilSurvey[i].length; j++) {
                System.out.print("jawaban pertanyaan ke-" + (j + 1) + " (1-5) : ");
                hasilSurvey[i][j] = sc.nextDouble();
            }
        }
    }
}



