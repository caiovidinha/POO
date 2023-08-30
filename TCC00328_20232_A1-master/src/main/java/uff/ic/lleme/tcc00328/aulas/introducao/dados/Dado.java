package uff.ic.lleme.tcc00328.aulas.introducao.dados;

public class Dado {

    private int valorDeFace = 0;

    public int rolar() {
        valorDeFace = (int) (Math.random() * 6 + 1);
        return valorDeFace;
    }

    public int getValorDeFace() {
        return valorDeFace;
    }

}
