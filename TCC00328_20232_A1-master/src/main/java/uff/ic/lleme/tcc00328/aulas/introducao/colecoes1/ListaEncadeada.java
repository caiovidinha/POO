package uff.ic.lleme.tcc00328.aulas.introducao.colecoes1;

public class ListaEncadeada implements Colecao1 {

    private class No {

        public Object numero = null;
        public No proximo = null;

        public No(Object numero) {
            this.numero = numero;
        }

    }

    private No primeiro = null;
    private No ultimo = null;
    private int tamanho = 0;

    @Override
    public void incluir(Object numero) {
        if (primeiro == null) {
            primeiro = new No(numero);
            ultimo = primeiro;
        } else {
            ultimo.proximo = new No(numero);
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
    public Object recuperar(int indice
    ) {
        No proximo = primeiro;
        int ponteiro = 0;
        while (proximo != null) {
            if (ponteiro == indice)
                return proximo.numero;
            proximo = proximo.proximo;
            ponteiro++;
        }
        return null;
    }

    @Override
    public boolean contem(Object numero
    ) {
        No proximo = primeiro;
        while (proximo != null) {
            if (proximo.numero == numero)
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
            str += proximo.numero + ",";
            proximo = proximo.proximo;
        }
        str = str.substring(0, str.length() - 1);
        return String.format("[%s]", str);
    }

}
