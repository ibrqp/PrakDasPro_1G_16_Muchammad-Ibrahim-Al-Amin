package semester2.jobsheet2; 

public class MahasiswaMain15 {
    public static void main(String[] args) {
        Mahasiswa15 mhs1 = new Mahasiswa15();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa15 mhs2 = new Mahasiswa15("Anisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa15 mahasiswaIbrahim = new Mahasiswa15("Muchammad Ibrahim Al Amin", "244107020062", 3.61, "TI 1G");
        mahasiswaIbrahim.tampilkanInformasi();
    }
}
