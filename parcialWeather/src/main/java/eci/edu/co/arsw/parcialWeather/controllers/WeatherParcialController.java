package eci.edu.co.arsw.parcialWeather.controllers;

import org.springframework.http.HttpStatus;

import java.io.IOException;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eci.edu.co.arsw.parcialWeather.exception.WeatherParcialException;
import eci.edu.co.arsw.parcialWeather.services.imp.WeatherServiceImp;

@RestController
@RequestMapping(value ="/weather")
public class WeatherParcialController {
	@Autowired
	@Qualifier("weatherService")
	private WeatherServiceImp weather; 
	
	@RequestMapping(value = "/{nameCity}",method = RequestMethod.GET)
	public ResponseEntity<?> getAirportByName(@PathVariable(name="nameCity") String nameCity) throws IOException  {
		try {
			return new ResponseEntity<>(weather.getWeatherByCityName(nameCity), HttpStatus.ACCEPTED);
		} catch (WeatherParcialException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
				
	}

}
