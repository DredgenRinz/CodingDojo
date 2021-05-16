$(document).ready(function(){
			
	$('img').click(function(){
		getInfo($(this).attr('id'));
	});
					
	function getTitles(res){
		var titles = '';
		for (var i = 0; i < res.titles.length; i++){
			titles += ' '+res.titles[i]+',';
		}
		return titles;
	}
	
	function getInfo(id){
				$.get("https://www.anapioficeandfire.com/api/houses/"+id+"/", function(res) {
			$('#dex').html('<h1 class="houseN"><span id="house">House Details</span></h1><p><span class="bold">Name: </span>'+res.name+'</p><h4>Words: </h4><p>'+res.coatOfArms+'</p><h4>Titles:</h4><p>'+getTitles(res)+'</p>');
		}, "json");	
	}
});