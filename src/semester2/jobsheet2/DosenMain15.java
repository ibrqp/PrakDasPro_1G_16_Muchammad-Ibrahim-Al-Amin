package semester2.jobsheet2;

public class DosenMain15 {

    public static void main(String[] args) {
        Dosen15 dsn15 = new Dosen15();
        dsn15.idDosen = "11";
        dsn15.nama = "Dea";
        dsn15.statusAktif = true;
        dsn15.tahunBergabung = 2015;
        dsn15.bidangKeahlian = "Dasar Pemrograman";
        System.out.println();
        dsn15.tampilkanInformasi();
        System.out.println();

        dsn15.setStatusAktif(false);
        dsn15.hitungMasaKerja(2015);
        dsn15.ubahKeahlian("Praktek dasar pemrograman");
        dsn15.tampilkanInformasi();
        System.out.println("Masa kerja:" + dsn15.hitungMasaKerja(2018));
        System.out.println();


        Dosen15 dnsp = new Dosen15("12", "Mawar", true, 2017, "Agama");
        dnsp.tampilkanInformasi();
        dnsp.setStatusAktif(false);
        dnsp.ubahKeahlian("Dasar pemrograman");
        System.out.println();

        dnsp.tampilkanInformasi();
        // dnsp.hitungMasaKerja(2018);
        System.out.println("Masa kerja:" + dnsp.hitungMasaKerja(2018)+" tahun");
    }

}
