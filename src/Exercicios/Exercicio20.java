package Exercicios;

public class Exercicio20 {

    Principal p = new Principal();
    double CoinfA, CoinfB, CoinfC, X1, X2, Raiz;
    
    public void pedeDados() {
        System.out.println("Digite o coificiente a:    " + "  X²");
        CoinfA = p.Sc.nextDouble();
        System.out.println("Digite o coificiente b:    " + "  X");
        CoinfB = p.Sc.nextDouble();
        System.out.println("Digite o coificiente c:    ");
        CoinfC = p.Sc.nextDouble();
    }
    
    public Exercicio20() {
        pedeDados();
        Raiz = (CoinfB * CoinfB) - (4 * (CoinfA * CoinfC));
        Math.sqrt(Raiz);
        X1 = ((-CoinfB + Raiz) / (2 * CoinfA));
        X2 = ((-CoinfB - Raiz) / (2 * CoinfA));

        System.out.println("X' =  " + X1
                + "\nX'' = " + X2);

    }
    
}
