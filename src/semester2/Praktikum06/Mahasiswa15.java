package semester2.Praktikum06;
public class Mahasiswa15 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa15(String nm, String name, String kls, double  ip){
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    Mahasiswa15(){
    }

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
        
    }
}
