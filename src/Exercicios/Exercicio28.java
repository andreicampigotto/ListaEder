package Exercicios;

public class Exercicio28 {

    Principal p = new Principal();

    public Exercicio28() {
        double nNumero = 0;
        String nSituacao;

        System.out.println("Insira um número: ");
        nNumero = p.Sc.nextDouble();
        
        if (nNumero % 2 != 0) {
            System.out.println("Número é primo!");
        }
        else
           System.out.println("Número é primo!"); 
    }

}
