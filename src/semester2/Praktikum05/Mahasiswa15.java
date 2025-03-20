package semester2.Praktikum05;

public class Mahasiswa15 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa15(){
    }
    public Mahasiswa15(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }
    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
}
