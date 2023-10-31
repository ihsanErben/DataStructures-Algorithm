
public class DoublyLinkedList {

    Node first;
    Node last;

    public void insertFirst(int a) {
        Node newNode = new Node(a);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
        print();
    }

    public void insertLast(int a) {
        Node newNode = new Node(a);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        print();
    }

    public void insertHere(int x,int a) {
        Node newNode = new Node(x);
        int go = a;
        int size = size();
        if (a >= 0 && a < size) {
            if (first == null) {
                first = newNode;
                last = newNode;
            } else if (a == (size - 1)) {
                last.prev.next = newNode;
                newNode.prev = last.prev;
                newNode.next = last;
                last.prev = newNode;
            } else {
                Node tmp2 = first;
                while (go != 0) {
                    tmp2 = tmp2.next;
                    go--;
                }
                tmp2.prev.next = newNode;
                newNode.prev = tmp2.prev;
                newNode.next = tmp2;
                tmp2.prev = newNode;
            }

        } else {
            System.out.println("Invalid Value...");
            return;
        }
        print();
    }

    public void removeFirst() {
        if (first == null) {
            System.out.println("It is empty.");
        } else if (first == last) {
            first = null;
            last = null;
            System.out.println("The last data was deleted. It is empty.");
        } else {
            first = first.next;
            first.prev = null;
        }
        print();
    }

    public void removeLast() {
        if (first == null) {
            System.out.println("It is empty.");
        } else if (first == last) {
            first = null;
            last = null;
            System.out.println("The last data was deleted. It is empty.");
        } else {
            last = last.prev;
            last.next = null;
        }
        print();
    }

    public void removeHere(int n) {
        int size = size();
        int go = n;
        if (n >= 0 && n < size) {

            if (first == null) {
                System.out.println("It is empty.");
            } else if (first == last) {
                first = null;
                last = null;
            } else if (n == (size - 1)) {
                last = last.prev;
                last.next = null;
            }else if(n == 0){
                first = first.next;
                first.prev = null;
            }
            else {
                Node tmp2 = first;
                while (go != 0) {
                    tmp2 = tmp2.next;
                    go--;
                }
                
                tmp2.prev.next = tmp2.next;
                tmp2.next.prev = tmp2.prev;

                tmp2.prev = null;
                tmp2.next = null;
            }

        } else {
            System.out.println("Invalid Value...");
        }
        print();
    }

    public void print() {
        if (first == null) {
            System.out.println("It is empty.");
        } else {
            Node print = first;
            while (print != null) {
                System.out.print(print.data + " -> ");
                print = print.next;
            }
        }
        System.out.println("");
    }

    public int size() {
        Node tmp = first;
        int size = 0;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }
        return size;
    }
}
