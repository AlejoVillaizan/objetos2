package ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	protected String estadoCivil;
	private LocalDate fechaDeNacimiento;
	protected double sueldoBasico;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	public abstract double sueldoNeto() ;
	public int edad() {
		Period periodo = Period.between(this.getFechaDeNacimiento(), LocalDate.now());
		return periodo.getYears();
	}
	public abstract double totalRetenciones();
	public abstract double sueldoBruto();
}
