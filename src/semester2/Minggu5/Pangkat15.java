package semester2.Minggu5;

public class Pangkat15 {
    int nilai, pangkat;

    public Pangkat15(int n, int p) {
        nilai = n;
        pangkat = p;
    }

    int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) { // Menggunakan atribut pangkat
            hasil *= nilai; // Menggunakan atribut nilai
        }
        return hasil;
    }
    
 
    int pangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
}
