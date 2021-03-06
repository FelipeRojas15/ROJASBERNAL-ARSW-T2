package eci.edu.co.arsw.parcialWeather.model;

/**
 * Esta clase guar la densidad y la velocidad del viento que hay en la ciudad
 * @author rojas
 *
 */
public class Wind {
	public float speed;
	public float deg;
	public Wind(float speed, float deg) {
		this.speed = speed;
		this.deg = deg;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getDeg() {
		return deg;
	}
	public void setDeg(float deg) {
		this.deg = deg;
	}
	
}
