package com.funciones.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;



@WebService
public interface Funciones {
	
	@WebMethod
	public double pendiente(int y2, int y1, int x2,int x1);
	
	@WebMethod
	public double promedio(int valor1, int valor2, int valor3,int valor4);
	
	@WebMethod
	public float triangulo(float base, float altura, float area);
	
	
	
	
}
