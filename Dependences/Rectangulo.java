package Dependences;
/**
 * @author Jose Maria Garcia Mendoza
 * @version 1.0
 * Clase Rectangulo es una que hereda algunos atributos de la clase padre
 * Figure (base, altura y los getters and setter) estas herramientas nos sirven
 * para calcular diferentes propiedades.
 * El area (base * altura) y perimetro (base + altura * 2) son propiedades que
 * son importantes de obtener para su conocimiento
 * Longitud de la diagonal (Raiz de (base * base) * (altura * altura))
 * Area total de los triangulos internos(base * altura / 4)
 * Centroide (altura / 2)
 * 
 */
public class Rectangulo extends Figure{
    
    /**
     * Constructor que inicializa las variables en funcion de la clase padre de figura
     */
    public Rectangulo() {
        super();
    }
    
    /**
     * Constructor que inicialza las variables con parametros en funcion de la clase padre
     * @param base
     * @param altura 
     */
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    /**
     * Constructor para incializar las variables con parametro de objeto en funcion de la
     * clase padre
     * @param A 
     */
    public Rectangulo(Rectangulo A) {
        super(A.base, A.altura);
    }

    /**
     * Constructor para incializar las variable con parametro del objeto padre
     * @param A 
     */
    public Rectangulo(Figure A) {
        super(A);
    }
    
    /**
     * Metodo para calcular el Area del rectangulo
     * @param A
     * @return objeto B donde se encuentra el valor del area
     */
    public Rectangulo calculateArea(Rectangulo A) {
        Rectangulo B = new Rectangulo();
        double b = A.getBase(),
                a = A.getAltura();
        B.setArea(b * a);
        return B;
    }
    
    /**
     * Metodo para calcular el perimetro del rectangulo
     * @param A
     * @return objeto B donde se encuentra el valor del perimetro
     */
    public Rectangulo calculatePerimetro(Rectangulo A){
        Rectangulo B = new Rectangulo();
        double b = A.getBase(),
                a = A.getAltura();
        B.setPerimetro(b + a * 2);
        return B;
    }
    
    /**
     * Metodo para calcular la longitud de la diagonal
     * @param A
     * @return  objeto B donde se encuentra el valor de la longitud de la diagonal
     */
    public Rectangulo calculateLongitudDiagonal(Rectangulo A){
        Rectangulo B = new Rectangulo();
        double b = A.getBase(),
                a = A.getAltura();
        B.setLongitudDiagonal(Math.sqrt(Math.pow(b, 2) * Math.pow(a, 2)));
        return B;
    }
    
    /**
     * Metodo para calcular el area de los triangulos internos
     * @param A
     * @return objeto B donde se ecuentra el valor de la longitud del area
     * de los triangulos internos
     */
    public Rectangulo calculateAreaTotalTriangulosInternos(Rectangulo A){
        Rectangulo B = new Rectangulo();
        double b = A.getBase(),
                a = A.getAltura();
        B.setAreaTriangulosInternos((b * a) / 4);
        return B;
    }
    
    /**
     * Metodo para calcular el centroide del rectangulo
     * @param A
     * @return objeto B dodne se encuentra el valor del centroide 
     * (distancia que hay desde un lado hasta el centro de la figura)
     */
    public Rectangulo calculateCentroide(Rectangulo A){
        Rectangulo B = new Rectangulo();
        double a = A.getAltura();
        B.setCentroide(a / 2);
        return B;
    }
    

    
}
