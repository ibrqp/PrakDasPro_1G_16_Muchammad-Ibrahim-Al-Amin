package semester2.Pertemuan12;
public class Mahasiswa15 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa15() {
    }

    public Mahasiswa15(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilkanInformasi(){
        // System.out.println("Isi Linked List:");
        System.out.println(nama + "\t" + nim + "\t" +kelas + "\t" +ipk);
    }
}
