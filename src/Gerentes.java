
public class Gerentes extends Empleado {
	public Gerentes(String nombre, int numeroIdentifi, int codigoArea, int sueldo) {
		super(nombre, numeroIdentifi, codigoArea, sueldo);
	}

	public void Sueldo(double sueldo) {
		
		this.sueldo=sueldo+(sueldo*((getA�o()*0.05))+getBono());
		
}
}

