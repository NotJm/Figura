package Dependences;

/**
 * @author Jose Maria Garcia Mendoza
 * @version 1.0 La clase Figure es una clase base que representa una figura
 * geométrica genérica en un espacio bidimensional. Contiene atributos y métodos
 * comunes que pueden ser heredados por clases específicas de figuras
 * geométricas.
 */
public class Figure {

    // Variables q se herendan
    protected double base,
            altura,
            area = 0,
            perimetro = 0,
            centroide = 0,
            longitudDiagonal = 0,
            areaTriangulosInternos = 0,
            semiperimetro = 0,
            euclidiana = 0;

    /**
     * Constructor vacio
     */
    protected Figure() {
        this.base = 1;
        this.altura = 1;
    }

    /**
     * Constructor para incializar las variables con los valores de los
     * parametros
     *
     * @param base
     * @param altura
     */
    protected Figure(double base, double altura) {
        this.base = base <= 0 ? 1 : base;
        this.altura = altura <= 0 ? 1 : altura;
    }

    /**
     * Constructor para incializar las variables con el objeto Figure
     *
     * @param A
     */
    protected Figure(Figure A) {
        this.base = A.base;
        this.altura = A.altura;
    }

    /**
     * Metodo para sumar todos los valores de un arreglo, generalmente este
     * metodo se ocupa cuando tienes un arreglo
     *
     * @param array
     * @throws Exception
     * @return la suma de todos los elementos
     */
    protected double sum(double[] array) throws Exception {
        if (array.length < 0) {
            throw new Exception("El arreglo esta vacio");
        }
        double sum = 0.0;
        for (double item : array) {
            sum += item;
        }
        return sum;
    }

    /**
     * Método getter para obtener el valor de la base de la figura.
     *
     * @return El valor de la base de la figura.
     */
    public double getBase() {
        return this.base;
    }

    /**
     * Método setter para establecer el valor de la base de la figura,
     * asegurándose de que no sea negativo.
     *
     * @param base El valor de la base a establecer.
     */
    public void setBase(double base) {
        if (base >= 0) {
            this.base = base;
        }
    }

    /**
     * Método getter para obtener el valor de la altura de la figura.
     *
     * @return El valor de la altura de la figura.
     */
    public double getAltura() {
        return this.altura;
    }

    /**
     * Método setter para establecer el valor de la altura de la figura,
     * asegurándose de que no sea negativa.
     *
     * @param altura El valor de la altura a establecer.
     */
    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        }
    }

    /**
     * Método setter para establecer el valor de la altura de la figura,
     * asegurándose de que no sea negativa.
     *
     * @param altura El valor de la altura a establecer.
     */
    public void setHAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        }
    }

    /**
     * Método getter para obtener el valor del área de la figura.
     *
     * @return El valor del área de la figura.
     */
    public double getArea() {
        return this.area;
    }

    /**
     * Método setter para establecer el valor del área de la figura,
     * asegurándose de que no sea negativo.
     *
     * @param area El valor del área a establecer.
     */
    public void setArea(double area) {
        if (area >= 0) {
            this.area = area;
        }
    }

    /**
     * Método getter para obtener el valor del perímetro de la figura.
     *
     * @return El valor del perímetro de la figura.
     */
    public double getPerimetro() {
        return this.perimetro;
    }

    /**
     * Método setter para establecer el valor del perímetro de la figura,
     * asegurándose de que no sea negativo.
     *
     * @param perimetro El valor del perímetro a establecer.
     */
    public void setPerimetro(double perimetro) {
        if (perimetro >= 0) {
            this.perimetro = perimetro;
        }
    }

    /**
     * Método getter para obtener el valor del centroide de la figura.
     *
     * @return El valor del centroide de la figura.
     */
    public double getCentroide() {
        return this.centroide;
    }

    /**
     * Método setter para establecer el valor del centroide de la figura,
     * asegurándose de que no sea negativo.
     *
     * @param centroide El valor del centroide a establecer.
     */
    public void setCentroide(double centroide) {
        if (centroide >= 0) {
            this.centroide = centroide;
        }
    }

    /**
     * Método getter para obtener el valor de la longitud de la diagonal de la
     * figura.
     *
     * @return El valor de la longitud de la diagonal de la figura.
     */
    public double getLongitudDiagonal() {
        return this.longitudDiagonal;
    }

    /**
     * Método setter para establecer el valor de la longitud de la diagonal de
     * la figura, asegurándose de que no sea negativo.
     *
     * @param longitudDiagonal El valor de la longitud de la diagonal a
     * establecer.
     */
    public void setLongitudDiagonal(double longitudDiagonal) {
        if (longitudDiagonal >= 0) {
            this.longitudDiagonal = longitudDiagonal;
        }
    }

    /**
     * Método getter para obtener el valor del área de los triángulos internos
     * de la figura.
     *
     * @return El valor del área de los triángulos internos de la figura.
     */
    public double getAreaTriangulosInternos() {
        return this.areaTriangulosInternos;
    }

    /**
     * Método setter para establecer el valor del área de los triángulos
     * internos de la figura, asegurándose de que no sea negativo.
     *
     * @param areaTrianguloInternos El valor del área de los triángulos internos
     * a establecer.
     */
    public void setAreaTriangulosInternos(double areaTrianguloInternos) {
        if (areaTrianguloInternos >= 0) {
            this.areaTriangulosInternos = areaTrianguloInternos;
        }
    }

    /**
     * Método getter para obtener el valor del semiperímetro de la figura.
     *
     * @return El valor del semiperímetro de la figura.
     */
    public double getSemiperimetro() {
        return this.semiperimetro;
    }

    /**
     * Método setter para establecer el valor del semiperímetro de la figura,
     * asegurándose de que no sea negativo.
     *
     * @param semiperimetro El valor del semiperímetro a establecer.
     */
    public void setSemiperimetro(double semiperimetro) {
        if (semiperimetro >= 0) {
            this.semiperimetro = semiperimetro;
        }
    }

    /**
     * Método getter para obtener el valor de la distancia euclidiana de la
     * figura.
     *
     * @return El valor de la distancia euclidiana de la figura.
     */
    public double getEuclidiana() {
        return this.euclidiana;
    }

    /**
     * Método setter para establecer el valor de la distancia euclidiana de la
     * figura, asegurándose de que no sea negativa.
     *
     * @param distancia El valor de la distancia euclidiana a establecer.
     */
    public void setEuclidiana(double distancia) {
        if (distancia >= 0) {
            this.euclidiana = distancia;
        }
    }

}
