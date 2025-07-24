package ProgramacionBasica.AreaTriangulo;

import java.util.Scanner;

import static ProgramacionBasica.AreaTriangulo.Calculos.calculoAreaTriangulo;

public class MainAreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Como te llamas? ");
        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre + " vamos a calcular el area de un triangulo: ");
        System.out.println("Ingrese el valor de la base del triangulo: ");
        Double base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura del triangulo: ");
        Double altura = entrada.nextDouble();
        Double areaTriangulo = calculoAreaTriangulo(base, altura);
        System.out.println("El area del triangulo es: " + areaTriangulo);
    }
}
