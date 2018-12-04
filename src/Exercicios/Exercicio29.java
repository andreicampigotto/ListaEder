package Exercicios;

public class Exercicio29 {

    Principal p = new Principal();

    public Exercicio29() {

        String nNaoPrimo = ",";

        for (int i = 4; i < 2000; i++) {

            if (i % 2 == 0) {
                System.out.println("");
            } else if (i % 3 == 0) {
                System.out.println("");
            } else {
                nNaoPrimo = nNaoPrimo + i + ", ";
            }

        }
        System.out.println("2, 3 " + nNaoPrimo);

    }

}
