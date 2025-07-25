package Clases.AreaPerRectangulo;

public class Rectangulo {
    Double punto1;
    Double punto2;

    public Rectangulo(Double punto1, Double punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Double getPunto1() {
        return punto1;
    }

    public void setPunto1(Double punto1) {
        this.punto1 = punto1;
    }

    public Double getPunto2() {
        return punto2;
    }

    public void setPunto2(Double punto2) {
        this.punto2 = punto2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "punto1=" + punto1 +
                ", punto2=" + punto2 +
                '}';
    }

    //metodo para calcular area
    //metodo para calcuilar perimetro
}
