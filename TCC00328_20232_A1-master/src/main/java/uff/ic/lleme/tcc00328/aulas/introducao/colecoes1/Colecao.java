package uff.ic.lleme.tcc00328.aulas.introducao.colecoes1;

public interface Colecao {

    public void incluir(int numero);

    public void remover(int indice);

    public Integer recuperar(int indice);

    public boolean contem(int numero);

    public int tamanho();

}
