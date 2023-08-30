package uff.ic.lleme.tcc00328.aulas.introducao.heranca;

public class Main {

    public static void main(String[] args) {
        Engenheiro luiz = new Engenheiro();
        luiz.cpf = 123;
        luiz.att = 9;

        Pessoa andre = new Engenheiro();
        System.out.println(andre.getClass().toString());
        Engenheiro eng = (Engenheiro) andre;
        eng.crea = 23;

        int a = ((int) 2.3) + 3;
    }
}
