import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	static List<Propietario> listaDePropietarios = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		
		new Main().ordena();
		

	}
	
	public static void  ordena() throws IOException {
		
	getPropietario();
	
	Collections.sort(listaDePropietarios);
	
	System.out.println(listaDePropietarios);
	
	}
	
	

	public static void getPropietario() throws IOException {

		File file = new File("/Users/alvarobenitocortes/programacion/Catastro/listaPropietarios.txt");
		BufferedReader lector;
		try {
			lector = new BufferedReader(new FileReader(file));
			String linea;
			while ((linea = lector.readLine()) != null) {

				incluyePropietario(linea);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void incluyePropietario(String linea) {

		String[] arrayDePropietarios = linea.split(";");

		Propietario p = new Propietario(arrayDePropietarios[0], Integer.parseInt(arrayDePropietarios[1]),
				arrayDePropietarios[2], 0);

		listaDePropietarios.add(p);
		
		p.setFincas(getFincas(arrayDePropietarios[0], p));		
		

	}

	public static List<Finca> getFincas(String nombre, Propietario p) {

		List<Finca> fincas = new ArrayList<>();

		File file = new File("/Users/alvarobenitocortes/programacion/CatastroII/listaFincas.txt");
		BufferedReader br;
		try {
			
			br = new BufferedReader(new FileReader(file));
			String linea;
			while ((linea = br.readLine()) != null) {

				if (linea.contains(nombre)) {
					
					String[] arrayDeFinca = linea.split(";");
					
					p.setSuperficieTotal(Integer.parseInt(arrayDeFinca[1]));
					
					Finca f = new Finca(arrayDeFinca[0], Integer.parseInt(arrayDeFinca[1]), arrayDeFinca[2]);
					
					fincas.add(f);
					
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return fincas;

	}

}
