package uff.ic.lleme.tcc00328.aulas.introducao.colecoes1;

import java.util.Arrays;

public class ListaArray implements Colecao {

    private Integer[] lista = new Integer[10];
    private int tamanho = -1;

    @Override
    public void incluir(int numero) {
        if (tamanho == lista.length)
            expandir(lista);
        lista[tamanho++] = numero;
    }

    @Override
    public void remover(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho; i++)
                lista[indice] = lista[indice + 1];
            lista[tamanho--] = null;
        }
    }

    @Override
    public Integer recuperar(int indice) {
        if (indice >= 0 && indice < tamanho)
            return lista[indice];
        return null;
    }

    @Override
    public boolean contem(int numero) {
        for (int i = 0; i < tamanho; i++)
            if (lista[i] == numero)
                return true;
        return false;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    private void expandir(Integer[] lista) {
        lista = this.lista;
        this.lista = new Integer[(int) (lista.length * 1.3)];
        for (int i = 0; i < lista.length; i++)
            this.lista[i] = lista[i];
    }

    @Override
    public String toString() {
        return Arrays.toString(lista);
    }

}
