package Exercicios;

public class Exercicio32 {

    public Exercicio32() {

        long numero_anterior = 0L;
        long aux = 0L;
        long numero_atual = 1L;
        long contador = 0L;

        while (contador < 90L) {

            System.out.println(numero_atual);
            aux = numero_anterior;
            numero_anterior = numero_atual;
            numero_atual += aux;

            contador++;

        }

    }
}
