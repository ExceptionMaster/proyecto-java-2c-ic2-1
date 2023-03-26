package fp.coches.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fp.coches.Coche;
import fp.common.ColorCoche;
import fp.common.Motor;
import fp.common.TipoCoche;

public class TestCoche {
	private static List<ColorCoche> listaColores1 = new ArrayList<ColorCoche>();
	private static Coche c1 = new Coche("Audi","A4",new Motor(1.8,150,13.2,28),TipoCoche.Passenger,23990,LocalDate.of(2015, 8, 15),listaColores1);
	private static List<ColorCoche> listaColores2 = new ArrayList<ColorCoche>();
	private static Coche c2 = new Coche("Volkswagen","Passat",new Motor(1.8,150,13.2,28),TipoCoche.Passenger,21200,LocalDate.of(2014, 10, 30),listaColores2);
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	private static void TesteoCoche() {
		print("\n-------------- PRUEBA DEL OBJETO c1 --------------");
		print("Formato completo:");
		print(c1);
		print("Formato corto:");
		print(c1.getFormatoCorto());
		print("--------------------------------------------------");
		
		print("\n-------------- PRUEBA DEL OBJETO c2 --------------");
		print("Formato completo:");
		print(c2);
		print("Formato corto:");
		print(c2.getFormatoCorto());
		print("--------------------------------------------------");
	}
	
	private static void TestCompareTo() {	
		print("\n-------------- PRUEBA DEL compareTo --------------");
		print(c1.compareTo(c2));
		if(c1.compareTo(c2)<0) {
			print(c1.getFabricante()+" "+c1.getModelo() + " va antes que " + c2.getFabricante()+" "+c2.getModelo());
		} else if(c1.compareTo(c2)>0) {
			print(c1.getFabricante()+" "+c1.getModelo() + " va después que " + c2.getFabricante()+" "+c2.getModelo());
		} else {
			print(c1.getFabricante()+" "+c1.getModelo() + " y " + c2.getFabricante()+" "+c2.getModelo() + " son iguales");
		}
		print("--------------------------------------------------");
	}
	
	private static void TestEquals() {
		print("\n--------------- PRUEBA DEL equals ---------------");
		print(c1.equals(c2));
		if(c1.equals(c2)==true) {
			print(c1.getFabricante()+" "+c1.getModelo()+" es igual que "+c2.getFabricante()+" "+c2.getModelo());
		} else {
			print(c1.getFabricante()+" "+c1.getModelo()+" es distinto a "+c2.getFabricante()+" "+c2.getModelo());
		}
		print("--------------------------------------------------");
	}
	
	private static void TestMotor() {
		print("\n-------------- PRUEBA DEL OBJETO Motor -----------");
		print("c1: " + c1.getMotor());
		print("c2: " + c2.getMotor());
		print("--------------------------------------------------");
	}
	
	public static void llenarListas() {
		listaColores1.add(ColorCoche.NEGRO);
		listaColores1.add(ColorCoche.ROJO);
		listaColores1.add(ColorCoche.BLANCO);
		listaColores1.add(ColorCoche.AZUL);
		listaColores2.add(ColorCoche.NEGRO);
		listaColores2.add(ColorCoche.ROJO);
		listaColores2.add(ColorCoche.BLANCO);
		listaColores2.add(ColorCoche.AZUL);
	}
	
	public static void main(String[] args) {
		llenarListas();
		TesteoCoche();
		TestMotor();
		TestEquals();
		TestCompareTo();
	}
	
}	
