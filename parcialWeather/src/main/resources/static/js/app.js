var app = (function () {
  	

	var nameCity = "";
    getStatsByCity = function(){
	  nameCity = $("#city").val();
      apiclient.getWeatherByCityName(nameCity, mapObjetos);
      
    }
    
    var mapObjetos = function (listados){
	  
      $("#cuerpo").html("");
      $("#tabla > tbody").append(
        `<tr>
            <td>${listados.name}</td>
            <td>${listados.base}</td>
            <td>${listados.visibility}</td>
			<td>${listados.dt}</td>
			<td>${listados.timezone}</td>
                
                
        </tr>`
      );
	$("#cuerpo2").html("");
      $("#tabla2 > tbody").append(
        `<tr>
            <td>${listados.main.temp}</td>
            <td>${listados.main.feels_like}</td>
            <td>${listados.main.temp_min}</td>
			<td>${listados.main.temp_max}</td>
			<td>${listados.main.pressure}</td>
			<td>${listados.main.humidity}</td>                  
        </tr>`
      );
	$("#cuerpo3").html("");
      $("#tabla3 > tbody").append(
        `<tr>
            <td>${listados.sys.type}</td>
            <td>${listados.sys.id}</td>
            <td>${listados.sys.country}</td>
			<td>${listados.sys.sunrise}</td>
			<td>${listados.sys.sunset}</td>
			              
        </tr>`
      );
	
	$("#cuerpo4").html("");
      $("#tabla4 > tbody").append(
        `<tr>
            
            <td>${listados.weather[0].id}</td>
            <td>${listados.weather[0].main}</td>
			<td>${listados.weather[0].description}</td>
			<td>${listados.weather[0].icon}</td>
			              
        </tr>`
      );
	$("#cuerpo5").html("");
      $("#tabla5 > tbody").append(
        `<tr>
            <td>${listados.wind.speed}</td>
            <td>${listados.wind.deg}</td>
			<td>${listados.clouds.all}</td>			              
        </tr>`
      );
    $("#cuerpo6").html("");
      $("#tabla6 > tbody").append(
        `<tr>
            <td>${listados.coord.lon}</td>
            <td>${listados.coord.lat}</td>		              
        </tr>`
      );
    

    }

    
  return {
	
    getStatsByCity:getStatsByCity
	
  }
})();