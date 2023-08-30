package uff.ic.lleme.tcc00328.aulas.introducao.colecoes2;

public interface Colecao<T> {

    public void incluir(T elemento);

    public void remover(int indice);

    public T recuperar(int indice);

    public boolean contem(T elemento);

    public int tamanho();

}
