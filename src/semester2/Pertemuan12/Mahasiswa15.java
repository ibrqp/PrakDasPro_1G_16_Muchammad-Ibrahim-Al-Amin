package semester2.Pertemuan12;
public class Mahasiswa15 {
    String nim, nama, kelas;
    double Ipk;

    public Mahasiswa15() {
    }

    public Mahasiswa15(String nama, String nim, String kelas, double Ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.Ipk = Ipk;
    }

    public void tampilkanInformasi(){
        // System.out.println("Isi Linked List:");
        System.out.println(nama + "\t" + nim + "\t" +kelas + "\t" +Ipk);
    }
}
