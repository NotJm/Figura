package Dependences;

/**
 * @author Jose Maria Garcia Mendoza
 * Clase Triangulo Esta hereda algunos metodos de la clase padre
 * de Figura algunos son getters y setter tambien algunos miembros protegidos
 * los cuales son variables de base y alturas se ocupan algunas miembros para
 * obtener los lado mediante un arreglo de doble
 */
public class Triangulo extends Figure {

    // Variable de array undimensional
    private double[] l = new double[3]; // Se encarga de almacenar los lados de un triangulo
    private double[] p, a = new double[2]; // Se encargan de almacenar puntos de las vertices de un triangulo
    private double hipotenusa; // Se encarga de obtener la hipotenusa

    /**
     * Constructor que inicializa las variable en funcion de la clase padre de
     * figura
     */
    public Triangulo() {
        super();
    }

    /**
     * Constructor que incializa las variables con parametros en funcion de la
     * clase padre
     *
     * @param base
     * @param altura
     */
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    /**
     * Constructor para incializar las variables con parametro de objeto en
     * funcion de la clase padre
     *
     * @param A
     */
    public Triangulo(Triangulo A) {
        super(A.base, A.altura);
    }

    /**
     * Constructor para incializar las variables con parametro del objeto padre
     *
     * @param A
     */
    public Triangulo(Figure A) {
        super(A);
    }

    /**
     * Constructor para incializar los lados del triangulo
     *
     * @param l
     * @exception Exception
     */
    public Triangulo(double[] l) throws Exception {
        if (l.length == 3) {
            this.l = l;
        } else {
            throw new Exception("Longitud invalida");
        }
    }

    /**
     * Constructor para incializar los puntos P y A
     *
     * @param p
     * @param a
     * @exception Exception
     */
    public Triangulo(double[] p, double[] a) throws Exception {
        if (p.length != 2) {
            throw new IllegalArgumentException("El arreglo 'p' debe tener una longitud de 2.");
        }

        if (a.length != 2) {
            throw new IllegalArgumentException("El arreglo 'a' debe tener una longitud de 2.");
        }

        this.p = p;
        this.a = a;
    }

    /**
     * Metodo para calcular el area del triangulo
     *
     * @param A
     * @return
     */
    public Triangulo calculateArea(Triangulo A) {
        Triangulo B = new Triangulo();
        double b = A.getBase(), a = A.getAltura();
        B.setArea((b * a) / 2);
        return B;
    }

    /**
     * Metodo para calcular el perimetro de un triangulo
     *
     * @param A
     * @return
     */
    public Triangulo calculatePerimetro(Triangulo A) throws Exception {
        Triangulo B = new Triangulo();
        B.setPerimetro(B.sum(A.getL()));
        return B;
    }

    /**
     * Metodo para calcular la longitud de una diagonal del triangulo
     *
     * @param A
     * @return regresa el objeto con el valor de la longitud de la diagonal
     * calculada
     */
    public Triangulo calculateLongitudDiagonal(Triangulo A) throws Exception {
        Triangulo B = new Triangulo();
        double[] lado = A.getL();
        String typeOf = Triangulo.typeOf(A);
        if (typeOf.equals("Equilatero")) {
            B.setLongitudDiagonal(lado[0] * 2);
        } else {
            throw new Exception("Los triangulos isoceles y escalenos la longitud de la diagonal varia");
        }
        return B;
    }

    /**
     * Metodo para calcular el centroide de un triangulo
     *
     * @param A
     * @return regresa un objeto con el valor del centroide calculado
     */
    public Triangulo calculateCentroide(Triangulo A) {
        Triangulo B = new Triangulo();
        double[] pointP = A.getP();
        double[] pointA = A.getA();
        B.setEuclidiana(Math.sqrt(
                Math.pow((pointP[0] - pointA[0]), 2)
                + Math.pow((pointP[1] - pointA[1]), 2)));
        B.setCentroide((2 / 3) * B.getEuclidiana());
        return B;
    }

    /**
     * Metodo para calcular la distancia desde punto P a vértice A
     *
     * @param A
     * @return regresa un objeto con el valor de la distancia
     */
    public Triangulo calculateEuclidiana(Triangulo A) {
        Triangulo B = new Triangulo();
        double[] pointP = A.getP();
        double[] pointA = A.getA();
        B.setEuclidiana(
                Math.sqrt(
                        Math.pow((pointP[0] - pointA[0]), 2)
                        + Math.pow((pointP[1] - pointA[1]), 2)));
        return B;

    }

    /**
     * Metodo para calcular la hipotenusa de un triangulo
     *
     * @param A
     * @return
     */
    public Triangulo calculateHipotenusa(Triangulo A) {
        Triangulo B = new Triangulo();
        double[] lados = A.getL();
        B.setHipotenusa(Math.sqrt(lados[0] + lados[1]));
        return B;
    }

    /**
     * Metodo para calcular el semiperimetro
     *
     * @param A
     * @return el objeto B con el valor del semiperimetro calculado
     */
    public Triangulo calculateSemiperimetro(Triangulo A) throws Exception {
        Triangulo B = new Triangulo();
        double sumLados = B.sum(A.getL());
        B.setSemiperimetro(sumLados / 2);
        return B;
    }

    /**
     * Metodo para calcular el Area en base con la forma de Heron
     *
     * @param A
     * @return el objeto B con el valor del area calculado
     */
    public Triangulo calculateAreaHeron(Triangulo A) throws Exception {
        Triangulo B = new Triangulo();
        B = B.calculateSemiperimetro(A);
        double s = B.getSemiperimetro();
        double[] lado = A.getL();
        B.setArea(Math.sqrt(s * (s - lado[0]) * (s - lado[1]) * (s - lado[2])));
        return B;
    }

    /**
     * Metodo estatico para poder saber que tipo de Triangulo es
     *
     * @param A
     * @return una cadena de caracteres segun el tipo de triangulo
     */
    public static String typeOf(Triangulo A) {
        double[] lado = A.getL();
        if (lado[0] == lado[1] && lado[1] == lado[2]) {
            return "Equilatero";
        } else if (lado[0] == lado[1] || lado[0] == lado[2] || lado[1] == lado[2]) {
            return "Isoceles";
        } else {
            return "Escaleno";
        }
    }

    /**
     * Metodo estatico para poder el lado mayor del triangulo
     *
     * @param A
     * @return regresa el valor mas grande
     */
    public static double LadoMayor(Triangulo A) {
        double[] lado = A.getL();
        if (lado[0] > lado[1] && lado[0] > lado[2]) {
            return lado[0];
        } else if (lado[1] > lado[2]) {
            return lado[1];
        } else {
            return lado[2];
        }
    }

    /**
     * Metodo estatico que recibe un string y regresa un array
     *
     * @param str
     * @return array de valores dobles
     */
    public static double[] generateLados(String str[]) throws Exception {
        if (str.length > 3 || str.length < 3) {
            throw new Exception("Mal formato de valores ingresados");
        }

        double[] lados = new double[3];
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                lados[i] = Double.parseDouble(str[i].trim());
            } else {
                throw new Exception("Mal formato de valores ingresado");
            }
        }
        return lados;

    }

    /**
     * Metodo estatico que recibe un string y regresa un array
     *
     * @param str
     * @return array de valores doble
     */
    public static double[] generatePoints(String str[]) throws Exception {
        if (str.length > 2) {
            throw new Exception("Demsiados valores ingresados");
        }

        double[] points = new double[2];
        for (int i = 0; i < str.length; i++) {
            points[i] = Double.parseDouble(str[i].trim());
        }

        return points;
    }

    /**
     * Metodo para obtener el arreglo de lados
     *
     * @return arreglo de lados
     */
    public double[] getL() {
        return this.l;
    }

    /**
     * Metodo para poner valor al arreglo de lados
     *
     * @param l
     * @exception Exception
     */
    public void setL(double[] l) throws Exception {
        if (l.length != 3) {
            throw new Exception("Longitud invalida");
        }
    }

    /**
     * Metodo para obtener el valor del punto A
     *
     * @return Punto P
     */
    public double[] getP() {
        return this.p;
    }

    /**
     * Metodo para poner valor al punto P
     *
     * @param p
     * @throws Exception
     */
    public void setP(double[] p) throws Exception {
        if (p.length != 2) {
            throw new Exception("La longitud del arreglo 'p' debe ser igual a 2.");
        }
        this.p = p;
    }

    /**
     * Metodo para obtener el punto A
     *
     * @return Punto A
     */
    public double[] getA() {
        return this.a;
    }

    /**
     * Metodo para poner valor al punto A
     *
     * @param a
     * @throws Exception
     */
    public void setA(double[] a) throws Exception {
        if (a.length != 2) {
            throw new Exception("La longitud del arreglo 'a' debe ser igual a 2.");
        }
        this.a = a;
    }

    /**
     * Metodo para obtener la hipotensua
     *
     * @return hipotenusa
     */
    public double getHipotenusa() {
        return this.hipotenusa;
    }
    
    /**
     * Metodo para poner valor a la hipotenusa
     * @param hipotenusa 
     */
    public void setHipotenusa(double hipotenusa) {
        if(hipotenusa > 0)
            this.hipotenusa = hipotenusa;
    }

}
