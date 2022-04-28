public class MergeSort {
    public static void mergeSort(int[] a, int n){
        if(n<2){
            return;
        }
        int meio = n/2;
        int[] esquerda = new int[meio];
        int[] direita = new int[n - meio];

        for(int i = 0; i<meio; i++){
            esquerda[i] = a[i];
        }
        for(int i = meio; i < n; i++){
            direita[i -  meio] = a[i];
        }

        mergeSort(esquerda, meio);
        mergeSort(direita, n - meio);

        merge(a, esquerda, direita, meio, n - meio);
    }

    public static void merge(int[] a, int[] esquerda, int[] direita, int esq, int dir){
        int i = 0, j = 0, k = 0;
        while(i < esq && j < dir){
            if(esquerda[i] <= direita[i]){
                a[k++] = esquerda[i++];
            }
            else{
                a[k++] = direita[j++];
            }
        }
        
        while(i< esq){
            a[k++] = esquerda[i++];
        }

        while(j<dir){
            a[k++] = direita[j++];
        }
    }
}
