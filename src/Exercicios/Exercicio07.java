package Exercicios;
public class Exercicio07 {

public Exercicio07() {
Principal p = new Principal();
float Valor;

    System.out.println("Insira um valor:");
    Valor = p.Sc.nextFloat();

Valor = (float) (Valor + (Valor * 0.15));
System.out.println("Valor com acrescimo de 15%: " + Valor);
}
    
}
