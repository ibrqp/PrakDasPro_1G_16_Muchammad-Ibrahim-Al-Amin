package semester2.TugasP10;

public class Mahasiswa15{
    String nama;
    String nim;
    String prodi;
    String kelas;

    Mahasiswa15(String nama, String nim, String prodi, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Prodi: " + prodi + ", Kelas: " + kelas;
    }
}
