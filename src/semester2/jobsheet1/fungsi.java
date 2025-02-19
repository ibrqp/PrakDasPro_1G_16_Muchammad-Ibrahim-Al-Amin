package semester2;

public class fungsi {

    public static int total;
    public static int stock[][] = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    public static String[] nama = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    public static int[] harga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        menampilkan();
        System.out.println();
        update();
    }

    static void menampilkan() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                total += harga[j] * stock[i][j];
            }
            System.out.println("Total RoyalGarden " + (i + 1) + " Rp." + total);
            total=0;
        }
    }

    static void update() {
        System.out.println("Setelah Update Royal Garden 4");
        System.out.println(
            "Stock " + nama[0] + " = " + stock[3][0] + ", " +
            nama[1] + " = " + stock[3][1] + ", " +
            nama[2] + " = " + stock[3][2] + ", " +
            nama[3] + " = " + stock[3][3]
        );
    }
    
}
