
package Exercicios;

/**
 *
 * @author andrei
 */
public class Exercicio05 {

public Exercicio05() {
Principal p = new Principal();
float nMedia, nNota1, nNota2, nNota3;
String nStatus;
nStatus = "";
nMedia = 0;
nNota1 = 0;
nNota2 = 0;
nNota3 = 0;

    System.out.println("Insita a primeira nota: ");
    nNota1 = p.Sc.nextFloat();
    while ((nNota1 > 10)||(nNota1 < 0)) {
        System.out.println("Insita a primeira nota: ");
        nNota1 = p.Sc.nextFloat();
    }
    System.out.println("Insira a segunda nota: ");
    nNota2 = p.Sc.nextFloat();
    while ((nNota2 > 10)||(nNota2 < 0))  {
        System.out.println("Insita a segunda nota: ");
        nNota2 = p.Sc.nextFloat();
    }
    System.out.println("Insira a terceira nota: ");
    nNota3 = p.Sc.nextFloat();
    while ((nNota3 > 10)||(nNota3 < 0))  {
        System.out.println("Insita a terceira nota: ");
        nNota3 = p.Sc.nextFloat();
    }
    
nMedia = (nNota1 + nNota2 + nNota3) / 3;
if (nMedia < 7)
    nStatus = "reprovado";
if (nMedia >= 7)
    nStatus = "aprovado";

System.out.println("Média das notas: " + nMedia + ".\nSatus do aluno: " + nStatus); 
}    
}
