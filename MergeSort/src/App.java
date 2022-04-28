public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor = {14, 31, 72, 27, 13, 60, 90, 1};
        System.out.println("Vetor desordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor ordenado:");
        MergeSort.mergeSort(vetor, vetor.length);
        System.out.println();
        
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    
    }
    
}
