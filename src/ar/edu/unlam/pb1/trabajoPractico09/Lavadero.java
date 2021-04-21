package ar.edu.unlam.pb1.trabajoPractico09;

public class Lavadero {
	
	private String nombre;
	private String direccion;
	private final int CAPACIDAD_MAXIMA_DE_VEHICULOS;
	private Vehiculo vehiculosEnEspera[];
	private int cantidadDeVehiculosEnEspera;
	private Vehiculo[] vehiculosLavados;
	
	public Lavadero(int capacidadMaximaDeVehiculos, String nombre) {
		this.nombre = nombre;
		this.CAPACIDAD_MAXIMA_DE_VEHICULOS = capacidadMaximaDeVehiculos;
		this.cantidadDeVehiculosEnEspera = 0;
		this.vehiculosEnEspera = new Vehiculo[CAPACIDAD_MAXIMA_DE_VEHICULOS];
		this.vehiculosLavados = new Vehiculo[CAPACIDAD_MAXIMA_DE_VEHICULOS];
	}
	
	public void ingresarVehiculo(Vehiculo nuevo) {
		// Opción 1
		//if(cantidadDeVehiculosEnEspera<CAPACIDAD_MAXIMA_DE_VEHICULOS) {
			vehiculosEnEspera[cantidadDeVehiculosEnEspera++] = nuevo;
		//}
		
		// Opción 2
		/*for(int i=0; i <vehiculosEnEspera.length; i++) {
			if(vehiculosEnEspera[i]==null) {
				vehiculosEnEspera[i] = nuevo;
			}
		}*/
	}
	
	public void ingresarVehiculo(String patente, String nombre) {
		Vehiculo nuevo = new Vehiculo(patente, TipoDeVehiculo.COCHE);
		nuevo.setNombreDelPropietario(nombre);
		vehiculosEnEspera[cantidadDeVehiculosEnEspera++] = nuevo;
	}
	
	public String verLosAutosEnEspera() {
		String listaDeAutosEnEspera = "";
		for(int i=0; i<cantidadDeVehiculosEnEspera; i++) {
			listaDeAutosEnEspera += vehiculosEnEspera[i] + ",";
		}
		return listaDeAutosEnEspera;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Vehiculo[] getVehiculosEnEspera() {
		return vehiculosEnEspera;
	}

	public void lavarVehiculo() {
		for(int i = 0; i<CAPACIDAD_MAXIMA_DE_VEHICULOS;i++) {
			if(vehiculosEnEspera[i] != null) {
				agregarVehiculoLavado(vehiculosEnEspera[i]);
				vehiculosEnEspera[i] = null;
			}
		}
		
	}

	private boolean agregarVehiculoLavado(Vehiculo nuevoLavado) {
		for(int i=0; i<CAPACIDAD_MAXIMA_DE_VEHICULOS; i++) {
			if(vehiculosLavados[i] == null) {
				vehiculosLavados[i] = nuevoLavado;
				return true;
			}
		}	
		return false;
	}

	public Vehiculo[] getVehiculosLavados() {
		return vehiculosLavados;
	}

	public Vehiculo entregarVehiculo(String patente) {
		Vehiculo vehiculoAEntregar=null;
		for(int i = 0; i<CAPACIDAD_MAXIMA_DE_VEHICULOS; i++) {
			if(vehiculosLavados[i] != null && vehiculosLavados[i].getPatente().equals(patente)) {
				vehiculoAEntregar = vehiculosLavados[i];
				vehiculosLavados[i] = null;
			}
		}
		return vehiculoAEntregar;
	}

	/*public String toString() {
		return this.nombre;
	}*/

}
