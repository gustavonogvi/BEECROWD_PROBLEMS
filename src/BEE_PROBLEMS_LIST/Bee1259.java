package BEE_PROBLEMS_LIST;

import java.util.Scanner;

public class Bee1259 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList lista = new LinkedList();

        for(int i = 0; i<n; i++){
            int valor = scan.nextInt();
            lista.add(valor);
        }
        lista.PrintPares();
        lista.PrintImpares();
    }
}

class LinkedList {
    private Elemento primeiro;
    private Elemento ultimo;

    public LinkedList(){
        this.primeiro=null;
        this.ultimo=null;
    }

    public void add(int valor){
        Elemento novoElemento = new Elemento(valor);
        if(this.primeiro == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        }else{
            this.ultimo.proximo = novoElemento;
            this.ultimo = novoElemento;
        }
    }

    public void PrintPares(){
        Elemento atual = this.primeiro;
        LinkedList pares = new LinkedList();
        while(atual != null){
            if(atual.valor % 2==0){
                pares.add(atual.valor);
            }
            atual = atual.proximo;
        }
        pares.quickSort();
        pares.imprimir();
    }

    public void PrintImpares(){
        Elemento atual = this.primeiro;
        LinkedList impares = new LinkedList();
        while(atual != null){
            if(atual.valor % 2 != 0){
                impares.add(atual.valor);
            }
            atual = atual.proximo;
        }
        impares.quickSort();
        impares.PrintInverso();
    }

    public void quickSort() {
        if (this.primeiro != null) {
            this.primeiro = quickSortRec(this.primeiro, this.ultimo);
        }
    }

    private Elemento quickSortRec(Elemento primeiro, Elemento ultimo) {
        if (primeiro == ultimo || primeiro == null || ultimo == null) {
            return primeiro;
        }

        Elemento pivot = partition(primeiro, ultimo);

        if (pivot != primeiro) {
            Elemento temp = primeiro;
            while (temp.proximo != pivot) {
                temp = temp.proximo;
            }
            temp.proximo = null;

            primeiro = quickSortRec(primeiro, temp);

            temp = getTail(primeiro);
            temp.proximo = pivot;
        }

        pivot.proximo = quickSortRec(pivot.proximo, ultimo);

        return primeiro;
    }

    private Elemento partition(Elemento primeiro, Elemento ultimo) {
        Elemento pivot = ultimo;
        Elemento i = primeiro;

        for (Elemento j = primeiro; j != ultimo; j = j.proximo) {
            if (j.valor < pivot.valor) {
                int temp = i.valor;
                i.valor = j.valor;
                j.valor = temp;

                i = i.proximo;
            }
        }

        int temp = i.valor;
        i.valor = pivot.valor;
        pivot.valor = temp;

        return i;
    }

    private Elemento getTail(Elemento primeiro) {
        Elemento temp = primeiro;
        while (temp.proximo != null) {
            temp = temp.proximo;
        }
        return temp;
    }

    public void PrintInverso(){
        Elemento atual = this.primeiro;
        LinkedList listaInvertida = new LinkedList();

        while(atual != null){
            listaInvertida.addInicio(atual.valor);
            atual = atual.proximo;
        }
        listaInvertida.imprimir();
    }

    public void addInicio(int valor){
        Elemento novoElemento = new Elemento(valor);
        if(this.primeiro == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        }else{
            novoElemento.proximo = this.primeiro;
            this.primeiro = novoElemento;
        }
    }

    public void imprimir(){
        Elemento atual = this.primeiro;
        while(atual != null){
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}


class Elemento {
    int valor;
    Elemento proximo;

    public Elemento(int valor){
        this.valor = valor;
        this.proximo = null;
    }
}
