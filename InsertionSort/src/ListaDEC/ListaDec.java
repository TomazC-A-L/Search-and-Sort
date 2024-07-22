public class ListaDec {
    Celula primeiro;

    public ListaDec() {
        primeiro = null;
    }

    boolean vazio () {
        if (primeiro.prox == null){
            return true;
        }
        return false;
    }

    void inserirAoFinal(Celula c){
        if (vazio()){
            primeiro = c;
        } else {
            Celula aux = primeiro;
            while(aux.prox != null){
                aux = aux.prox;
            }
            aux.prox = c;
            c.ant = aux;
        }
    }

    void inserirNoInicio(Celula c) {
        if(vazio()){
            primeiro = c;
        } else {
            primeiro.ant = c;
            c.prox = primeiro;
        }
    }

    Celula pesquisar(int valor) {
        if(vazio()) {
            return null;
        } else {
            Celula aux = primeiro;
            
            while (aux.prox != null && aux.valor == valor) {
                aux = aux.prox;
            }
            return aux;
        }
    }

    void removerNoInicio () {
        if(vazio()) {
            return;
        } else {
            Celula aux = primeiro;
            primeiro = aux.prox;
        }
    }
}
