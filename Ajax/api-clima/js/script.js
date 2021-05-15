$(document).ready(function() {
    $('form').submit(function() {
        // your code here (build up your url)
		var city = $('input').val();
		var url = 'http://api.openweathermap.org/data/2.5/weather?q='+city+'&&appid=88308c1c8d1b8a174bf864ad38ed9b59';
        $.get(url, function(res) {
            // your code here
			console.log(res);
			$('#weather').html(
				'<div>' + res.name + ': ' + res.weather[0].main + '<br>Temperature: '+ (res.main.temp - 273.15).toFixed(2) + ' C°<br> Coord: '+ res.coord.lat.toFixed(2) + ',' + res.coord.lon.toFixed(2) +'</div>'		
			);
        }, 'json');
        // don't forget to return false so the page doesn't refresh
        return false;
    });
});