package semester2.TugasP10;

public class AntriKRS15 {
        Mahasiswa15[] queue;
        int front, rear, totalProcessed;
        int maxSize = 10;
        int maxProses = 30;
    
        public AntriKRS15(){
            queue = new Mahasiswa15[maxSize];
            front = 0;
            rear = 0;
            totalProcessed = 0;
        }
    
        public boolean isEmpty() {
            return front == rear;
        }
    
        public boolean isFull() {
            return (rear + 1) % maxSize == front;
        }
    
        public void clear() {
            front = 0;
            rear = 0;
            totalProcessed = 0;
        }
    
        public void enqueue(Mahasiswa15 mhs) {
            if (!isFull()) {
                queue[rear] = mhs;
                rear = (rear + 1) % maxSize;
                System.out.println("Mahasiswa berhasil mengantri.");
            } else {
                System.out.println("Antrian penuh!");
            }
        }
    
        public void process() {
            if (size() < 2) {
                System.out.println("Antrian kurang dari 2 mahasiswa!");
                return;
            }
            if (totalProcessed + 2 > maxProses) {
                System.out.println("Batas maksimal KRS sudah tercapai!");
                return;
            }
    
            System.out.println("Proses KRS untuk: ");
            for (int i = 0; i < 2; i++) {
                System.out.println(queue[front]);
                front = (front + 1) % maxSize;
                totalProcessed++;
            }
        }
    
        public int size() {
            return (rear - front + maxSize) % maxSize;
        }
    
        public void printQueue() {
            System.out.println("Daftar Antrian: ");
            for (int i = front, count = 0; count < size(); count++) {
                System.out.println(queue[i]);
                i = (i + 1) % maxSize;
            }
        }
    
        public void printFrontTwo() {
            System.out.println("Dua Antrian Terdepan: ");
            for (int i = 0; i < 2 && i < size(); i++) {
                System.out.println(queue[(front + i) % maxSize]);
            }
        }
    
        public void printLast() {
            if (!isEmpty()) {
                System.out.println("Antrian Terakhir: " + queue[(rear - 1 + maxSize) % maxSize]);
            }
        }
    
        public void printStats() {
            System.out.println("Jumlah Antrian: " + size());
            System.out.println("Jumlah yang sudah KRS: " + totalProcessed);
        System.out.println("Jumlah yang belum KRS: " + (maxProses - totalProcessed));
    }
}
