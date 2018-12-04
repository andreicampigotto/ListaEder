package Exercicios;

import java.util.Scanner;

public final class Exercicio12 {

    Circulo c1;
    Circulo c2;

    public Exercicio12() {
        inicializaVar();
        pedeDados();
        if (estaoSobrepostos(this.c1, this.c2)) {
            System.out.println("Estão sobrepostos");
        } else {
            System.out.println("Não estão sobrepostos");
        }
    }

    void inicializaVar() {
        c1 = new Circulo(0, 0);
        c2 = new Circulo(0, 0);
    }

    void pedeDados() {
        System.out.println("Informe as coordenadas X e Y do centro do CIRCULO 1: ");
        c1 = new Circulo(pedeeValidaFloat("Informe a coordenada X abaixo e pressione enter: "),
                pedeeValidaFloat("Informe a coordenada Y abaixo e pressione enter: "));
        System.out.println("Informe o raio do circulo 1 abaixo e pressione enter:");
        c1.setRaio(new Scanner(System.in).nextDouble());
        c1.setDiametro();
        System.out.println("Informe as coordenadas X e Y do centro do CIRCULO 2: ");
        c2 = new Circulo(pedeeValidaFloat("Informe a coordenada X abaixo e pressione enter: "),
                pedeeValidaFloat("Informe a coordenada Y abaixo e pressione enter: "));
        System.out.println("Informe o raio do circulo 2 abaixo e pressione enter:");
        c2.setRaio(new Scanner(System.in).nextDouble());
        c2.setDiametro();
    }

    boolean estaoSobrepostos(Circulo c1, Circulo c2) {
        return Math.abs(Math.sqrt(Math.pow(c2.x - c1.x, 2) + Math.pow(c2.y - c1.y, 2)) - c2.getRaio()) <= c1.getRaio();
    }

    float pedeeValidaFloat(String mensag) {
        System.out.println(mensag);
        while (true) {
            try {
                return new Scanner(System.in).nextFloat();
            } catch (Exception e) {
                System.out.println("Informe um número e pressione enter");
            }
        }
    }
}

class Circulo extends Coordenadas {

    private double raio;
    private double diametro;

    public Circulo(double raio, double x, double y) {
        super(x, y);
        this.raio = raio;
    }

    public Circulo(double x, double y) {
        super(x, y);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return this.diametro;
    }

    public void setDiametro() {
        this.diametro = Math.pow(raio, 2);
    }

    public double getCircunferecia() {
        return Math.PI * this.diametro;
    }
}

class Coordenadas {

    public double x;
    public double y;

    public Coordenadas(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
