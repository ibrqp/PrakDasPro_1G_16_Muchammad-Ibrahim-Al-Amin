package semester2.Praktikum06;

public class DataDosen15 {
    Dosen15[] listDosen;
    int idx;

    public DataDosen15(int jumlah) {
        listDosen = new Dosen15[jumlah];
        idx = 0;
    }

    void tambah(Dosen15 d) {
        if (idx < listDosen.length) {
            listDosen[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen15 d : listDosen) {
            d.tampilkanInformasi();
            System.out.println("------------------------------------");
        }
    }

    int[] pencarianDataSequential15(String cariNama) {
        int[] hasil = new int[listDosen.length];
        int jumlahHasil = 0;

        for (int i = 0; i < listDosen.length; i++) {
            if (listDosen[i].nama.equalsIgnoreCase(cariNama)) {
                hasil[jumlahHasil] = i;
                jumlahHasil++;
            }
        }

        return hasil.length > 0 ? hasil : null;
    }

    int[] pencarianDataBinary15(int cariUsia, int left, int right) {
        int[] hasil = new int[listDosen.length];
        int jumlahHasil = 0;

        if (right >= left) {
            int mid = (left + right) / 2;

            if (listDosen[mid].usia == cariUsia) {
                hasil[jumlahHasil++] = mid;
                
                int i = mid - 1;
                while (i >= left && listDosen[i].usia == cariUsia) {
                    hasil[jumlahHasil++] = i;
                    i--;
                }

                int j = mid + 1;
                while (j <= right && listDosen[j].usia == cariUsia) {
                    hasil[jumlahHasil++] = j;
                    j++;
                }

                return hasil.length > 0 ? hasil : null;
            } else if (listDosen[mid].usia > cariUsia) {
                return pencarianDataBinary15(cariUsia, left, mid - 1);
            } else {
                return pencarianDataBinary15(cariUsia, mid + 1, right);
            }
        }
        return null;
    }

    void tampilHasilPencarian(int[] hasil, String tipe, String keyword) {
        if (hasil == null || hasil.length == 0) {
            System.out.println("Data " + tipe + " dengan '" + keyword + "' tidak ditemukan.");
        } else {
            System.out.println("Ditemukan hasil pencarian:");
            for (int i = 0; i < hasil.length; i++) {
                if (hasil[i] == 0 && i > 0) break;
                System.out.println("Data ditemukan pada indeks ke-" + hasil[i]);
                listDosen[hasil[i]].tampilkanInformasi();
                System.out.println("------------------------------------");
            }
            if (hasil.length > 1 && hasil[1] != 0) {
                System.out.println(" Peringatan: Terdapat lebih dari satu data yang cocok.");
            }
        }
    }
}
