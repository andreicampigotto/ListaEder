package Exercicios;

/**
 * @author andrei
 */
public class Exercicio03 {
public Exercicio03() {
Principal p = new Principal();
int Segundos, Minutos, Horas, Dias, Meses, Anos;
Anos = 0 ; Meses = 0; Dias = 0; Horas = 0; Minutos = 0;

System.out.println("Digite o tempo em segundos: ");
Segundos = p.Sc.nextInt();

if (Segundos > 31104000)
    Anos = (Segundos / 31104000);
    Segundos = Segundos - (Anos * 31104000);

if ((Segundos > 2592000) && (Segundos <= 31104000))
    Meses = Segundos / 2592000;
    Segundos = Segundos - (Meses * 2592000);

if ((Segundos > 86400) && (Segundos <=2592000))
    Dias = Segundos / 86400;
    Segundos = Segundos - (Dias * 86400); 

if ((Segundos > 3600) && (Segundos <= 86400))
    Horas = Segundos / 3600;
    Segundos = Segundos - (Horas * 3600);

if ((Segundos >= 60) && (Segundos <= 3600))
    Minutos = Segundos / 60; 
    Segundos = Segundos - (Minutos * 60);
    
    System.out.println(Anos     + " Anos;    \n" + 
                       Meses    + " Meses;   \n" +  
                       Dias     + " Dias;    \n" + 
                       Horas    + " Horas;   \n" + 
                       Minutos  + " Minutos; \n" + 
                       Segundos + " Segundos;  ");
}
}
