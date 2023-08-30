package uff.ic.lleme.tcc00328.aulas.introducao.dados;

import java.util.Calendar;
import java.util.Date;

public class Partida {

    private final Date data;
    private final Jogador[] jogadores = new Jogador[10];
    private final int[][] pontos = new int[100][jogadores.length];

    public Partida() {
        data = Calendar.getInstance().getTime();
    }

    public void addJogador(Usuario usuario) {
        for (int i = 0; i < jogadores.length; i++)
            if (jogadores[i] == null) {
                jogadores[i] = new Jogador(usuario, this);
                return;
            }
    }

    public Date getData() {
        return data;
    }

    public void executar() {
        for (int rodada = 0; rodada < pontos.length; rodada++)
            for (int j = 0; j < jogadores.length; j++)
                if (jogadores[j] != null && RegraPadrao.situacao(j, pontos) == RegraPadrao.Estado.jogando)
                    pontos[rodada][j] = jogadores[j].jogar(new ConjuntoDeDados(new Dado(), new Dado()));
    }

    public void mostrarResultado() {
        for (int j = 0; j < jogadores.length; j++)
            if (jogadores[j] != null) {
                System.out.print(jogadores[j].getUsuario().nome + ": ");
                for (int rodada = 0; rodada < pontos.length; rodada++) {
                    if (pontos[rodada][j] == 0)
                        break;
                    System.out.print("" + pontos[rodada][j] + ", ");
                }
                System.out.println("(" + RegraPadrao.situacao(j, pontos) + ")");
            }
    }

}
