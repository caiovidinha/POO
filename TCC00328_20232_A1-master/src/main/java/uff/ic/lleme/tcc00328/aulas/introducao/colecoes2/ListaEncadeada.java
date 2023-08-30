package uff.ic.lleme.tcc00328.aulas.introducao.colecoes2;

public class ListaEncadeada<T> implements Colecao<T> {

    private class No {

        public T elemento = null;
        public No proximo = null;

        public No(T elemento) {
            this.elemento = elemento;
        }

    }

    private No primeiro = null;
    private No ultimo = null;
    private int tamanho = 0;

    @Override
    public void incluir(T elemento) {
        if (primeiro == null) {
            primeiro = new No(elemento);
            ultimo = primeiro;
        } else {
            ultimo.proximo = new No(elemento);
            ultimo = ultimo.proximo;
        }
        tamanho++;
    }

    @Override
    public void remover(int indice) {
        No anterior = null;
        No no_corrente = primeiro;
        int indice_corrente = 0;
        while (no_corrente != null && indice >= 0 && indice < tamanho) {
            if (indice_corrente == indice) {
                if (no_corrente == primeiro) {
                    primeiro = no_corrente.proximo;
                    if (no_corrente == ultimo)
                        ultimo = no_corrente.proximo;
                } else {
                    anterior.proximo = no_corrente.proximo;
                    if (no_corrente == ultimo)
                        ultimo = anterior;
                }
                tamanho--;
                return;
            }
            anterior = no_corrente;
            no_corrente = no_corrente.proximo;
            indice_corrente++;
        }
    }

    @Override
    public T recuperar(int indice) {
        No proximo = primeiro;
        int ponteiro = 0;
        while (proximo != null) {
            if (ponteiro == indice)
                return proximo.elemento;
            proximo = proximo.proximo;
            ponteiro++;
        }
        return null;
    }

    @Override
    public boolean contem(T elemento) {
        No proximo = primeiro;
        while (proximo != null) {
            if (proximo.elemento == elemento)
                return true;
            proximo = proximo.proximo;
        }
        return false;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        String str = "";
        No proximo = primeiro;
        while (proximo != null) {
            str += proximo.elemento + ",";
            proximo = proximo.proximo;
        }
        str = str.substring(0, str.length() - 1);
        return String.format("[%s]", str);
    }

}
