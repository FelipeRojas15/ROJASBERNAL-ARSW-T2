package eci.edu.co.arsw.parcialWeather.httpService;

import org.json.JSONObject;

import eci.edu.co.arsw.parcialWeather.exception.WeatherParcialException;

public interface HttpServiceConnect {
	/**
	 * Conexion a la API en donde se realiza un get para traer los datos climaticos de la ciudad seleccionada
	 * @param nameCity nombre de la ciudad seleccionada
	 * @return Json con informacion climatica de la ciudad
	 * @throws WeatherParcialException
	 */
	JSONObject getWeatherByCityName(String nameCity) throws WeatherParcialException;
}
