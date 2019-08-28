package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.*;

public class TarifasTest {
    private CalculadorDescuentos d = new CalculadorDescuentos();
    
    @Test
    public void validateRegistryResult() {
        System.out.println(d.calculoTarifa(10000,1,17));
        Assert.assertEquals(10.0, d.calculoTarifa(10000,1,17));
    }
    // TODO Complete with more test cases
}