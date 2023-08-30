package uff.ic.lleme.tcc00328.aulas.introducao.colecoes2;

import java.util.Arrays;

public class ListaArray<T> implements Colecao<T> {

    private Object[] lista = new Integer[10];
    private int tamanho = -1;

    @Override
    public void incluir(T elemento) {
        if (tamanho == lista.length)
            expandir(lista);
        lista[tamanho++] = elemento;
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
    public T recuperar(int indice) {
        if (indice >= 0 && indice < tamanho)
            return (T) lista[indice];
        return null;
    }

    @Override
    public boolean contem(T elemento) {
        for (int i = 0; i < tamanho; i++)
            if (lista[i] == elemento)
                return true;
        return false;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    private void expandir(Object[] lista) {
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
