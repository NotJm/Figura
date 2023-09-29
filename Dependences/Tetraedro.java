package Dependences;

/**
 * @author Jose Maria Garcia Mendoza
 * La clase Tetraedro tiene una base triangular. Esta clase hereda de la clase
 * Triangulo.
 */
public class Tetraedro extends Triangulo {

    private double hAltura, volumen, areaTotal, longitudArista, radio;

    private Triangulo triangulo = new Triangulo();

    /**
     * Constructor vacío que crea un tetraedro con base y altura igual a 1 y
     * anchura a 1
     */
    public Tetraedro() {
        super();
        this.hAltura = 1;
    }

    /**
     * Constructor que crea un tetraedro con una altura
     *
     * @param hAltura
     */
    public Tetraedro(double hAltura) {
        this.hAltura = hAltura;
    }

    /**
     * Constructor que crea un tetraedro con una altura, una base y una anchura.
     *
     * @param hAltura La altura adicional del tetraedro.
     * @param base La longitud de la base del tetraedro.
     * @param altura La anchura del tetraedro.
     */
    public Tetraedro(double hAltura, double base, double altura) {
        super(base, altura);
        this.hAltura = hAltura;
    }

    /**
     * Constructor que crea un tetraedro con una altura partir de un objeto
     * Triangulo.
     *
     * @param hAltura La altura del tetraedro.
     * @param A El objeto Triangulo del que se copian la base y la altura.
     */
    public Tetraedro(double hAltura, Triangulo A) {
        super(A);
        if (hAltura > 0) {
            this.hAltura = hAltura;
        } else {
            this.hAltura = 1;
        }
    }

    /**
     * Método para calcular el volumen del tetraedro.
     *
     * @param A El tetraedro al que se le calculará el volumen.
     * @param B El triángulo que representa la base del tetraedro.
     * @return Un nuevo tetraedro con el volumen calculado.
     */
    public Tetraedro calculateVolumen(Tetraedro A, Triangulo B) {
        Tetraedro C = new Tetraedro();
        this.triangulo = this.triangulo.calculateArea(B);
        C.setVolumen(A.getHAltura() * triangulo.getArea());
        return C;
    }

    /**
     * Método para calcular el área total del tetraedro.
     *
     * @param A El tetraedro al que se le calculará el área total.
     * @param B El triángulo que representa la base del tetraedro.
     * @return Un nuevo tetraedro con el área total calculado.
     */
    public Tetraedro calculateAreaTotal(Tetraedro A, Triangulo B) {
        Tetraedro C = new Tetraedro();
        this.triangulo = this.triangulo.calculateArea(B);
        C.setAreaTotal(4 * this.triangulo.getArea());
        return C;
    }

    /**
     * Método para calcular la longitud de la arista del tetraedro.
     *
     * @param A El tetraedro al que se le calculará la longitud de la arista.
     * @param B El triángulo que representa la base del tetraedro.
     * @return Un nuevo tetraedro con la longitud de la arista calculada.
     */
    public Tetraedro calculateLongitudArista(Tetraedro A, Triangulo B) {
        Tetraedro C = new Tetraedro();
        double b = B.getBase();
        double h = A.getHAltura();
        C.setLongitudArista(Math.sqrt(
                Math.pow(h, 2) + Math.pow((b / 2), 2)
        ));
        return C;
    }

    /**
     * Método getter para obtener la altura adicional del tetraedro.
     *
     * @return La altura adicional del tetraedro.
     */
    public double getHAltura() {
        return this.hAltura;
    }

    /**
     * Método setter para establecer el valor de la altura adicional del
     * tetraedro.
     *
     * @param hAltura La altura adicional a establecer.
     */
    public void setHAltura(double hAltura) {
        if (hAltura > 0) {
            this.hAltura = hAltura;
        }
    }

    /**
     * Método getter para obtener el volumen del tetraedro.
     *
     * @return El volumen del tetraedro.
     */
    public double getVolumen() {
        return this.volumen;
    }

    /**
     * Método setter para establecer el valor del volumen del tetraedro.
     *
     * @param volumen El valor del volumen a establecer.
     */
    public void setVolumen(double volumen) {
        if (volumen > 0) {
            this.volumen = volumen;
        }
    }

    /**
     * Método getter para obtener el área total del tetraedro.
     *
     * @return El área total del tetraedro.
     */
    public double getAreaTotal() {
        return this.areaTotal;
    }

    /**
     * Método setter para establecer el valor del área total del tetraedro.
     *
     * @param areaTotal El valor del área total a establecer.
     */
    public void setAreaTotal(double areaTotal) {
        if (areaTotal > 0) {
            this.areaTotal = areaTotal;
        }
    }

    /**
     * Método getter para obtener el objeto Triangulo que representa la base del
     * tetraedro.
     *
     * @return El objeto Triangulo que representa la base del tetraedro.
     */
    public Triangulo getTriangulo() {
        return this.triangulo;
    }

    /**
     * Método setter para establecer el objeto Triangulo que representa la base
     * del tetraedro.
     *
     * @param triangulo El objeto Triangulo que representa la base a establecer.
     */
    public void setTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    /**
     * Método getter para obtener la longitud de la arista del tetraedro.
     *
     * @return La longitud de la arista del tetraedro.
     */
    public double getLongitudArista() {
        return this.longitudArista;
    }

    /**
     * Método setter para establecer la longitud de la arista del tetraedro.
     *
     * @param longitudArista La longitud de la arista a establecer.
     */
    public void setLongitudArista(double longitudArista) {
        if (longitudArista > 0) {
            this.longitudArista = longitudArista;
        }
    }

    /**
     * Método getter para obtener el radio del tetraedro.
     *
     * @return El radio del tetraedro.
     */
    public double getRadio() {
        return this.radio;
    }

    /**
     * Método setter para establecer el radio del tetraedro.
     *
     * @param radio El radio a establecer.
     */
    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        }
    }

}
