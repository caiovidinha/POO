package uff.ic.lleme.tcc00328.aulas.introducao.colecoes1;

public class Main {

    public static void main(String[] args) {
        Colecao1 col = new ListaEncadeada();
        //col = new ListaArray();

        col.incluir(10);
        col.incluir(20);
        col.incluir(30);
        col.remover(1);
        Integer o = (Integer) col.recuperar(1);

        System.out.println(col);

    }
}
