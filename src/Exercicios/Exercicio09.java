package Exercicios;
public class Exercicio09 {
public Exercicio09() {
Principal p = new Principal ();
double raio, area, ponto;
String situacao;

raio = 0;
area = 0;
ponto = 0;
situacao = "";
ponto = p.R.nextDouble()*100;

System.out.println("Insira um raio: ");
  raio = p.Sc.nextDouble();

area = (raio * raio) * 3.14;
if (ponto < area )
    situacao = "O ponto está dentro do circulo.";
else if (ponto == area)
    situacao = "O ponto está sob o circulo.";
else 
    situacao = "O ponto está fora do circulo.";

    System.out.println("Valor do ponto gerado de forma randomica: " + ponto +
                    "\n Área do circulo (pii = 3.14): " + area + 
                    "\n Local do ponto: " + situacao);
}
}
