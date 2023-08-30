package uff.ic.lleme.tcc00328.aulas.introducao.colecoes3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Aluno> lst = new ArrayList<>();
        lst = new LinkedList<>();

        lst.add(new Aluno());
        lst.add(new Aluno());

        for (Aluno aluno : lst)
            System.out.println(aluno.toString());

        Map<Integer, Aluno> mp = new HashMap<>();
        Aluno a = new Aluno();
        mp.put(a.matricula, a);
        mp.get(1234);
        for (Map.Entry<Integer, Aluno> entrada : mp.entrySet())
            System.out.println(entrada.getValue());

    }
}
