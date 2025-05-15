package semester2.jobsheet9;

public class Surat15 {
        String idSurat, namaMahasiswa, kelas;
        char jenisIzin; // 'S' untuk sakit, 'I' untuk izin keperluan lain
        int durasi;
    
        Surat15() {

        }
    
        Surat15(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
            this.idSurat = idSurat;
            this.namaMahasiswa = namaMahasiswa;
            this.kelas = kelas;
            this.jenisIzin = jenisIzin;
            this.durasi = durasi;
        }
    }
