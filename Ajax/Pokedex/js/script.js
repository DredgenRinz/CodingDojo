$(document).ready(function(){
	$('#placeholder').html(function(){
		for(var i = 1; i <= 151; i++){
			$('#placeholder').append('<img id="'+i+'" src="http://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/'+i+'.png">');
		}
		getPoke(1);	
	});
			
	$('img').click(function(){
		getPoke($(this).attr('id'));
	
	});
					
	function getTypes(res){
		var poketypes = '';
		for (var i = 0; i < res.types.length; i++){
			poketypes += '<li>'+res.types[i].type.name+'</li>';
		}
		return poketypes;
	}
	
	function getPoke(id){
				$.get("https://pokeapi.co/api/v2/pokemon/"+id+"/", function(res) {
			$('#dex').html('<h1>'+res.name+'</h1><br><img src="http://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/'+res.id+'.png"><br><h4> Types </h4><br><ul>'+getTypes(res)+'</ul><br><h4>Height</h4><br><p>'+res.height+'</p><br><h4>Weight</h4><br><p>'+res.weight+'</p>');
		}, "json");	
	}
});