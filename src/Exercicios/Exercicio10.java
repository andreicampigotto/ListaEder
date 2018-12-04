package Exercicios;

public class Exercicio10 {

    int m = 0;

    public Exercicio10() {
        Principal p = new Principal();
        String triangulo = "";
        double medidas[] = new double[3];
        double aux;
        for (m = 0; m <= 2; m++) {
            System.out.println("Insira a medida do lado: ");
            medidas[m] = p.Sc.nextDouble();
        }
        for (int i = 0; i < m - 1; i++) {
            for (int j = 1; j < m; j++) {
                if (medidas[i] > medidas[j]) {
                    aux = medidas[i];
                    medidas[i] = medidas[j];
                    medidas[j] = aux;
                }
            }
        }
 
        for (int i = 0; i < m; ++i) {
            System.out.print(medidas[i] + " ");
        }
        
        if ((medidas[0] == medidas[1]) && (medidas[2] == medidas[1])) {
            triangulo = "Triângulo Equilátero";
        }
        else if ((medidas[0] != medidas[1]) && (medidas[2] != medidas[1])){
            triangulo = "Triângulo Escaleno";
        }
        else if ((medidas[0] < medidas[1]) && (medidas[1] < medidas[2])){
            triangulo = "Triângulo Retângulo";
        }
        else if ((medidas[0] < medidas[1]) && (medidas[1] == medidas[2])){
            triangulo = "Triângulo Isósceles";
        }
        else
            triangulo = "Triângulo Obtuso";
        
        
        
        
        System.out.println("\n"+triangulo);

    }
}
