package Exercicios;

import java.util.ArrayList;

public class Exercicio16 {

    ArrayList<Signo> signo = new ArrayList<>();

    public Exercicio16() {
        Principal p = new Principal();
        signo.add(new Signo("aquario", 21, 1, 19, 2));
        signo.add(new Signo("peixes", 20, 2, 20, 3));
        signo.add(new Signo("aries", 21, 3, 20, 4));
        signo.add(new Signo("touro", 21, 4, 20, 5));
        signo.add(new Signo("gemeos", 21, 5, 20, 6));
        signo.add(new Signo("cancer", 21, 6, 21, 7));
        signo.add(new Signo("leao", 22, 7, 22, 8));
        signo.add(new Signo("virgem", 23, 8, 22, 9));
        signo.add(new Signo("libra", 23, 9, 22, 10));
        signo.add(new Signo("escorpiao", 23, 10, 21, 11));
        signo.add(new Signo("sagitario", 22, 11, 21, 12));
        signo.add(new Signo("capricornio", 22, 12, 20, 1));

        System.out.println("Informe o mes: ");
        int mes = p.Sc.nextInt();
        System.out.println("Informe o dia: ");
        int dia = p.Sc.nextInt();
        for (int i = 0; i < signo.size(); i++) {
            Signo get = signo.get(i);
            if (mes == get.mesInicio) {
                if (dia >= get.inicio) {
                    System.out.println("Seu signo é " + get.nome);
                }
            } else if (mes == get.mesFim) {
                if (dia <= get.fim) {
                    System.out.println("Seu signo é " + get.nome);
                }
            }
        }
    }

    class Signo {

        String nome;
        int inicio;
        int mesInicio;
        int fim;
        int mesFim;

        public Signo(String nome, int inicio, int mesInicio, int fim, int mesFim) {
            this.nome = nome;
            this.inicio = inicio;
            this.mesInicio = mesInicio;
            this.fim = fim;
            this.mesFim = mesFim;
        }

    }
}
