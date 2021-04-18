package Actividad2;

public class Punto {

    private float x;
    private float y;
    
    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void imprimir() {
        System.out.println("Coordenadas x:"+this.x+" y:"+this.y);
    }
}
