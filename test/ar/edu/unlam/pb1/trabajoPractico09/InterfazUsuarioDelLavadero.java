package ar.edu.unlam.pb1.trabajoPractico09;

import java.util.Scanner;

public class InterfazUsuarioDelLavadero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcionDeseada = 0;
		Lavadero elLavaderoDeWalter;
		elLavaderoDeWalter= new Lavadero(4, "El lavadero de Walter");
		Vehiculo actual;
		
		do {
			System.out.println("Bienvenido al Lavadero");
			System.out.println("1 - Ingresar vehiculo ");
			System.out.println("2 - Lavar vehiculo ");
			System.out.println("3 - Entregar vehiculo ");
			System.out.println("4 - Ver los autos en espera");
			System.out.println("9 - Salir ");
			
			System.out.println("Ingrese la opción deseada: ");
			opcionDeseada = teclado.nextInt();
			
			switch(opcionDeseada) {
			case 1:
				String patente, nombre;
				System.out.println("Ingrese los datos del vehiculo:");
				System.out.println("Patente");
				patente = teclado.next();
				actual = new Vehiculo(patente, TipoDeVehiculo.COCHE);
				System.out.println("Ingrese el nombre del propietario:");
				nombre = teclado.next();
				actual.setNombreDelPropietario(nombre);
				elLavaderoDeWalter.ingresarVehiculo(actual);
				break;
			case 2:
				System.out.println("Se lavó el vehículo");
				//System.out.println(elLavaderoDeWalter.lavarVehiculo());
			case 4:
				System.out.println("Los autos en espera son");
				System.out.println(elLavaderoDeWalter.verLosAutosEnEspera());
			default:
				System.out.println("Funcionalidad en contrucción");
			}
		}while(opcionDeseada!=9);
		
	}

}
