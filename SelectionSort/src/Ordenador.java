import java.util.*;
public class Ordenador {
    public static int vet[] = new int [8];

    public static void inicializar() {
        Random rand = new Random();
        for(int i = 0; i< vet.length; i++) {
            vet[i] = rand.nextInt(100);
        }
    }

    public static void printar() {
        for(int i = 0; i < vet.length - 1; i++) {
            System.out.printf(" [ %d ]",vet[i]);
        }
    }

    public static void ordenar() {
        for(int i = 0; i < vet.length - 1; i++) {
            for(int j = i+1; j < vet.length; j++){
                if (vet[i] > vet[j]) {
                    int aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
    }
}
