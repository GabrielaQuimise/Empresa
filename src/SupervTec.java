
public class SupervTec extends Empleado{
	public SupervTec(String nombre, int numeroIdentifi, int codigoArea, int sueldo) {
		super(nombre, numeroIdentifi, codigoArea,sueldo);
	}

	public void Sueldo(double salario) {
		this.sueldo+=(sueldo*(getA�o()*0.05));
	}

}

