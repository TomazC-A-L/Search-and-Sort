import java.util.Random;

public class Buscador {
    private static int target = 48;
    private static int vet[] = new int[10];

    public Buscador() {

    }

    public static void printVet() {
        
        System.out.println("\nTarget = "+target);
        System.out.print("Vetor: ");
        for(int i = 1; i < vet.length; i++){
            System.out.print(" ["+vet[i]+"]");
        }
    }

    public static void inicializador() {
        Random rand = new Random();
        for(int i = 1; i < vet.length; i++){
            vet[i] = rand.nextInt(100);
        }
    }

    public static boolean buscador() {
        int cont = 0;
        boolean found = false;
        for (int i = 0; i < vet.length; i++){
            if (vet[i] == target){
                found = true;
                System.out.println("\nachou na posição: "+cont);
                return found;
            }
            cont++;
        }
        System.out.println("\nnão encontrou...");
        return found;
    }
}
