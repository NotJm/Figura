package Dependences;

/**
 * La clase Poliedro es una clase que representa una figura que tiene asus lados
 * una base en forma de rectángulo y una altura. Esta clase hereda de la clase
 * Rectangulo.
 */
public class Poliedro extends Rectangulo {

    private double hAltura,
            volumen,
            areaSuperficial,
            areaBase,
            areaCarasLaterales;

    private Rectangulo rectangulo = new Rectangulo();

    /**
     * Constructor vacío que crea un poliedro con base y altura igual a 1 y
     * altura adicional igual a 1.
     */
    public Poliedro() {
        super();
        this.hAltura = 1;
    }

    /**
     * Constructor que crea un poliedro con una altura
     *
     * @param hAltura La altura adicional del poliedro.
     */
    public Poliedro(double hAltura) {
        this.hAltura = hAltura;
    }

    /**
     * Constructor que crea un poliedro con una base, altura y Haltura
     *
     * @param base La longitud de la base del poliedro.
     * @param altura La altura del poliedro.
     * @param hAltura La anchura del poliedro.
     */
    public Poliedro(double base, double altura, double hAltura) {
        super(base, altura);
        this.hAltura = hAltura;
    }

    /**
     * Constructor que crea un poliedro a partir de otro poliedro.
     *
     * @param A El poliedro de copia
     */
    public Poliedro(Poliedro A) {
        this.hAltura = A.hAltura;
    }

    /**
     * Constructor que crea un poliedro a partir de un rectángulo y un poliedro.
     *
     * @param A El rectángulo de copia
     * @param B El poliedro de copia
     */
    public Poliedro(Rectangulo A, Poliedro B) {
        super(A);
        this.hAltura = B.hAltura;
    }

    /**
     * Método para calcular el volumen del poliedro.
     *
     * @param A El poliedro al que se le calculará el volumen.
     * @param B El rectángulo que representa la base del poliedro.
     * @return Un nuevo poliedro con el volumen calculado.
     */
    public Poliedro calculateVolumen(Poliedro A, Rectangulo B) {
        Poliedro C = new Poliedro();
        this.rectangulo = this.rectangulo.calculateArea(B);
        C.setVolumen(A.getHAltura() * this.rectangulo.getArea());
        return C;
    }

    /**
     * Método para calcular el área de la base del poliedro.
     *
     * @param B El rectángulo que representa la base del poliedro.
     * @return Un nuevo poliedro con el área de la base calculada.
     */
    public Poliedro calculateAreaBase(Rectangulo B) {
        Poliedro C = new Poliedro();
        this.rectangulo = this.rectangulo.calculateArea(B);
        C.setAreaBase(this.rectangulo.getArea());
        return C;
    }

    /**
     * Método para calcular el área superficial del poliedro.
     *
     * @param A El poliedro al que se le calculará el área superficial.
     * @param B El rectángulo que representa la base del poliedro.
     * @return Un nuevo poliedro con el área superficial calculada.
     */
    public Poliedro calculateAreaSuperficie(Poliedro A, Rectangulo B) {
        Poliedro C = new Poliedro();
        this.rectangulo = this.rectangulo.calculateArea(B);
        C = C.calculateAreasLaterales(A);
        C.setAreaSuperficial(2 * this.rectangulo.getArea() + C.getAreaCarasLaterales());
        return C;
    }

    /**
     * Método para calcular el área de las caras laterales del poliedro.
     *
     * @param A El poliedro al que se le calculará el área de las caras
     * laterales.
     * @return Un nuevo poliedro con el área de las caras laterales calculada.
     */
    public Poliedro calculateAreasLaterales(Poliedro A) {
        Poliedro C = new Poliedro();
        double b = A.getBase();
        double a = A.getAltura();
        double h = A.getHAltura();
        C.setAreaCarasLaterales(2 * (b * h) + 2 * (b * a));
        return C;
    }

    /**
     * Método getter para obtener la altura adicional del poliedro.
     *
     * @return La altura adicional del poliedro.
     */
    public double getHAltura() {
        return this.hAltura;
    }

    /**
     * Método setter para establecer el valor de la altura adicional del
     * poliedro.
     *
     * @param hAltura La altura adicional a establecer.
     */
    public void setHAltura(double hAltura) {
        if (hAltura > 0) {
            this.hAltura = hAltura;
        }
    }

    /**
     * Método getter para obtener el volumen del poliedro.
     *
     * @return El volumen del poliedro.
     */
    public double getVolumen() {
        return this.volumen;
    }

    /**
     * Método setter para establecer el valor del volumen del poliedro.
     *
     * @param volumen El valor del volumen a establecer.
     */
    public void setVolumen(double volumen) {
        if (volumen > 0) {
            this.volumen = volumen;
        }
    }

    /**
     * Método getter para obtener el área superficial del poliedro.
     *
     * @return El área superficial del poliedro.
     */
    public double getAreaSuperficial() {
        return this.areaSuperficial;
    }

    /**
     * Método setter para establecer el valor del área superficial del poliedro.
     *
     * @param areaSuperficial El valor del área superficial a establecer.
     */
    public void setAreaSuperficial(double areaSuperficial) {
        if (areaSuperficial > 0) {
            this.areaSuperficial = areaSuperficial;
        }
    }

    /**
     * Método getter para obtener el área de la base del poliedro.
     *
     * @return El área de la base del poliedro.
     */
    public double getAreaBase() {
        return this.areaBase;
    }

    /**
     * Método setter para establecer el valor del área de la base del poliedro.
     *
     * @param areaBase El valor del área de la base a establecer.
     */
    public void setAreaBase(double areaBase) {
        if (areaBase > 0) {
            this.areaBase = areaBase;
        }
    }

    /**
     * Método getter para obtener el rectángulo que representa la base del
     * poliedro.
     *
     * @return retangulo objeto
     */
    public Rectangulo getRectangulo() {
        return this.rectangulo;
    }

    /**
     * Método setter para establecer el rectángulo que representa la base del
     * poliedro.
     *
     * @param rectangulo
     */
    public void setRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

    /**
     * Método getter para obtener el área de las caras laterales del poliedro.
     *
     * @return El área de las caras laterales del poliedro.
     */
    public double getAreaCarasLaterales() {
        return this.areaCarasLaterales;
    }

    /**
     * Método setter para establecer el área de las caras laterales del
     * poliedro.
     *
     * @param areaCarasLaterales El área de las caras laterales a establecer.
     */
    public void setAreaCarasLaterales(double areaCarasLaterales) {
        if (areaCarasLaterales > 0) {
            this.areaCarasLaterales = areaCarasLaterales;
        }
    }
}
