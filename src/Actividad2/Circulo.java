package Actividad2;

public class Circulo {

    private float radio;
    private Punto centro;

    public Circulo(float r, float x, float y) {
        this.centro = new Punto(x,y);
        this.radio = r;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float area() {
        return (float) Math.PI * radio * radio;
    }

    public void imprimir() {
        centro.imprimir();
        System.out.print("r=" + radio + " A=" + area());
    }
}
