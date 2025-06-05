package semester2.Pertemuan14;

public class BinaryTree15 {
    Node15 root;
    Mahasiswa15 mhs = new Mahasiswa15();

    public BinaryTree15() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa15 mahasiswa) {
        Node15 newNode = new Node15(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node15 current = root;
            Node15 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node15 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node15 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node15 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node15 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    public Node15 getSuccessor(Node15 dell) {
        Node15 successor = dell.right;
        Node15 successorParent = dell;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != dell.right) {
            successorParent.left = successor.right;
            successor.right = dell.right;
        }
        return successor;
    }

    public boolean delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return false;
        }

        Node15 current = root;
        Node15 parent = root;
        boolean isLeftChild = true;

        while (current.mahasiswa.ipk != ipk) {
            parent = current;
            if (ipk < current.mahasiswa.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }

        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            Node15 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    public Node15 addRekursif(Node15 current, Mahasiswa15 mhs) {
        if (current == null) {
            return new Node15(mhs);
        } else if (mhs.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mhs);
        } else if (mhs.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mhs);
        } else {
            System.out.println("Duplikasi IPK tidak ditambahkan,  " + mhs.ipk);
        }
        return current;
    }

    

}