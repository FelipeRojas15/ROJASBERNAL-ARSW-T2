package eci.edu.co.arsw.parcialWeather.httpService;

import org.json.JSONObject;

import eci.edu.co.arsw.parcialWeather.exception.WeatherParcialException;

public interface HttpServiceConnect {
	JSONObject getWeatherByCityName(String nameCity) throws WeatherParcialException;
}
