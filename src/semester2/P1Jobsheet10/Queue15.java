package semester2.P1Jobsheet10;

public class Queue15 {

    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue15(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }

    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queque masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queque masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);

        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queque berhasil dikosongkan");
        } else {
            System.out.println("Quequw masih kosong");
        }
    }

    public void Enqueque(int dt) {
        if (IsFull()) {
            System.out.println("Queque sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }

    }

    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Dequeue masih kosong");
            return -1;
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}