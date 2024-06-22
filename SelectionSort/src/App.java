import java.util.*;
public class App {
    public static void main(String[] args){
        Ordenador.inicializar();
        System.out.println("\nDesordenado");
        Ordenador.printar();
        System.out.println("\nOrdenado");
        Ordenador.ordenar();
        Ordenador.printar();
    }
}

