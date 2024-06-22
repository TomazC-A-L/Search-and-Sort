import java.util.*;
public class Buscador {
    public static int vet[] = new int[10];
    public static int target = 15;
    int inicio;
    int fim;
    int meio;
    
    public static void inicializador() {
        Random rand = new Random();
        for(int i = 0; i < vet.length; i++){
            vet[i] = rand.nextInt(100);
        }
        Arrays.sort(vet);
        inicio = 0;
        fim = vet.length - 1;
    }

    public static void printArray() {
        System.out.println("Vetor: ");
        for(int i = 0; i < vet.length; i++){
            System.out.print(" ["+vet[i]+"]");
        }
    }

    public static void buscar() {
        boolean achou = false;
        while(inicio <= fim){
            meio = (int) ((inicio + fim) / 2);
            if (vet[meio] == target){
                achou = true;
                break;
            }else if (vet[meio] < target){
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        if (achou == true){
            System.out.println("\nAchou");
        }else{
            System.out.println("\nNão achou");
        }
    }
}
