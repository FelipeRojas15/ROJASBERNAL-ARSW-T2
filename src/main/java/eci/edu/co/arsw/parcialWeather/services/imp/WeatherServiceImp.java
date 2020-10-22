package eci.edu.co.arsw.parcialWeather.services.imp;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eci.edu.co.arsw.parcialWeather.exception.WeatherParcialException;
import eci.edu.co.arsw.parcialWeather.httpService.HttpServiceConnect;
import eci.edu.co.arsw.parcialWeather.model.CityData;
import eci.edu.co.arsw.parcialWeather.model.Cloud;
import eci.edu.co.arsw.parcialWeather.model.Coord;

import eci.edu.co.arsw.parcialWeather.model.Main;
import eci.edu.co.arsw.parcialWeather.model.Sys;
import eci.edu.co.arsw.parcialWeather.model.Weather;
import eci.edu.co.arsw.parcialWeather.model.Wind;
import eci.edu.co.arsw.parcialWeather.services.WeatherService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Service("weatherService")
public class WeatherServiceImp implements WeatherService{
	@Autowired
	private HttpServiceConnect connect;
	@Override
	public CityData getWeatherByCityName(String nameCity)  throws WeatherParcialException, IOException{
		Gson obj =new Gson();
		
		//JSONObject obj = connect.getWeatherByCityName(nameCity);
		ObjectMapper mapper = new ObjectMapper();
		CityData city = obj.fromJson( connect.getWeatherByCityName(nameCity).toString(), CityData.class) ;
		
		return city;		
	}
	
	
}
