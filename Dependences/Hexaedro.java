package Dependences;

/**
 * @author Jose Maria Garcia Mendoza
 * @version 1.0
 * La clase Hexaedro es una clase que representa un hexaedro (cubo). 
 * Un hexaedro se caracteriza por su lado, su volumen,
 * su diagonal y su área superficial. Esta clase hereda de la clase Cuadrado.
 */
public class Hexaedro extends Cuadrado {

    private double volumen, diagonal, areaSuperficie;
    private Cuadrado cuadrado = new Cuadrado();

    /**
     * Constructor vacío que crea un hexaedro con un lado de longitud 0.
     */
    public Hexaedro() {
        super(0);
    }

    /**
     * Constructor que crea un hexaedro con el lado especificado.
     *
     * @param lado La longitud del lado del hexaedro.
     */
    public Hexaedro(double lado) {
        super(lado);
    }
    

    /**
     * Método para calcular el área de la base del hexaedro.
     *
     * @param A El hexaedro al que se le calculará el área de la base.
     * @param B El cuadrado que representa la base.
     * @return Un nuevo hexaedro con el área de la base calculada.
     */
    public Hexaedro calculateAreaBase(Hexaedro A, Cuadrado B) {
        Hexaedro C = new Hexaedro();
        this.cuadrado = this.cuadrado.calculateArea(B);
        C.setArea(6 * Math.pow(B.getLado(), 2));
        return C;
    }

    /**
     * Método para calcular el área superficial del hexaedro.
     *
     * @param A El hexaedro al que se le calculará el área superficial.
     * @param B El cuadrado que representa la base.
     * @return Un nuevo hexaedro con el área superficial calculada.
     */
    public Hexaedro calculateAreaSuperficie(Hexaedro A, Cuadrado B) {
        Hexaedro C = new Hexaedro();
        this.cuadrado = this.cuadrado.calculatePerimetro(B);
        C.setAreaSuperficie(this.cuadrado.getPerimetro() * this.cuadrado.getLado());
        return C;
    }

    /**
     * Método para calcular el volumen del hexaedro.
     *
     * @param A El hexaedro al que se le calculará el volumen.
     * @param B El cuadrado que representa la base.
     * @return Un nuevo hexaedro con el volumen calculado.
     */
    public Hexaedro calculateVolumen(Hexaedro A, Cuadrado B) {
        Hexaedro C = new Hexaedro();
        C.setVolumen(Math.pow(B.getLado(), 3));
        return C;
    }

    /**
     * Método para calcular la longitud de la diagonal del hexaedro.
     *
     * @param A El hexaedro al que se le calculará la diagonal.
     * @param B El cuadrado que representa la base.
     * @return Un nuevo hexaedro con la diagonal calculada.
     */
    public Hexaedro calculateDiagonal(Hexaedro A, Cuadrado B) {
        Hexaedro C = new Hexaedro();
        C.setDiagonal(Math.sqrt(
                Math.pow(B.getLado(), 2)
                + Math.pow(B.getLado(), 2)
                + Math.pow(B.getLado(), 2)
        ));
        return C;
    }

    /**
     * Método para calcular el perímetro del hexaedro.
     *
     * @param A El hexaedro al que se le calculará el perímetro.
     * @param B El cuadrado que representa la base.
     * @return Un nuevo hexaedro con el perímetro calculado.
     */
    public Hexaedro calculatePerimetro(Hexaedro A, Cuadrado B) {
        Hexaedro C = new Hexaedro();
        C.setPerimetro(B.getLado() * 6);
        return C;
    }

    /**
     * Método getter para obtener el volumen del hexaedro.
     *
     * @return El volumen del hexaedro.
     */
    public double getVolumen() {
        return this.volumen;
    }

    /**
     * Método setter para establecer el valor del volumen del hexaedro.
     *
     * @param volumen El valor del volumen a establecer.
     */
    public void setVolumen(double volumen) {
        if (volumen > 0) {
            this.volumen = volumen;
        }
    }

    /**
     * Método getter para obtener la longitud de la diagonal del hexaedro.
     *
     * @return La longitud de la diagonal del hexaedro.
     */
    public double getDiagonal() {
        return this.diagonal;
    }

    /**
     * Método setter para establecer el valor de la diagonal del hexaedro.
     *
     * @param diagonal El valor de la diagonal a establecer.
     */
    public void setDiagonal(double diagonal) {
        if (diagonal > 0) {
            this.diagonal = diagonal;
        }
    }

    /**
     * Método getter para obtener el área superficial del hexaedro.
     *
     * @return El área superficial del hexaedro.
     */
    public double getAreaSuperficie() {
        return this.areaSuperficie;
    }

    /**
     * Método setter para establecer el valor del área superficial del hexaedro.
     *
     * @param areaSuperficie El valor del área superficial a establecer.
     */
    public void setAreaSuperficie(double areaSuperficie) {
        if (areaSuperficie > 0) {
            this.areaSuperficie = areaSuperficie;
        }
    }

    /**
     * Método getter para obtener el cuadrado que representa la base del
     * hexaedro.
     *
     * @return cuadrado
     */
    public Cuadrado getCuadrado() {
        return this.cuadrado;
    }

    /**
     * Método setter para establecer el cuadrado que representa la base del
     * hexaedro.
     *
     * @param cuadrado 
     */
    public void setCuadrado(Cuadrado cuadrado) {
        this.cuadrado = cuadrado;
    }
}
