var apiclient = (function () {
	
    let url = "/weather/"

    return {
        getWeatherByCityName: function (city,callback) {
            $.getJSON(url+city,(data)=>{
                callback(data);
            },null)
        }
        
    }

})();