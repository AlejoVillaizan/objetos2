package ejercicio1;

import java.util.Collection;

public class ReciboDeSueldo {
//	private Collection <String> recibo;
/*	public void generarReciboPara(Empleado empleado) {
		 recibo = new Collection<Empleado>();
		
	}*/
	private double sueldo;
	private String nombre;
	
	public String getNombre() {
		return this.nombre;
	}
	public double getSueldoBruto() {
		return this.sueldo;
	}
	public ReciboDeSueldo(String nombre,double sueldo) {
		this.nombre = nombre;
		this.sueldo= sueldo;
	}
	
}
