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
	
	private static void TesteoCoche() {
		System.out.println();
		System.out.println("-------------- PRUEBA DEL OBJETO c1 --------------");
		System.out.println("Formato completo:");
		System.out.println(c1);
		System.out.println("Formato corto:");
		System.out.println(c1.getFormatoCorto());
		System.out.println("--------------------------------------------------");
		
		System.out.println();
		System.out.println("-------------- PRUEBA DEL OBJETO c2 --------------");
		System.out.println("Formato completo:");
		System.out.println(c2);
		System.out.println("Formato corto:");
		System.out.println(c2.getFormatoCorto());
		System.out.println("--------------------------------------------------");
	}
	
	private static void TestCompareTo() {	
		System.out.println();
		System.out.println("-------------- PRUEBA DEL compareTo --------------");
		System.out.println(c1.compareTo(c2));
		if(c1.compareTo(c2)<0) {
			System.out.println(c1.getFabricante()+" "+c1.getModelo() + " va antes que " + c2.getFabricante()+" "+c2.getModelo());
		} else if(c1.compareTo(c2)>0) {
			System.out.println(c1.getFabricante()+" "+c1.getModelo() + " va después que " + c2.getFabricante()+" "+c2.getModelo());
		} else {
			System.out.println(c1.getFabricante()+" "+c1.getModelo() + " y " + c2.getFabricante()+" "+c2.getModelo() + " son iguales");
		}
		System.out.println("--------------------------------------------------");
	}
	
	private static void TestEquals() {
		System.out.println();
		System.out.println("--------------- PRUEBA DEL equals ---------------");
		System.out.println(c1.equals(c2));
		if(c1.equals(c2)==true) {
			System.out.println(c1.getFabricante()+" "+c1.getModelo()+" es igual que "+c2.getFabricante()+" "+c2.getModelo());
		} else {
			System.out.println(c1.getFabricante()+" "+c1.getModelo()+" es distinto a "+c2.getFabricante()+" "+c2.getModelo());
		}
		System.out.println("--------------------------------------------------");
	}
	
	private static void TestMotor() {
		System.out.println();
		System.out.println("-------------- PRUEBA DEL OBJETO Motor -----------");
		System.out.println("c1: " + c1.getMotor());
		System.out.println("c2: " + c2.getMotor());
		System.out.println("--------------------------------------------------");
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
