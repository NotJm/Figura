package Dependences;

/**
 * @author Jose Maria Garcia Mendoza
 * @version 1.0 Clase cuadrado Una clase donde se obtienen diferentes
 * propiedades de la figuras, esta no hereda de la clase padre de Figure por su
 * forma tan distintiva la cual es que todos sus lados son iguales.
 *
 * Esta clase se puede calcular el Area (L * L), Perimetro (L * 4) que son
 * propiedades estandares en cada figura.
 *
 * Otras propiedades que se puede calcular son la longitud de la diagonal y el
 * area total de los triangulos internos (son dos y los dos son isoceles). El
 * primero su formula es L * Raiz de 2, y el segundo se obtiene con la formula
 * ((L * L) / 2) * 2 ya que los dos triangulos son isoceles.
 *
 */
public class Cuadrado {

    // Variables para la figura del Cuadrado
    private double lado = 0, // Valor de los lados
            area, // Valor del area
            perimetro, // Valor del perimetro
            longitudDiagonal, // Valor de la longitud de la diagonal
            areaTotalDeTriangulosInternos,
            areaTotalCuadradosDividos; // Valor del area total de los triangulos internos
    private int niveles; // Niveles del cuadro

    /**
     * Constructor vacio para incializar variable
     */
    public Cuadrado() {
        this.lado = 0;
    }

    /**
     * Constructor donde se pasa el lado e se incializa con el miembro lado
     *
     * @param lado
     */
    public Cuadrado(double lado) {
        this.lado = lado <= 0 ? 1 : lado;
    }

    public Cuadrado(double lado, int niveles) {
        this.lado = lado <= 0 ? 1 : lado;
        this.niveles = niveles <= 0 ? 1 : niveles;
    }

   
    /**
     * Constructor donde se pasa objeto e se inicializa el miembro
     *
     * @param A
     */
    public Cuadrado(Cuadrado A) {
        this.lado = A.lado;
    }

    /**
     * Metodo para calcular el area del cuadrado
     *
     * @param A
     * @return se regresa el objeto en cuestion con las variable seteadas
     */
    public Cuadrado calculateArea(Cuadrado A) {
        Cuadrado B = new Cuadrado();
        double l = A.getLado();
        B.setArea(l * l);
        return B;
    }

    /**
     * Metodo para calcular el perimetro del cuadrado
     *
     * @param A
     * @return se regresa el objeto con la variable de perimetro calculada
     */
    public Cuadrado calculatePerimetro(Cuadrado A) {
        Cuadrado B = new Cuadrado(A);
        B.setPerimetro(B.getLado() * 4);
        return B;
    }

    /**
     * Metodo para calcular la longitud de la diagonal
     *
     * @param A
     * @return se regresa el objeto con la variable de longitud calculada
     */
    public Cuadrado calculateLongitudDiagonal(Cuadrado A) {
        Cuadrado B = new Cuadrado();
        double l = A.getLado();
        B.setLongitudDiagonal(l * Math.sqrt(2));
        return B;
    }

    /**
     * Metodo para calcular el area de los triangulos internos
     *
     * @param A
     * @return se regresa el objeto con la variable del area de los triangulos
     * internos calculada
     */
    public Cuadrado calculateAreaTotalDeTriangulosInternos(Cuadrado A) {
        Cuadrado B = new Cuadrado();
        double l = A.getLado();
        B.setAreaTotalDeTriangulosInternos((Math.pow(l, 2) / 2) * 2);
        return B;
    }

    /**
     * Este método calcula el perímetro de un cuadrado utilizando la recursión.
     * Cada llamada recursiva reduce el tamaño del cuadrado a la mitad, y el
     * perímetro se acumula a medida que se retrocede.
     *
     * @param A
     * @return objetio con el perimetro calculado
     */
    public Cuadrado calculatePerimetroRecursivo(Cuadrado A) {
        Cuadrado B = new Cuadrado();
        B.setPerimetro(B.calcularPerimetroRecursivo(A.getNiveles(), A.getLado()));
        return B;
    }

    /**
     * Este método calcula el perímetro de un cuadrado utilizando la recursión.
     * Cada llamada recursiva reduce el tamaño del cuadrado a la mitad, y el
     * perímetro se acumula a medida que se retrocede.
     *
     * @param niveles
     * @param lado
     * @return perimetro calculado de manera responsiva
     */
    private double calcularPerimetroRecursivo(int niveles, double lado) {
        if (niveles <= 0) {
            return 0;
        }
        double p = 4 * lado;
        double ladoMasPequeno = lado / 2;
        p += this.calcularPerimetroRecursivo(niveles - 1, ladoMasPequeno);
        return p;
    }

    // Getters and Setters
    /**
     * Metodo getter de Lado
     *
     * @return obtienes el valor de Lado
     */
    public double getLado() {
        return this.lado;
    }

    /**
     * Metodo setter para poner valor al lado
     *
     * @param lado
     */
    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    /**
     * Metodo getter de Area
     *
     * @return obtienes el valor de Area
     */
    public double getArea() {
        return this.area;
    }

    /**
     * Metodo setter para poner valor al area
     *
     * @param area
     */
    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        }
    }

    /**
     * Metodo getter de Perimetro
     *
     * @return obtienes el valor del perimetro
     */
    public double getPerimetro() {
        return this.perimetro;
    }

    /**
     * Metodo setter para poner valor al perimetro
     *
     * @param perimetro
     */
    public void setPerimetro(double perimetro) {
        if (perimetro > 0) {
            this.perimetro = perimetro;
        }
    }

    /**
     * Metodo getter de la longitud Diagonal
     *
     * @return obtienes el valor de la longitud de la diagonal
     */
    public double getLongitudDiagonal() {
        return this.longitudDiagonal;
    }

    /**
     * Metodo setter para poner valor a la longitud de la diagonal
     *
     * @param longitudDiagonal
     */
    public void setLongitudDiagonal(double longitudDiagonal) {
        if (longitudDiagonal > 0) {
            this.longitudDiagonal = longitudDiagonal;
        }
    }

    /**
     * Metodo getter
     *
     * @return obtienes el valor del area total de los triangulos internos
     */
    public double getAreaTotalDeTriangulosInternos() {
        return this.areaTotalDeTriangulosInternos;
    }

    /**
     * Metodo setter para poner valor al area total de los triangulos internos
     *
     * @param areaTotalDeTriangulosInternos
     */
    public void setAreaTotalDeTriangulosInternos(double areaTotalDeTriangulosInternos) {
        if (areaTotalDeTriangulosInternos > 0) {
            this.areaTotalDeTriangulosInternos = areaTotalDeTriangulosInternos;
        }
    }
    
    /**
     * Metodo getter para obtener el valor del area total de los cuadrado dividos
     * @return obtener area total de los cuadrados dividos
     */
    public double getAreaTotalCuadradosDividos() {
        return areaTotalCuadradosDividos;
    }
    
    /**
     * Metodo setter para poner valor al area total de los cuadros recursivos
     * @param areaTotalCuadradosDividos 
     */
    public void setAreaTotalCuadradosDividos(double areaTotalCuadradosDividos) {
        if(areaTotalCuadradosDividos > 0)
            this.areaTotalCuadradosDividos = areaTotalCuadradosDividos;
    }
    
    /**
     * Metodo getter para obtener el valor de los niveles
     * @return obtener el los niveles
     */
    public int getNiveles() {
        return niveles;
    }

    /**
     * Metodo setter para poner el valor de los niveles
     * @param niveles 
     */
    public void setNiveles(int niveles) {
        if(niveles > 0)
            this.niveles = niveles;
    }

    /**
     * Metodo destructor de la clase
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destruyendo el objeto");
    }
    
    /**
     * Metodo sobrecargado para obtener el string
     * @return 
     */
    @Override
    public String toString() {
        return "Cuadrado{lado=" + lado + ", \n"
                + "area=" + area + ",\n"
                + " perimetro=" + perimetro + ",\n"
                + "longitudDiagonal=" + longitudDiagonal + ",\n"
                + "areaTotalDeTriangulosInternos=" + areaTotalDeTriangulosInternos + ",\n"
                + "areaTotalCuadradosDividos=" + areaTotalCuadradosDividos + ",\n"
                + "niveles=" + niveles + "}";
    }

}
