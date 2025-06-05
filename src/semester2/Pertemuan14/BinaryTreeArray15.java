package semester2.Pertemuan14;

public class BinaryTreeArray15 {
    Mahasiswa15[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray15() {
        this.dataMahasiswa = new Mahasiswa15[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa15 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    public void add(Mahasiswa15 data) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Tree sudah penuh, tidak bisa menambahkan data lagi.");
            return;
        }

        idxLast++;
        dataMahasiswa[idxLast] = data;
    }
}