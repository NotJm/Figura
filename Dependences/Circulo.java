package Dependences;

/**
 * @author Jose Maria Garcia Mendoza
 * @version 1.0
 * La clase Circulo representa una figura. Un círculo se caracteriza por su radio, su área, su
 * circunferencia, su arco, su semiperímetro, su diámetro y su ángulo central.
 */
public class Circulo {

    // Variables necesaria para calcular las propiedades
    private double r, // Radio del circulo
            area, // Area del circuloo
            circuferencia, // Circuferencia (Perimetro) del Circulo
            diametro, // Diametro del radio
            arco, // Longitud del arco
            angle, // Angulo del circulo
            semiperimetro;

    /*
     * Constructor vacio para inicialzar la variable de radio
     */
    public Circulo() {
        this.r = 0;
        this.angle = 0;
    }

    /**
     * Constructor con radio para incializar la variable de radio
     *
     * @param r
     */
    public Circulo(double r) {
        this.r = r <= 0 ? 1 : r;
    }

    /**
     * Constuctor con radio y angulo para incializar las variables
     *
     * @param r
     * @param angle
     */
    public Circulo(double r, double angle) {
        this.r = r <= 0 ? 1 : r;
        this.angle = angle;
    }

    /**
     * Constructor con objeto para incializar la variable de radio
     *
     * @param A
     */
    public Circulo(Circulo A) {
        this.r = A.r;
    }

    /**
     * Metodo para calcular el Area de un circulo (PI * (r * r))
     *
     * @param A
     * @return objeto con el valor del area ya calculada
     */
    public Circulo calculateArea(Circulo A) {
        Circulo B = new Circulo();
        B.setArea(Math.PI * Math.pow(A.getR(), 2));
        return B;
    }

    /**
     * Metodo para calcular el Perimetro de un circulo (2PI*r)
     *
     * @param A
     * @return objeto con el valor del circuferencia ya calculado
     */
    public Circulo calculateCircuferencia(Circulo A) {
        Circulo B = new Circulo();
        B.setCircuferencia(2 * Math.PI * A.getR());
        return B;
    }

    /**
     * Metodo para calcular el diametro de un circulo
     *
     * @param A
     * @return objeto con el valor del diametro calculado
     */
    public Circulo calculateDiametro(Circulo A) {
        Circulo B = new Circulo();
        B.setDiametro(A.getR() * 2);
        return B;
    }

    /**
     * Metodo para calcular la longitud del arco de un circulo
     *
     * @param A
     * @return objeto con el valor del arco calculada
     */
    public Circulo calculateArco(Circulo A) {
        Circulo B = new Circulo();
        B = B.calculateCircuferencia(A);
        B.setArco(B.getCircuferencia() * A.getAngle() / 360);
        return B;
    }

    /**
     * Metodo para calcular el semiperimetro de un circulo
     *
     * @param A
     * @return objeto con el valor del semiperimetro calculado
     */
    public Circulo calculateSemiperimetro(Circulo A) {
        Circulo B = new Circulo();
        B = B.calculateDiametro(A);
        B.setSemiperimetro(B.getDiametro() / 2);
        return B;
    }

    /**
     * Método para obtener el valor del radio (r) del objeto.
     *
     * @return El valor del radio (r) del objeto.
     */
    public double getR() {
        return this.r;
    }

    /**
     * Método para establecer el valor del radio (r) del objeto.
     *
     * @param r El valor del radio (r) a establecer.
     */
    public void setR(double r) {
        if (r > 0) {
            this.r = r;
        }
    }

    /**
     * Método para obtener el área del objeto.
     *
     * @return El área del objeto.
     */
    public double getArea() {
        return this.area;
    }

    /**
     * Método para establecer el área del objeto.
     *
     * @param area El área a establecer.
     */
    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        }
    }

    /**
     * Método para obtener la circunferencia del objeto.
     *
     * @return La circunferencia del objeto.
     */
    public double getCircuferencia() {
        return this.circuferencia;
    }

    /**
     * Método para establecer la circunferencia del objeto.
     *
     * @param circuferencia La circunferencia a establecer.
     */
    public void setCircuferencia(double circuferencia) {
        if (circuferencia > 0) {
            this.circuferencia = circuferencia;
        }
    }

    /**
     * Método para obtener el valor del arco del objeto.
     *
     * @return El valor del arco del objeto.
     */
    public double getArco() {
        return this.arco;
    }

    /**
     * Método para establecer el valor del arco del objeto.
     *
     * @param arco El valor del arco a establecer.
     */
    public void setArco(double arco) {
        if (arco > 0) {
            this.arco = arco;
        }

    }

    /**
     * Método para obtener el valor del semiperímetro del objeto.
     *
     * @return El valor del semiperímetro del objeto.
     */
    public double getSemiperimetro() {
        return this.semiperimetro;
    }

    /**
     * Método para establecer el valor del semiperímetro del objeto.
     *
     * @param semiperimetro El valor del semiperímetro a establecer.
     */
    public void setSemiperimetro(double semiperimetro) {
        if (semiperimetro > 0) {
            this.semiperimetro = semiperimetro;
        }
    }

    /**
     * Método para obtener el diámetro del objeto.
     *
     * @return El diámetro del objeto.
     */
    public double getDiametro() {
        return this.diametro;
    }

    /**
     * Método para establecer el diámetro del objeto.
     *
     * @param diametro El diámetro a establecer.
     */
    public void setDiametro(double diametro) {
        if (diametro > 0) {
            this.diametro = diametro;
        }
    }

    /**
     * Método para obtener el ángulo del objeto.
     *
     * @return El ángulo del objeto.
     */
    public double getAngle() {
        return this.angle;
    }

    /**
     * Método para establecer el ángulo del objeto.
     *
     * @param angle El ángulo a establecer.
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

}
