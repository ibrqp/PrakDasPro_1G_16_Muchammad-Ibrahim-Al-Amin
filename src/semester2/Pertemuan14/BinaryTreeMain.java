package semester2.Pertemuan14;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree15 bst = new BinaryTree15();

        bst.add(new Mahasiswa15("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa15("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa15("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa15("244160220", "Dewi", "B", 3.54));

        System.out.println("Daftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 : ");
        boolean hasilCari = bst.find(3.54);
        System.out.println(hasilCari ? "Ditemukan" : "Tidak ditemukan");

        System.out.print("Cari mahasiswa dengan ipk: 3.22 : ");
        hasilCari = bst.find(3.22);
        System.out.println(hasilCari ? "Ditemukan" : "Tidak ditemukan");

        bst.add(new Mahasiswa15("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa15("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa15("244160170", "Fizi", "B", 3.46));
        System.out.println("Daftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("Penghapusan data mahasiswa:");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("Menambahkan node secara rekursif:");
        bst.root = bst.addRekursif(bst.root, new Mahasiswa15("244160301", "Gina", "A", 3.91));

        System.out.println("\nMahasiswa dengan IPK terkecil:");
        bst.cariMinIPK();

        System.out.println("\nMahasiswa dengan IPK terbesar:");
        bst.cariMaxIPK();

        System.out.println("\nMahasiswa dengan IPK di atas 3.50:");
        bst.tampilMahasiswaIPKdiAtas(bst.root, 3.50);

    }
}
