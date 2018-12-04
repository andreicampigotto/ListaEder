package Exercicios;

public class Exercicio15 {

    public Exercicio15() {
        Principal p = new Principal();
        System.out.println("Insira uma data válida na mascara NN/NN/NNNN: ");
        if (p.Sc.next().matches("^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$")) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }
    }

}
