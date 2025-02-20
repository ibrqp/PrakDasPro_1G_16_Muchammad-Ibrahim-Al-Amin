package semester2.jobsheet2;

class MataKuliah15 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah15(){

    }
    public MataKuliah15(String kodeMK, String nama,int sks,int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tampilkanInformasi() {
        System.out.printf("Kode MK: %s\nNama: %s\nSKS: %s\nJumlah Jam: %s\n", 
                          kodeMK, nama, sks, jumlahJam);
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        if(sksBaru != 0){
            System.out.println("SKS Telah dirubah");
            sks = sksBaru;
        }
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("jumlah jam tidak dapat dikuarangi");
        }else{
            jumlahJam -= jam;
        }
    }
}






