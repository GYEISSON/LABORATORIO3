package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.*;

public class TarifasTest {
    private CalculadorDescuentos d = new CalculadorDescuentos();
    
    @Test
    public void validacionDias() {
        Assert.assertEquals(8500.0, d.calculoTarifa(10000,25,20),0.5);
		Assert.assertEquals(5865000.0, d.calculoTarifa(6900000,30,50),0.5);
		Assert.assertEquals(6900000.0, d.calculoTarifa(6900000,20,25),0.5);
    }
	
	@Test
    public void validacionMenorEdad() {
        Assert.assertEquals(95000.0, d.calculoTarifa(100000,2,5),0.5);
		Assert.assertEquals(6555000.0, d.calculoTarifa(6900000,10,17),0.5);
		Assert.assertEquals(1234567.0, d.calculoTarifa(1234567,19,18),0.5);
    }
	
	@Test
    public void validacionMayorEdad() {
        Assert.assertEquals(92000.0, d.calculoTarifa(100000,2,70),0.5);
		Assert.assertEquals(6348000.0, d.calculoTarifa(6900000,10,124),0.5);
		Assert.assertEquals(1234567.0, d.calculoTarifa(1234567,19,65),0.5);
    }
	
	@Test
    public void validacionAcomulado() {
        Assert.assertEquals(77000.0, d.calculoTarifa(100000,256,70),0.5);
		Assert.assertEquals(5520000.0, d.calculoTarifa(6900000,80,5),0.5);
    }
	
	// TODO Complete with more test cases
}