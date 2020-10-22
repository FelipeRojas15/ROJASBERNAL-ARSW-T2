package eci.edu.co.arsw.parcialWeather.httpService.imp;

import org.springframework.stereotype.Service;
import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import eci.edu.co.arsw.parcialWeather.httpService.HttpServiceConnect;

@Service
public class HttpServiceConnectImp implements HttpServiceConnect   {
	@Override
	public JSONObject getWeatherByCityName(String nameCity)  {
		
		JSONObject result = null;
		try {
			HttpResponse<String> response = Unirest.get("https://api.openweathermap.org/data/2.5/weather?q="+nameCity+"&appid=960486f301a1907a473d900bbdfcc36f")
					.header("x-rapidapi-host", "api.openweathermap.org")
					.header("x-rapidapi-key", "960486f301a1907a473d900bbdfcc36f")
					.asString();
			result =new JSONObject(response.getBody());
			System.out.println(result);
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
}
