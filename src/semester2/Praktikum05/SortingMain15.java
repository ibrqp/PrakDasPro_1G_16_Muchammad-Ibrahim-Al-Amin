package semester2.Praktikum05;

public class SortingMain15 {
    public static void main(String[] args) {
        int a[] = { 20, 10, 2, 7, 12 };
        int b[] = { 30, 20, 2, 8, 14 };
        int c[] = { 40, 10, 4, 9, 3 };

        Sorting15 darutat1 = new Sorting15(a, a.length);
        Sorting15 darurat2 = new Sorting15(b, b.length);
        Sorting15 darurat3 = new Sorting15(c, c.length);

        System.out.println("Data awal 1");
        darutat1.tampil();
        darutat1.bubleSort();
        System.out.println("Data sudah diurutkan dengan BUBLE SORT (ASC)");
        darutat1.tampil();

        System.out.println("Data awal 2");
        darurat2.tampil();
        darurat2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan Selection SORT (ASC)");
        darurat2.tampil();

        System.out.println("Data awal 3");
        darurat3.tampil();
        darurat3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        darurat3.tampil();
    }
}
