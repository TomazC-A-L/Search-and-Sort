public class ListaSE {
    Celula primeiro;

    public ListaSE() {
        primeiro = null;
    }

    public void inserirNoInicio(Celula c) {
        c.prox = primeiro;
        primeiro = c;
    }

    public void inserirNoFinal(Celula c){
         if(c == null) {
            
         } else {
            Celula aux = primeiro;
            while(aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = c;
         }
    }

    public void inserirNoMeio(Celula c){
        Celula aux = primeiro;
        if(aux == null){
            if(aux.valor > c.valor){
                inserirNoInicio(c);
            }
            if(aux.valor < c.valor) {
                inserirNoFinal(c);
            }
        }
        while(aux.prox != null) {
            if(c.valor > aux.valor && c.valor < aux.prox.valor){
                c.prox = aux.prox;
                aux.prox = c;
            }
            if(aux.prox == null){
                aux.prox = c;
            }
            aux = aux.prox; 
        }
    }

    public void removerNoFinal(Celula c){
        Celula aux = primeiro;
        while(aux.prox.prox != null){
            aux = aux.prox;
        }
        aux.prox = null;
        c = null;
    }

    public void imprimir() {
        Celula aux = primeiro;
        while(aux != null) {
            System.out.println("valor: " + aux.valor);
            aux = aux.prox;
        }
    }
}
