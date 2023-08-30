package uff.ic.lleme.tcc00328.exercicios.prof.teste;

public class Hello2 {
    
    public static String texto="";
    public static double constante=34;
    public static double[] vetor;
    
    public static void main(String[] args) {
        vetor = new double[12];
        vetor = new double[24];
        
        System.out.println("Hello World!");
        System.out.println(""+constante*media(12,34));
    }
    public static double media(double v1, double v2) {
        return (v1+v2)/2;
    }
}
