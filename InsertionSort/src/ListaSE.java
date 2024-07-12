public class ListaSE {
    Celula primeiro;

    public ListaSE() {
        primeiro = null;
    }

    public boolean vazia(){
        return (primeiro == null);
    }

    public void inserirNoInicio(Celula c) {
        c.prox = primeiro;
        primeiro = c;
    }

    public void inserirNoFinal(Celula c){
         if(vazia()) {
            primeiro = c;
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
        if(vazia()){
            primeiro = c;
        }else if (aux.prox == null) {
            if(aux.valor > c.valor){
                inserirNoFinal(c);
            }
            if(aux.valor < c.valor) {
                c.prox = primeiro;
                primeiro = c;
            }
        }else {
            while(aux.prox != null) {
                if(c.valor > aux.valor && c.valor < aux.prox.valor){
                    c.prox = aux.prox;
                    aux.prox = c;
                }
                aux = aux.prox; 
            }
            if(aux.prox == null){
                inserirNoFinal(c);
            }
        }
    }

    public Celula pesquisar(int v) {
        if (vazia()){
            return null;
        } else {
            Celula aux = primeiro;
            while(aux.valor != v && aux != null) {
                aux = aux.prox;
            }
            return aux;
        }
    }

    public void removeInicio(){
        if(vazia()){
            return;
        } else {
            Celula aux = primeiro;
            if(aux.prox == null) {
                primeiro = null;
            } else{
                primeiro = aux.prox;
                aux.prox = null;
            }
        }
    }

    public void removerNoFinal(){
        if(vazia()){
            return;
        }
        else {
            Celula aux = primeiro;
            if(aux.prox != null){
                while(aux.prox.prox != null){
                    aux = aux.prox;
                }
            aux.prox = null;
            } else {
                aux = primeiro;
                primeiro = null;
            }
        }
    }

    public void removerIndex(int valor){
        if (vazia()){
            return;
        }
        else {
            Celula aux = primeiro;
            if(aux.valor == valor) {
                removeInicio();
            } else {
                while(aux.prox != null){
                    if(aux.prox.valor != valor) {
                        aux = aux.prox;
                    } else {
                        break;
                    }
                }
                if (aux.prox != null && aux.prox.valor == valor)
                    aux.prox = aux.prox.prox;
                if (aux.valor == valor)
                    removerNoFinal();
            }
        }
    }

    public void imprimir() {
        Celula aux = primeiro;
        while(aux != null) {
            System.out.println("valor: " + aux.valor);
            aux = aux.prox;
        }
    }
}
