public class App {
    public static void main(String[] args) throws Exception {
        ListaSE lista = new ListaSE();

        Celula a = new Celula(10);
        Celula b = new Celula(20);
        Celula c = new Celula(30);
        Celula d = new Celula(40);
        Celula e = new Celula(60);

        lista.inserirNoInicio(a);
        lista.inserirNoFinal(b);
        lista.inserirNoFinal(c);
        lista.inserirNoFinal(d);
        lista.inserirNoMeio(e);
        lista.removerIndex(50);

        lista.imprimir();
        //System.out.println(lista.pesquisar(20));
    }
}
