package com.funciones.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.funciones.ws.Funciones")
public class FuncionesImpl implements Funciones {

	

	private double r1;

	public double pendiente(int y2, int y1, int x2, int x1) {
		
		double resultado = 0;
		
		double	r1 = y2-y1;
		double	r2 = x2-x1;
		double	r3 = r1/r2;
			
			resultado = r3;
			
			return resultado;
		
		
	}

	public double promedio(int valor1, int valor2, int valor3, int valor4) {
		
		double resultado = 0;
		double promedio = 4;
		
		
	r1 = (valor1 + valor2 + valor3 + valor4) / promedio; 
		
		r1 = resultado;
		
		return resultado;
	}

	public float triangulo(float base, float altura, float area) {
		
	 float  resultado = 0;
		
		base  = 7;
		altura = 10;
		area = (7 * 10)/2;
		
		area =  resultado;
		
		return resultado;
	}
	
	
	
	

}
