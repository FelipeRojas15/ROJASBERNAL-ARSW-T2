package eci.edu.co.arsw.parcialWeather.model;


/**
 * Esta clase almacena la latitud y la longitud en donde se encuentra la ciudad seleccionada
 * @author rojas
 *
 */
public class Coord {
	public double lon;
	public double lat;
	public Coord(double lon, double lat) {
		
		this.lon = lon;
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	
}
