package semester2.jobsheet2;

public class MataKuliahMain15 {
    public static void main(String[] args) {
        MataKuliah15 mt15 = new MataKuliah15();
        mt15.kodeMK = "AG";
        mt15.nama = "Agama";
        mt15.sks = 10;
        mt15.jumlahJam = 10;

        mt15.tampilkanInformasi();
        mt15.ubahSKS(9);
        mt15.kurangJam(15);
        mt15.tampilkanInformasi();

        MataKuliah15 mt15k = new MataKuliah15("BD", "Basis Data", 20, 10);

        mt15.tampilkanInformasi();
        mt15.ubahSKS(21);
        mt15.kurangJam(11);
        mt15.tampilkanInformasi();
    }
}