import Ejercicio1.Cuadrado;
import Ejercicio1.Circulo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(4);

        System.out.println("El area del cuadrado es = "+cuadrado1.area());
        cuadrado1.rotar();
        cuadrado1.dibujar();
    }
}