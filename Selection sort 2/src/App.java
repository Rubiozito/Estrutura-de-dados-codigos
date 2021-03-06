import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int size, i, j, temp;
        int[] vet = new int[50];
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o tamanho do vetor a ser ordenado:");
            size = scan.nextInt();

            System.out.println("Numeros do vetor:");
            for(i=0; i<size; i++){
                vet[i] = scan.nextInt();
            }
        }
        System.out.println("Vetor:");
        for(i=0; i<size; i++){
            System.out.print(vet[i] + " ");
        }
        System.out.println();
        System.out.println("Ordenando o vetor...");

        for(i=0; i<size; i++){
            for(j= i+1;j<size; j++){
                if(vet[i] > vet[j]){
                    temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }
        System.out.println("Vetor ordenado:");
        for(i=0; i<size; i++){
            System.out.print(vet[i]+" ");
        }
    }
}
