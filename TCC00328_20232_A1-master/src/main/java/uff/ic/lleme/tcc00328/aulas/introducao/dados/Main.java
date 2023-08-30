package uff.ic.lleme.tcc00328.aulas.introducao.dados;

public class Main {

    public static void main(String[] args) {
        Usuario luiz = new Usuario("Luiz");
        Usuario joao = new Usuario("Joao");

        Partida partida = new Partida();
        partida.addJogador(luiz);
        partida.addJogador(joao);

        partida.executar();
        partida.mostrarResultado();

    }
}
