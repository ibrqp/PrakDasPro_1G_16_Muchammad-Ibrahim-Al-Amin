package semester2.Praktikum03;

public class DataDosen15 {
    public static void dataSemuaDosen(Dosen15[] arrayOfDosen) {
        for (Dosen15 dosen : arrayOfDosen) {
            dosen.cetakInfo();
            System.out.println("---------------------------");
        }
    }
    
    public static void jumlahDosenPerJenisKelamin(Dosen15[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen15 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("------------------------------");

    }
    
    public static void rerataUsiaDosenPerJenisKelamin(Dosen15[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;
        
        for (Dosen15 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }
        
        System.out.println("Rata-rata Usia Dosen Pria   : " + (countPria > 0 ? (totalUsiaPria / (double) countPria) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (countWanita > 0 ? (totalUsiaWanita / (double) countWanita) : 0));
        System.out.println("------------------------------");

    }
    
    public static void infoDosenPalingTua(Dosen15[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        
        Dosen15 tertua = arrayOfDosen[0];
        for (Dosen15 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.cetakInfo();
        System.out.println("------------------------------");

    }
    
    public static void infoDosenPalingMuda(Dosen15[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        
        Dosen15 termuda = arrayOfDosen[0];
        for (Dosen15 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.cetakInfo();
        System.out.println("------------------------------");
    }
}
