package Pertemuan14;

public class PengunjungCafe16 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra", "Andi");
    }
    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("-" + namaPengunjung[i]);
        }
    
    }
}