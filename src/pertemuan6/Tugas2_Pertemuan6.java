package pertemuan6;

public class Tugas2_Pertemuan6 {

    public static void main(String[] args) {
        String hari = "rabu", jenisBuku = null, diskon = "0%";
        int jumlahBuku = 0;

        if (hari == "rabu") {
            if (jenisBuku == "kamus") {
                if (jumlahBuku > 2) {
                    diskon = "12%";
                } else {
                    diskon = "10%";
                }
            } else if (jenisBuku == "novel") {
                if (jumlahBuku > 3) {
                    diskon = "9%";
                } else if (jumlahBuku <= 3) {
                    diskon = "8%";
                }
            }else {
                if(jumlahBuku > 3){
                    diskon = "5%";
                }
                System.out.println(diskon);
            }

        }
    }
}