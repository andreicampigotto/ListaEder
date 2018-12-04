package Exercicios;

public class Exercicio11 {

    public Exercicio11() {
 Principal p = new Principal ();
double raio, xCentro, yCentro, xPonto, yPonto, diametro;
String situacao;

diametro = 0;raio = 0; xCentro = 0; yCentro = 0;xPonto = 0; yPonto = 0;

situacao = "";
xPonto = p.R.nextDouble()*100;
yPonto = p.R.nextDouble()*100;

System.out.println("Insira a coordenada X do circulo: ");
  xCentro = p.Sc.nextDouble();

System.out.println("Insira a coordenada Y do circulo: ");
  yCentro = p.Sc.nextDouble();
  
System.out.println("Insira um raio: ");
  raio = p.Sc.nextDouble();

diametro = ((yPonto - yCentro) * (yPonto - yCentro) + (xPonto - xCentro) * (xPonto - xCentro));

Math.sqrt(diametro);

if (diametro < raio)
    situacao = "O ponto está dentro do circulo";
else if (diametro == raio)
    situacao = "O ponto está sobre do circulo";
else
    situacao = "O ponto está fora do circulo";

    System.out.println("Valor X do ponto gerado de forma randomica: " + xPonto +
                     "\nValor Y do ponto gerado de forma randomica: " + yPonto + 
                     "\n Local do ponto: " + situacao);
}
}

