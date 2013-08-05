package co.edu.um.taller_6;

import junit.framework.Assert;
import org.junit.Test;

/**
se realizan las pruebas unitarias para la calse operaciones matematicas
 */
public class OperacionesMatematicasTest {
    @Test
    public void testSuma() throws Exception {
        OperacionesMatematicas op= new OperacionesMatematicas();
        Assert.assertNotNull(op);
        Assert.assertEquals(5,op.suma(3,2) );

    }

    @Test
    public void testResta() throws Exception {
        OperacionesMatematicas op= new OperacionesMatematicas();
        Assert.assertEquals(8,op.resta(10, 2)) ;

    }

    @Test
    public void testMultiplicacion() throws Exception {
        OperacionesMatematicas op= new OperacionesMatematicas();
        Assert.assertEquals(25,op.multiplicacion(5,5));

    }

    @Test
    public void testDivision() throws Exception {
        OperacionesMatematicas op= new OperacionesMatematicas();
        Assert.assertNotNull(op);
        Assert.assertEquals(2.5, op.division(5,2));
      op.division(2,0);
    }
}
