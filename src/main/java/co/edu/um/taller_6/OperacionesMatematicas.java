package co.edu.um.taller_6;


public class OperacionesMatematicas {
    /**
     * este metodo realiza la adición de dos números enteros
     * @param valor1 primer parametro de tipo entero
     * @param valor2 primer parametro de tipo entero
     * @return
     */
    public int suma(int valor1, int valor2){
    return valor1 + valor2;
}
    public int resta(int valor1, int valor2){
        return valor1 - valor2;
    }
    public int multiplicacion(int valor1, int valor2){
        return valor1* valor2;
    }
    public double division(int valor1, int valor2)throws ArithmeticException {
        if (valor2==0) throw new ArithmeticException();

        return valor1/valor2;

    }
}
