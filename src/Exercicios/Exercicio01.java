package Exercicios;
/**
 * @author andrei
 */
public class Exercicio01 {

public Exercicio01() {
float Celcius, Fahrenheit;
    Principal p = new Principal();

    System.out.println("Digite uma temperatura em ºC:");
    Celcius = p.Sc.nextFloat();
    Fahrenheit = (float) ((Celcius * 1.8) + 32);
    System.out.println("Graus em Fahrenheit: " + Fahrenheit);  
    }
}
