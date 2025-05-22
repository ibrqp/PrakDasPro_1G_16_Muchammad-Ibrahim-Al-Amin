package semester2.DoubleLinkedLists;

public class DoubleLinkedLists15{

       Node15 head = null;
       int size = 0;
    
       public boolean isEmpty() {
          return this.head == null;
       }
    
       public void addFirst(int item) {
          if (this.isEmpty()) {
             this.head = new Node15((Node15)null, item, (Node15)null);
          } else {
             Node15 newNode = new Node15((Node15)null, item, this.head);
             this.head.prev = newNode;
             this.head = newNode;
          }
    
          ++this.size;
       }
    
       public void addLast(int item) {
          if (this.isEmpty()) {
             this.addFirst(item);
          } else {
             Node15 current;
             for(current = this.head; current.next != null; current = current.next) {
             }
    
             Node15 newNode = new Node15(current, item, (Node15)null);
             current.next = newNode;
             ++this.size;
          }
    
       }
    
       public void add(int item, int index) throws Exception {
          if (this.isEmpty()) {
             this.addFirst(item);
          } else {
             if (index < 0 || index > this.size) {
                throw new Exception("Nilai indeks di luar batas");
             }
    
             Node15 current = this.head;
    
             for(int i = 0; i < index; ++i) {
                current = current.next;
             }
    
             Node15 newNode;
             if (current.prev == null) {
                newNode = new Node15(current.prev, item, current);
                current.prev = newNode;
                this.head = newNode;
             } else {
                newNode = new Node15(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.prev = current;
                current.prev.next = newNode;
                current.prev = newNode;
             }
          }
    
          ++this.size;
       }
    
       public int size() {
          return this.size;
       }
    
       public void clear() {
          this.head = null;
          this.size = 0;
       }
    
       public void print() {
          if (!this.isEmpty()) {
             for(Node15 tmp = this.head; tmp != null; tmp = tmp.next) {
                System.out.print(tmp.data + "\t");
             }
    
             System.out.println("\nberhasil diisi");
          } else {
             System.out.println("Linked Lists Kosong");
          }
    
       }
    }
    
