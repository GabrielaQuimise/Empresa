
public abstract class Empleado extends Main1{
	String nombre;
	int numeroIdentifi;
	int codigoArea;
	double sueldo, a�o, bono;

	
	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumeroIdentifi() {
		return numeroIdentifi;
	}



	public void setNumeroIdentifi(int numeroIdentifi) {
		this.numeroIdentifi = numeroIdentifi;
	}



	public int getCodigoArea() {
		return codigoArea;
	}



	public void setCodigoArea(int codigoArea) {
		this.codigoArea = codigoArea;
	}




	public double getA�o() {
		return a�o;
	}



	public void setA�o(double a�o) {
		this.a�o = a�o;
	}



	public double getBono() {
		return bono;
	}



	public void setBono(double bono) {
		this.bono = bono;
	}


	
	public Empleado(String nombre, int numeroIdentifi, int codigoArea, int sueldo2) {
	
	}


	public abstract void Sueldo(double sueldo);

}
	

 
