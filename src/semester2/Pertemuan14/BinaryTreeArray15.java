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


}