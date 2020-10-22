package eci.edu.co.arsw.parcialWeather.services;

import java.io.IOException;

import eci.edu.co.arsw.parcialWeather.exception.WeatherParcialException;
import eci.edu.co.arsw.parcialWeather.model.CityData;

public interface WeatherService {
	CityData getWeatherByCityName(String nameCity) throws WeatherParcialException, IOException;
}
