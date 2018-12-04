package Exercicios;
public class Exercicio02 {
public Exercicio02() {
Principal p = new Principal();
    
    float raio, area;    
    System.out.println("Insira o valor do raio:");
    raio = p.Sc.nextFloat();
    area = (float) (3.14 * (raio * raio));
    System.out.println("Área do circulo: " + area + " ua²."); 
}
}
