package pertemuan6;

public class Tugas1_Pertemuan6 {
    public static void main(String[] args) {
        int bil1 = 28, bil2 = 54, bil3 = 15;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("bilangan terbesar : " + bil1);
            } else {
                System.out.println("bilangan terbesar : " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("bilangan terbesar : " + bil2);
            } else {
                System.out.println("bilangan terbesar : " + bil3);
            }
        }
    }
}
