package semester2.Praktikum06;

public class Dosen15 {
    String kode;
    String nama;
    boolean jenisKelamin; // true = laki-laki, false = perempuan
    int usia;

    public Dosen15(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilkanInformasi() {
        System.out.println("Kode Dosen  : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia        : " + usia);
    }
}
