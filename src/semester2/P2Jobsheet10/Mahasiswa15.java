package semester2.P2Jobsheet10;

public class Mahasiswa15 {
    String nim, nama, prodi, kelas;
    
    public Mahasiswa15(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);

    }

}
