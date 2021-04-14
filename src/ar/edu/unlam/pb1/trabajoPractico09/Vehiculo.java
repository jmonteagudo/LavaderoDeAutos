package ar.edu.unlam.pb1.trabajoPractico09;

public class Vehiculo {
	
	private String patente;
	private TipoDeVehiculo tipo;
	private String nombreDelPropietario;
	
	// tipo de lavado
	// precio
	
	public Vehiculo(String patente, TipoDeVehiculo tipo) {
		this.patente = patente;
		this.tipo = tipo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public TipoDeVehiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeVehiculo tipo) {
		this.tipo = tipo;
	}
	
	public String getNombreDelPropietario() {
		return nombreDelPropietario;
	}

	public void setNombreDelPropietario(String nombreDelPropietario) {
		this.nombreDelPropietario = nombreDelPropietario;
	}

	public String toString() {
		return this.patente;
	}
	

}
