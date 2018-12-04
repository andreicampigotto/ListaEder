package Exercicios;
public class Exercicio08 {

public Exercicio08() {
Principal p = new Principal();
int ano = 0;
   
ano = p.Sc.nextInt();

if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
System.out.println(ano + " é um ano Bissexto!");
}
else{
System.out.println(ano + " não é um ano Bissexto!");
}
}
}

