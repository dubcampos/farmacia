
public class Medicamentos {
	String nombre;
	Double precio;
	int codigo;
	
	public Medicamentos(String nombre, int codigo ,Double precio) {		
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	void Imprimir() {
		System.out.println("Medicamento: "+nombre);
	}
	
}
