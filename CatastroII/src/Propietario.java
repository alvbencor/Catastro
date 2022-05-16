import java.util.ArrayList;
import java.util.List;

public class Propietario implements Comparable<Propietario> {

	private String nombre;
	private Integer edad;
	private String localidad;
	private Integer superficieTotal;
	
	
	public Propietario(String nombre, Integer edad, String localidad, Integer superficieTotal) {

		this.nombre = nombre;
		this.edad = edad;
		this.localidad = localidad;
		this.superficieTotal = superficieTotal;

	}
	
	@Override
	public int compareTo(Propietario p) {
		
//		System.out.println("Comparando" + this.superficieTotal + " con " + p.getSuperficieTotal());
		
		
		return this.superficieTotal.compareTo(p.getSuperficieTotal());
	}
	
	@Override
	public String toString() {
		return "\nPropietario\n [nombre=" + nombre + ", edad=" + edad + ", localidad=" + localidad + ", superficieTotal="
				+ superficieTotal + "\nFincas\n" + fincas + "]";
	}

	public Integer getSuperficieTotal() {
		return superficieTotal;
	}

	public void setSuperficieTotal(Integer superficieTotal) {
		this.superficieTotal = superficieTotal + this.superficieTotal;
	}

	List<Finca> fincas;

	public List<Finca> getFincas() {
		return fincas;
	}

	public void setFincas(List<Finca> fincas) {
		this.fincas = fincas;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
