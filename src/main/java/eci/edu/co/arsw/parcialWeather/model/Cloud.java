package eci.edu.co.arsw.parcialWeather.model;

/**
 * Esta clase guarda los datos del total de nubes que tiene la ciudad seleccionada
 * @author rojas
 *
 */
public class Cloud {
	public int all;

	public Cloud(int all) {
		this.all = all;
	}

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}
	
}
