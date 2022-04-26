// Rafael Rubio Carnes 20.00611-0
// Matheus Coelho Rocha 20.00391-9

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int size, i, j, temp;
        int[] vet = new int[50];
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor a ser ordenado:");
        size = scan.nextInt();

        System.out.println("Numeros do vetor:");
        for(i=0; i<size; i++){
            vet[i] = scan.nextInt();
        }
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
