public class App {
    public static void main(String[] args) throws Exception {
        ListaSE lista = new ListaSE();
        lista.inserirNoInicio(new Celula(10));
        lista.inserirNoInicio(new Celula(20));
        lista.inserirNoFinal(new Celula(40));
        lista.inserirNoFinal(new Celula(50));
        lista.inserirNoMeio(new Celula(30));
        lista.imprimir();
    }
}
