package ejercicio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class Empresa {
	private String nombre;
	private List<Empleado> empleados; 
	private int cuit;
	private List<ReciboDeSueldo> recibos;
	
	public double montoTotalSueldosNetos() {
		return empleados.stream().mapToDouble(empleado ->empleado.sueldoNeto()).sum();
	}

	public double montoTotalSueldosBrutos() {
		return empleados.stream().mapToDouble(empleado ->empleado.sueldoBruto()).sum();
	}
	
	public double montoTotalRetenciones() {
		return empleados.stream().mapToDouble(empleado ->empleado.totalRetenciones()).sum();
	}
	
	public void liquidacionDeSueldo(Empleado empleado) {
		/*ReciboDeSueldo recibo = new ReciboDeSueldo();
		recibo.generarReciboPara(empleado);
		recibos.add(recibo);*/
		ReciboDeSueldo recibo = empleado.generarRecibo();
		recibos.add(recibo);
	}
	
}


