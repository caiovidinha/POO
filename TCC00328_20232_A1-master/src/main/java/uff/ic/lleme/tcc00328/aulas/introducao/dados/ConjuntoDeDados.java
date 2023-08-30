package uff.ic.lleme.tcc00328.aulas.introducao.dados;

public class ConjuntoDeDados {

    private Dado[] dados = new Dado[100];

    public ConjuntoDeDados(Dado... dados) {
        this.dados = dados;
    }

    public int rolar() {
        int soma = 0;
        for (Dado d : dados)
            if (d != null)
                soma += d.rolar();
        return soma;
    }

}
