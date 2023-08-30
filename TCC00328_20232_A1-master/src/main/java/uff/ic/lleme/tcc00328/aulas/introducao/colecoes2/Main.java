package uff.ic.lleme.tcc00328.aulas.introducao.colecoes2;

public class Main {

    public static void main(String[] args) {
        Colecao<Sprite> col = new ListaEncadeada<>();
        //col = new ListaArray();

        col.incluir(new Sprite());
        //col.incluir(20);
        //col.incluir(30);
        col.remover(1);
        Sprite o = col.recuperar(1);

        System.out.println(col);
        //System.out.println(col.recuperar(1) + 45);

    }
}
