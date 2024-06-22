import java.util.*;
public class Ordenador {
    public static int vet[] = new int[10];

    public static void Inicializador() {
        Random rand = new Random();
        for(int i = 0; i < vet.length; i++) {
            vet[i] = rand.nextInt(100);
        }
    }

    public static void printArray() {
        System.out.println("\nVetor: ");
        for(int i = 0; i < vet.length; i++) {
            System.out.printf(" [%d ]",vet[i]);
        }
    }

    public static void insertionSort () {
        for(int i = 1; i < vet.length; i++) {
            int aux = vet[i];
            int j = i-1;
            
            while(j >= 0 && vet[j] > aux) {
                vet[j + 1] = vet[j];
                j--; 
            }
            vet[j+1] = aux;
        }
        printArray();
    }
}
