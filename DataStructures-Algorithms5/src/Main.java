
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoublyLinkedList x = new DoublyLinkedList();
        boolean cikis = false;
        while (cikis == false) {
            System.out.println("0 - exit");
            System.out.println("1 - insert first");
            System.out.println("2 - insert last");
            System.out.println("3 - insert here");
            System.out.println("4 - remove first");
            System.out.println("5 - remove last");
            System.out.println("6 - remove here");
            System.out.println("7 - print");
            System.out.print("choose an action: ");
            int action = input.nextInt();
            System.out.println("");
            switch (action) {

                case 0:
                    cikis = true;
                    break;
                case 1:
                    System.out.print("new data: ");
                    int data = input.nextInt();
                    x.insertFirst(data);
                    break;
                case 2:
                    System.out.print("new data: ");
                    int data2 = input.nextInt();
                    x.insertLast(data2);
                    break;
                case 3:
                    System.out.print("new data: ");
                    int data3 = input.nextInt();
                    System.out.print("index: ");
                    int index = input.nextInt();
                    x.insertHere(data3, index);
                    break;
                case 4:
                    x.removeFirst();
                    break;
                case 5:
                    x.removeLast();
                    break;
                case 6:
                    System.out.print("index: ");
                    int index2 = input.nextInt();
                    x.removeHere(index2);
                    break;
                case 7:
                    x.print();
                    break;
            }
            System.out.println("");
        }
    }
}
