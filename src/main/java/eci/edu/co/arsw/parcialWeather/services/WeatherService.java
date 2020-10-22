package eci.edu.co.arsw.parcialWeather.services;

import java.io.IOException;

import eci.edu.co.arsw.parcialWeather.exception.WeatherParcialException;
import eci.edu.co.arsw.parcialWeather.model.CityData;


public interface WeatherService {
	/**
	 * Realiza el mapeo de los elementos del JSON y los convierte en objetos java
	 * @param nameCity ciudad seleccionada 
	 * @return retorna las caracteristicas climaticas de la ciudad como Objeto Java 
	 * @throws WeatherParcialException
	 * @throws IOException
	 */
	CityData getWeatherByCityName(String nameCity) throws WeatherParcialException, IOException;
}
