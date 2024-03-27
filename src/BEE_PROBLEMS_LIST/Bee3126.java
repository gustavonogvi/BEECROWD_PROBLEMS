package BEE_PROBLEMS_LIST;

import java.util.Scanner;

public class Bee3126 {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<>();
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        sc.nextLine();

        String[] valores = sc.nextLine().split(" ");

        for (String valor : valores) {
            lista.add(Integer.parseInt(valor));
        }
        System.out.println((int) lista.sum());
    }
}


class ListaLigada<T extends Comparable<T>> {
    private Elemento<T> head;

    public ListaLigada() {
        this.head = null;
    }

    public double sum() {
        double sum = 0;
        Elemento<T> current = head;
        while (current != null) {
            sum += Double.parseDouble(current.data.toString());
            current = current.next;
        }
        return sum;
    }

    public void add(T data) {
        Elemento<T> newNode = new Elemento<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Elemento<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Elemento<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }

    private static class Elemento<T> {
        public T data;
        public Elemento<T> next;

        public Elemento(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
