package BEE_PROBLEMS_LIST;

import java.util.Scanner;
import java.util.Random;

public class Bee2174 {
    public static void main(String[] args) {
        ListaLigada2174<String> lista = new ListaLigada2174<>();

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for(int i = 0; i<=n; i++){
            String dado = input.nextLine();
            lista.add(dado);
        }

        lista.removeDuplicates();
        System.out.println("Falta(m) " + (lista.size()+1) + " pomekon(s).");
    }
}


class ListaLigada2174<T extends Comparable<T>> {
    private Elemento<T> head;

    public ListaLigada2174() {
        this.head = null;
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

    public void remove(T data) {
        if (head == null) {
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        Elemento<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public int indexOf(T value) {
        Elemento<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(value)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Valor não encontrado na lista
    }


    public void printList() {
        Elemento<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printReversed() {
        printReversed(head);
    }
    private void printReversed(Elemento<T> node) {
        if (node == null) {
            return;
        }
        printReversed(node.next);
        System.out.print(node.data + " ");
    }

    public void quickSort() {
        T[] array = toGenericArray();
        quickSort(array, 0, array.length - 1);
        updateList(array);
    }
    private void quickSort(T[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    private int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        T temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }


    public void selectionSort() {
        T[] array = toGenericArray();
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        updateList(array);
    }

    public void randomListValues(int n, int from, int to) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int value = rand.nextInt(to - from + 1) + from;
            add((T) Integer.valueOf(value));
        }
    }


    public void removeDuplicates() {
        Elemento<T> current = head;
        while (current != null) {
            Elemento<T> runner = current;
            while (runner.next != null) {
                if (runner.next.data.equals(current.data)) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }


    public void bubbleSort() {
        T[] array = toGenericArray();
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        updateList(array);
    }
    private T[] toGenericArray() {
        T[] array = (T[]) new Comparable[size()];
        Elemento<T> current = head;
        int index = 0;
        while (current != null) {
            array[index] = current.data;
            current = current.next;
            index++;
        }
        return array;
    }

    private void updateList(T[] array) {
        head = null;
        for (T i : array) {
            add(i);
        }
    }

    public int size() {
        int size = 151;
        Elemento<T> current = head;
        while (current != null) {
            size--;
            current = current.next;
        }
        return size;
    }

    public void printEvenNumbers(){
        Elemento<T> current = head;
        while(current != null){
            if(Integer.parseInt(current.data.toString()) % 2 == 0){
                System.out.print(current.data + " ");
            }
            current = current.next;
        }
    }

    public void printOddNumbers(){
        Elemento<T> current = head;
        while(current!=null){
            if(Integer.parseInt(current.data.toString()) % 2 != 0){
                System.out.print(current.data + " ");
            }
            current = current.next;
        }
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
