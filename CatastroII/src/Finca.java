import java.util.ArrayList;
import java.util.List;

public class Finca {

	String nombre;
	Integer superficie;
	String localidad;
	

	@Override
	public String toString() {
		return "Finca [nombre=" + nombre + ", superficie=" + superficie + ", localidad=" + localidad + "]\n";
	}

	public Finca(String localidad, Integer superficie, String nombre) {

		this.localidad = localidad;
		this.superficie = superficie;
		this.nombre = nombre;

	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Integer getSuperfice() {
		return superficie;
	}

	public void setSuperfice(Integer superficie) {
		this.superficie = superficie;
	}

}
