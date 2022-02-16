package Sort;

import java.util.Arrays;

public class Main {
    /*
    * Although both Quicksort and Mergesort have an average time complexity of O(n log n),
    *  Quicksort is the preferred algorithm, as it has an O(log(n)) space complexity.
    * Mergesort, on the other hand, requires O(n) extra storage, which makes it quite expensive for arrays.
    *
    * Different ways to pick a pivot
    * 1.Always pick first element as pivot.
      2.Always pick last element as pivot
      3.Pick a random element as pivot.
      4.Pick median as pivot.*/

    public static void main(String[] args) {

        int array[] = {1,5,2,6,8,3,9,4};
        quickSort(array,0, array.length-1);
        //System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int A[], int begin, int end) {
        System.out.print(Arrays.toString(A));
        int pivote=A[begin]; // tomamos primer elemento como pivote
        System.out.println("  Pivote: "+pivote);
        int i=begin;         // i realiza la búsqueda de izquierda a derecha
        int j=end;           // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas
            while(A[i] <= pivote && i < j) i++; // busca elemento mayor que pivote
            while(A[j] > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= A[i];                      // los intercambia
                A[i]=A[j];
                A[j]=aux;
                System.out.print(Arrays.toString(A));System.out.println("  Pivote: "+pivote);
            }

        }
        //si se han cruzado
        A[begin]=A[j];      // se coloca el pivote en su lugar de forma que tendremos
        A[j]=pivote;        // los menores a su izquierda y los mayores a su derecha
        if(begin < j-1)
            quickSort(A, begin,j-1);          // ordenamos subarray izquierdo
        if(j+1 < end)
            quickSort(A,j+1, end);          // ordenamos subarray derecho

    }
}
