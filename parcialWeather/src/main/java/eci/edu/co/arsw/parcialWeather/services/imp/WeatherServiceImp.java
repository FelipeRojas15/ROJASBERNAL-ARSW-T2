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
	/**public CityData mapDataWeather(JSONObject data) throws IOException  {
		System.out.println(data);
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("hola");
		Coord coord = mapper.readValue(data.getJSONObject("coord").toString(), Coord.class);
		System.out.println("hola2222");
		//Weather[] weather = mapper.readValue(data.getJSONArray("weather").getJSONObject(0).toString(), Weather.class);
		String base = data.getString("base");
		Main main = mapper.readValue(data.getJSONObject("main").toString(), Main.class);
		int visibility = data.getInt("visibility");
		Wind wind = mapper.readValue(data.getJSONObject("wind").toString(), Wind.class);
		Cloud cloud = mapper.readValue(data.getJSONObject("clouds").toString(), Cloud.class);
		int dt = data.getInt("dt");
		Sys sys = mapper.readValue(data.getJSONObject("sys").toString(), Sys.class);
		int timezone = data.getInt("timezone");
		int id = data.getInt("id");
		String name = data.getString("name");
		int cod = data.getInt("cod");
		
		
		
		//return new //CityData(coord,weather,base,main,visibility,wind,cloud,dt,sys,timezone,id,name,cod);
	}	
		*/
	
}
