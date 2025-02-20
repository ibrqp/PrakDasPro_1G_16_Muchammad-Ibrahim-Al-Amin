package semester2.jobsheet2;

class Dosen15 {

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen15(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public Dosen15() {

    }

    void tampilkanInformasi() {
        System.out.printf("ID Dosen: %s\nNama: %s\nStatus: %s\nTahun Bergabung: %s\nBidang Keahlian: %s",
                idDosen, nama, statusAktif ? "Aktif" : "tidak aktif", tahunBergabung, bidangKeahlian);

        System.out.println();

    }

    void setStatusAktif(boolean Status) {
        statusAktif = Status;
    }

    int hitungMasaKerja(int thnSkrg) {
        int tahunSekarang = 2025;
        int masaKerja = tahunSekarang - thnSkrg;
        // tahunBergabung = masaKerja;
        // System.out.println("\bMasa Kerja:" + masaKerja);
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
