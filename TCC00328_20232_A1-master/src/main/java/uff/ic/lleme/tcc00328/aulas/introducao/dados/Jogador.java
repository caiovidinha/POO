package uff.ic.lleme.tcc00328.aulas.introducao.dados;

public class Jogador {

    private Usuario usuario;
    private Partida partida;

    private Jogador() {

    }

    public Jogador(Usuario usuario, Partida partida) {
        this.usuario = usuario;
        this.partida = partida;
    }

    public int jogar(ConjuntoDeDados dados) {
        return dados.rolar();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Partida getPartida() {
        return partida;
    }
}
