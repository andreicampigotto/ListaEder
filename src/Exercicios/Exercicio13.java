package Exercicios;

public class Exercicio13 {

    public Exercicio13() {
        Principal p = new Principal();
        int notas, n100, n50, n20, n10, n5, n2, n1;
        notas = 0;
        n100 = 0;
        n50 = 0;
        n20 = 0;
        n10 = 0;
        n5 = 0;
        n2 = 0;
        n1 = 0;
        System.out.println("Digite um valor em reais R$: ");
        notas = p.Sc.nextInt();

        n100 = notas / 100;
        notas = notas - (n100 * 100);

        n50 = notas / 50;
        notas = notas - (n50 * 50);

        n20 = notas / 20;
        notas = notas - (n20 * 20);

        n10 = notas / 10;
        notas = notas - (n10 * 10);

        n5 = notas / 5;
        notas = notas - (n5 * 5);

        n2 = notas / 2;
        notas = notas - (n2 * 2);

        n1 = notas / 1;
        notas = notas - (n1 * 1);

        System.out.println("Notas de 100: " + n100
                + "\nNotas de 50: " + n50
                + "\nNotas de 10: " + n10
                + "\nNotas de 5: " + n5
                + "\nNotas de 2: " + n2
                + "\nNotas de 1: " + n1);
    }
}
