public class App {
    public static void selections(int[] lista){
        for (int i = 0; i < lista.length; i++){
            int index = i;
            for(int j = i+1; j < lista.length; j++){
                if(lista[j] < lista[index]){
                    index = j;
                }
            }
            int menor = lista[index];
            lista[index] = lista[i];
            lista[i] = menor;
        }
    }

    public static void main(String[] args) throws Exception {
        int[] lista = {10, 5, 20, 4, 8, 12, 25, 1};
        System.out.println("Lista antes da ordenacao:");
        for(int i:lista){
            System.out.print(i + " ");
        }
        System.out.println();

        selections(lista);

        System.out.println("Lista ordenada:");
        for(int i:lista){
            System.out.print(i+" ");
        }
    }

}
