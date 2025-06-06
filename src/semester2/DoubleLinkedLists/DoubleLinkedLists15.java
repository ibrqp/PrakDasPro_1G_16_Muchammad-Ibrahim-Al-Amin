package semester2.DoubleLinkedLists;

public class DoubleLinkedLists15 {

   Node15 head = null;
   int size = 0;

   public boolean isEmpty() {
      return head == null;
   }

   public DoubleLinkedLists15() {
      head = null;
      size = 0;
   }

   public void addFirst(int item) {
      if (isEmpty()) {
         head = new Node15((Node15) null, item, (Node15) null);
      } else {
         Node15 newNode = new Node15((Node15) null, item, head);
         head.prev = newNode;
         head = newNode;
      }

      ++size;
   }

   public void addLast(int item) {
      if (isEmpty()) {
         addFirst(item);
      } else {
         Node15 current;
         for (current = head; current.next != null; current = current.next) {
         }

         Node15 newNode = new Node15(current, item, (Node15) null);
         current.next = newNode;
         ++size;
      }

   }

   public void add(int item, int index) throws Exception {
      if (isEmpty()) {
         addFirst(item);
      } else {
         if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
         }

         Node15 current = head;

         for (int i = 0; i < index; ++i) {
            current = current.next;
         }

         Node15 newNode;
         if (current.prev == null) {
            newNode = new Node15(current.prev, item, current);
            current.prev = newNode;
            head = newNode;
         } else {
            newNode = new Node15(current.prev, item, current);
            newNode.prev = current.prev;
            newNode.prev = current;
            current.prev.next = newNode;
            current.prev = newNode;
         }
      }

      ++size;
   }

   public int size() {
      return size;
   }

   public void clear() {
      head = null;
      size = 0;
   }

   public void print() {
      if (!isEmpty()) {
         for (Node15 tmp = head; tmp != null; tmp = tmp.next) {
            System.out.print(tmp.data + "\t");
         }

         System.out.println("\nberhasil diisi");
      } else {
         System.out.println("Linked Lists Kosong");
      }
   }

   public void removeFirst() throws Exception {
      if (isEmpty()) {
         throw new Exception("Linked List masih kosong, tidak dapat dihapus!");

      } else if (size == 1) {
         removeLast();
      } else {
         head = head.next;
         head.prev = null;
         size--;
      }
   }

   public void removeLast() throws Exception {
      if (isEmpty()) {
         throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
      } else if (head.next == null) {
         head = null;
         size--;
         return;
      }
      Node15 current = head;
      while (current.next.next != null) {
         current = current.next;
      }
      current.next = null;
      size--;
   }

   public void remove(int index) throws Exception {
      if (isEmpty() || index >= size) {
         throw new Exception("Nilai indeks di luar batas");
      } else if (index == 0) {
         removeFirst();
      } else {
         Node15 current = head;
         int i = 0;
         while (i < index) {
            current = current.next;
            i++;
         }
         if (current.next == null) {
            current.prev.next = null;
         } else if (current.prev == null) {
            current = current.next;
            current.prev = null;
            head = current;
         } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
         }
         size--;
      }
   }

   public int getFirst() throws Exception {
      if (isEmpty()) {
         throw new Exception("Linked List kosong");
      }
      return head.data;
   }

   public int getLast() throws Exception {
      if (isEmpty()) {
         throw new Exception("Linked List kosong");
      }
      Node15 tmp = head;
      while (tmp.next != null) {
         tmp = tmp.next;
      }
      return tmp.data;
   }

   public int get(int index) throws Exception {
      if (isEmpty() || index >= size) {
         throw new Exception("Nilai indeks di luar batas.");
      }
      Node15 tmp = head;
      for (int i = 0; i < index; i++) {
         tmp = tmp.next;
      }
      return tmp.data;
   }
}
