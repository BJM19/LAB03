package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import java.lang.Exception;

public class TarifasTest {
    @Test
    public void deberiaAplicarPorMenor() {
		CalculadorDescuentos tarifa= new CalculadorDescuentos();
		double total=tarifa.calculoTarifa(10000,8,15);
        Assert.assertTrue(total<10000);
    }
    @Test
	public void noDeberiaAplicarPorEdad(){
	CalculadorDescuentos tarifa = new CalcularDescuentos();
	double total = tarifa.calculoTarifa(10000,5,35);
	Assert.assertTrue(total==10000);
    }
    @Test 
	public void deberiaAplicarporMayor(){
	CalculadorDescuentos tarifa = new CalcularDescuentos();
	double total = tarifa.calculoTarifa(10000,5,66);
	Assert.assertTrue(total<10000);
	}
   @Test
	public void deberiaAplicarpordias(){
	CalculadorDescuentos tarifa = new CalcularDescuentos();
	double total = tarifa.calculoTarifa(10000,5,66);
	Assert.assertTrue(total<10000);
	}
  @Test
	public void no deberiaAplicarpordias(){
	CalculadorDescuentos tarifa = new CalcularDescuentos();
	double total = tarifa.calculoTarifa(10000,30,35);
	Assert.assertTrue(total<10000);
	}
}