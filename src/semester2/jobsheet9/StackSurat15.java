package semester2.jobsheet9;

public class StackSurat15 {
    Surat15[] stack;
    int top;

    public StackSurat15(int size) {
        stack = new Surat15[size];
        top = -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat15 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat.");
        }
    }
    public Surat15 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat15 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(name)) {
                System.out.println("Surat ditemukan: " + stack[i].namaMahasiswa + ", " + stack[i].kelas + ", Jenis: " + stack[i].jenisIzin + ", Durasi: " + stack[i].durasi);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Surat tidak ditemukan.");
    }
}
