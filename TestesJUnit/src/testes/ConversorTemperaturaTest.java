package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import classes.ConversorTemperatura;

public class ConversorTemperaturaTest {

	@Test
	public void testConverterCelsiusParaFahrenheit() {
		assertEquals(90.5, ConversorTemperatura.converteCelsiusParaFahrenheit(32.5), 0.0);
		assertEquals(71.6, ConversorTemperatura.converteCelsiusParaFahrenheit(22), 0.0);
		assertEquals(96.8, ConversorTemperatura.converteCelsiusParaFahrenheit(36.2), 0.4);
	}

	@Test
	public void testConverteFahrenheitParaCelsius() {
		assertEquals(32.5, ConversorTemperatura.converteFahrenheitParaCelsius(90.5), 0.0);
		assertEquals(22, ConversorTemperatura.converteFahrenheitParaCelsius(71.6), 0.01);
		assertEquals(36.0, ConversorTemperatura.converteFahrenheitParaCelsius(96.8), 0.0);

		assertEquals(10.0, ConversorTemperatura.converteFahrenheitParaCelsius(50.0), 0.0);
	}

}
