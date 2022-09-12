package tareas_clases;

public class Pitagoras {
	
	public double calcularHipotenusa(int catetoA, int catetoB) {
		double potencia1 = Math.pow(catetoA, 2);
		double potencia2 = Math.pow(catetoB, 2);
		double sumapotencias = potencia1 + potencia2;
		double raizcuadrada = Math.sqrt(sumapotencias);
		return raizcuadrada;
	}
}
