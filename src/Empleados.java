import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Empleados {

	public static double  diaDePago(ArrayList<Empleado>empleados) {
		double sueldo=0;
		for(int i = 0; i<empleados.size();i++) {
			Empleado emp = empleados.get(i);
			sueldo +=emp.getSueldo();
		}
		return sueldo;
	}

	public static void main(String[] args) {
		double sueldo, año, bono;
		ArrayList<Empleado>empleados = new ArrayList<>();
		Oficinistas empleado1 = new Oficinistas();

		System.out.println("SALARIO :");
		Scanner entrada = new Scanner(System.in);
		sueldo = entrada.nextInt();
		Scanner in = new Scanner(System.in);
		
		System.out.println("AÑOS DE SERVICIO :");
		Scanner entrada1 = new Scanner(System.in);
		año = entrada.nextInt();
		Scanner in1 = new Scanner(System.in);
		
		System.out.println("BONO EXTRA:");
		Scanner entrada2 = new Scanner(System.in);
		bono = entrada.nextInt();
		Scanner in2 = new Scanner(System.in);
		
		
		emp1.Sueldo(salario);
		emp2.Sueldo(salario); 
		emp3.Sueldo(salario);
		emp4.Sueldo(salario);
		emp5.Sueldo(salario);
		emp6.Sueldo(salario);
		
		
		empleados.add(emp1);
		empleados.add(emp2);
		empleados.add(emp3);
		empleados.add(emp4);
		empleados.add(emp5);
		empleados.add(emp6);
		
		System.out.println(diaDePago(empleados));
		
	}
	
}