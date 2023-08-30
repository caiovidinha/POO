package uff.ic.lleme.tcc00328.aulas.introducao.colecoes2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new LinkedList<>();

        lst1.add(10);
        lst1.add(20);
        lst1.add(30);

        lst2.add(10);
        lst2.add(20);
        lst2.add(30);

        lst1.remove(1);
        lst2.remove(1);

        System.out.println(lst1);
        System.out.println(lst2);

    }
}
