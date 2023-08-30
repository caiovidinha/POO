package uff.ic.lleme.tcc00328.aulas.introducao.dados;

public abstract class RegraPadrao {

    public enum Estado {
        ganhou, perdeu, jogando;
    }

    public static Estado situacao(int jogador, int[][] pontos) {
        switch (pontos[0][jogador]) {
            case 0: return Estado.jogando;
            case 7, 11: return Estado.ganhou;
            case 2, 3, 12: return Estado.perdeu;
        }
        for (int rodada = 1; rodada < pontos.length; rodada++)
            if (pontos[rodada][jogador] == 0)
                return Estado.jogando;
            else if (pontos[rodada][jogador] == 7)
                return Estado.perdeu;
            else if (pontos[rodada][jogador] == pontos[0][jogador])
                return Estado.ganhou;
        return Estado.jogando;
    }
}
