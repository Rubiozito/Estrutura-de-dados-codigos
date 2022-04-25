//Rafael Rubio 20.00611-0
//Mateus Coelho 

public class App {
    
    public static void insertionSort(int[] vetor){
        for(int i = 1; i < vetor.length; i++){
          int atual = vetor[i]; 
          int j = i - 1;
          while((j >= 0) && (vetor[j] > atual)){
            vetor[j + 1] = vetor[j];
            j--;
          }
          vetor[j + 1] = atual;
        }
}
    public static void main(String args[]) throws Exception{
        int valores[] = {5, 6, 2, 7, 8, 1, 9, 3, 10, 0, 13};
        System.out.println("Ordem original:\n");
        for(int i = 0; i < valores.length; i++){
          System.out.print(valores[i] + "  ");  
        }
        insertionSort(valores);
        System.out.println("\n\nOrdenado:\n");
        for(int i = 0; i < valores.length; i++){
          System.out.print(valores[i] + "  ");  
        }
      }
    }

    /* A ordem de complexidade do algorítimo é de O(n²) */