package Exercicios;

public class Exercicio27 {

    Principal p = new Principal();

    public Exercicio27() {
        double nNumero;
        String nDivisores;
        nDivisores = " ";

        System.out.println("Insira um número: ");
        nNumero = p.Sc.nextDouble();

        
        if (nNumero % 2 != 0) {
            System.out.println("Número é divisivel por: " + nNumero + " e 1.");
        }

    }

}
