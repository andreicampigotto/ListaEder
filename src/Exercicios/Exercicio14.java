package Exercicios;

public class Exercicio14 {

    public Exercicio14() {
        int dia, mes, ano;
        dia = 0;
        mes = 0;
        ano = 0;

        Principal p = new Principal();
        System.out.println("Informe ano");
        ano = p.Sc.nextInt();
        System.out.println("Informe mes");
        mes = p.Sc.nextInt();
        System.out.println("Informe dia");
        dia = p.Sc.nextInt();

        if (ano > 0) {
            if ((mes % 2 == 0) && (mes != 2)) {
                if (dia > 0 && dia <= 31) {
                    System.out.println("Data válida");
                } else {
                    System.out.println("Data inválida");
                }
            } else {
                System.out.println("Data inválida");
            }
        } else if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 9) || (mes == 11)) {

            if (dia > 0 && dia <= 30) {
                System.out.println("Data válida");
            } else {
                System.out.println("Data inválida");
            }
        } else if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
            if (mes == 2) {
                if (dia > 0 && dia <= 29) {
                    System.out.println("Data válida");
                } else {
                    System.out.println("Data inválida");
                }
            } else if (mes == 2) {
                if (dia > 0 && dia <= 28) {
                    System.out.println("Data válida");
                } else {
                    System.out.println("Data inválida");
                }
            }
        } else {
            System.out.println("Data inválida");
        }
    }
}
