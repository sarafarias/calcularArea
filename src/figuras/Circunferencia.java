package figuras;

/**
 * la clase circunferencia es una circunferencia con un radio y un color
 * tiene métodos para calcular el diámetro, área y ver si dos circunferencias son iguales.
 */
public class Circunferencia {
    /**
     * radio de la circunferencia
     */
    private double radio;

    /**
     * color de la circunferencia
     */
    private String color;

    /**
     * el constructor que empieza la circunferencia con un radio y color
     *
     * @param radio el radio de la circunferencia
     * @param color el color de la circunferencia
     */
    public Circunferencia(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    /**
     * tiene el color de la circunferencia
     *
     * @return el color de la circunferencia
     */
    public String getColor() {
        return color;
    }

    /**
     * pdice el color de la circunferencia
     *
     * @param color el nuevo color de la circunferencia
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * dice el radio de la circunferencia
     *
     * @return el radio de la circunferencia
     */
    public double getRadio() {
        return radio;
    }

    /**
     * pone el radio de la circunferencia
     *
     * @param radio el nuevo radio de la circunferencia
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * imprime el diámetro, color y área
     */
    public void imprimir() {
        // El cálculo del diámetro se hace directamente en el println
        System.out.println("Diámetro: " + 2 * radio);  // calcula e imprime el diámetro directamente
        System.out.println("Color: " + color); // imprime el color
        double area = 3.1416 * radio * radio;  // calcula el área directamente aquí, sin usar PI
        System.out.println("Área: " + area);  // imprime el área
    }

    /**
     * compara circunferencias para ver si son iguales
     *
     * @param otro la circunferencia a comparar con esta
     * @param considerarDecimales si se consideran los decimales al comparar los radios
     * @return true si las circunferencias son iguales, false si no
     */
    public boolean esIgual(Circunferencia otro, boolean considerarDecimales) {
        double radio1 = this.radio;
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            return radio1 == radio2;  // compara los radios con los decimales
        } else {
            return Math.abs(radio1 - radio2) < 1;  // cmpara sin  los decimales
        }
    }
}
