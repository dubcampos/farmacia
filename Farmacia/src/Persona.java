import java.util.ArrayList;
import java.util.List;

public class Persona {
	String nombre;
	String apellido;
	String dni;
	int edad;
	Double descuento;
	//lista de compras
	List<Compras> compraslist = new ArrayList<Compras>();
	
	public Persona(String nombre, String apellido, String dni, int edad) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		descuento = 0.0;
		//CREAR EL ELEMENTO DE LISTA
		Compras compra1 = new Compras(1, "05/08/2019");
		Compras compra2 = new Compras(2, "06/08/2019");
		Compras compra3 = new Compras(3, "07/08/2019");
		
		//AGREGAR ELEMENTO A LISTA
		
		compraslist.add(compra1);
		compraslist.add(compra2);
		compraslist.add(compra3);
		
	}
	
	void Imprimir() {
		System.out.println("Cliente: " + nombre + " " +apellido);
		System.out.println("DNI: "+dni);
		System.out.println(CalcularDescuento(edad)+"%");
	}
	
	 Double CalcularDescuento(int edad) {
		if (edad>=65) {
			descuento = 10.0;
		}
		return descuento;
	}
	
	
	
	
}
