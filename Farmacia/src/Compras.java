import java.util.ArrayList;
import java.util.List;

public class Compras {
	/*ATRIBUTOS*/
	int numero_compra;
	String fecha;
	Double total;
	List<Medicamentos> medicamentoslist = new ArrayList<Medicamentos>();
	
	public Compras(int numero_compra, String fecha) {
		this.numero_compra = numero_compra;
		this.fecha = fecha;
		total = 0.0;
		Medicamentos medicamento1 = new Medicamentos("Ibuprofeno", 1, 0.90);
		Medicamentos medicamento2 = new Medicamentos("Panadol", 2, 2.90);
		Medicamentos medicamento3 = new Medicamentos("Aspirina", 3, 2.20);
		Medicamentos medicamento4 = new Medicamentos("CardioAspirina", 3, 3.20);
		Medicamentos medicamento5 = new Medicamentos("Migradorixina", 3, 5.40);
		
		medicamentoslist.add(medicamento1);
		medicamentoslist.add(medicamento2);
		medicamentoslist.add(medicamento3);
		medicamentoslist.add(medicamento4);
		medicamentoslist.add(medicamento5);
		}
	
	/*METODOS*/
	
	void ImprimirBoleta() {
		System.out.println("====== BOLETA DE VENTA =====");
		System.out.println(persona.Imprimir();
	}
	
	void CalcularTotal() {
		
		
	}
	
	
	
}
