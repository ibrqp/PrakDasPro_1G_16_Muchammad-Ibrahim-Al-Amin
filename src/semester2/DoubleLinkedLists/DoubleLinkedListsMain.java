package semester2.DoubleLinkedLists;

public class DoubleLinkedListsMain {
   public static void main(String[] args) throws Exception {
      DoubleLinkedLists15 dll = new DoubleLinkedLists15();
      dll.print();
      System.out.println("Size : " + dll.size);
      System.out.println("====================================");
      dll.addFirst(3);
      dll.addLast(4);
      dll.addFirst(7);
      dll.print();
      System.out.println("Size : " + dll.size);
      System.out.println("====================================");
      dll.add(40, 1);
      dll.print();
      System.out.println("Size : " + dll.size);
      System.out.println("====================================");
      dll.clear();
      dll.print();
      System.out.println("Size : " + dll.size());
   }
}

