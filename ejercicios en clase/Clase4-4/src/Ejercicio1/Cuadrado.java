package Ejercicio1;

public class Cuadrado implements Figura,rotable,dibujable{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public void rotar() {
        System.out.println("el cuadrado se ha rotado");
    }

    @Override
    public void dibujar() {
        System.out.println("el cuadrado se ha dibujado");
    }
}
