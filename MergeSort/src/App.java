//Rafael Rubio 20.00611-0
//Matheus Coelho Rocha 20.00391-9

public class App {
    
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int meio = n / 2;
        int[] e = new int[meio];
        int[] d = new int[n -meio];
    
        for (int i = 0; i <meio; i++) {
            e[i] = a[i];
        }
        for (int i =meio; i < n; i++) {
            d[i -meio] = a[i];
        }
        mergeSort(e,meio);
        mergeSort(d, n -meio);
    
        merge(a, e, d,meio, n -meio);
    }

    public static void merge(
  int[] a, int[] e, int[] d, int esq, int dir) {
 
    int i = 0, j = 0, k = 0;
    while (i < esq && j < dir) {
        if (e[i] <= d[j]) {
            a[k++] = e[i++];
        }
        else {
            a[k++] = d[j++];
        }
    }
    while (i < esq) {
        a[k++] = e[i++];
    }
    while (j < dir) {
        a[k++] = d[j++];
    }
}
    public static void main(String[] args) throws Exception {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        for(int i=0; i<actual.length; i ++){
            System.out.print(actual[i] + " ");
        }
        mergeSort(actual, actual.length);
        System.out.println();
        for(int i=0; i<actual.length; i ++){
            System.out.print(actual[i] + " ");
        }
    
    }
    
}
