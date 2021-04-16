Tamaño Grande:
function big(x){
	for(var i = 0; i < x.length; i++){
		if(x[i] > 0){
			x[i] = 'Big';
		}
	}
	return x;	
}

Imprime (print) el menor, devuelve (return) el mayor:
function minmax(x){
	var min = x[0];
	var max = x[0];
	for(var i = 0; i < x.length; i++){
		if(x[i] > max){
			max = x[i];
		}
		if(x[i] < min){
			min = x[i];
		}
	}
	console.log(min);
	return max;
}

Imprime (print) uno, devuelve (return) otro:
function printreturn(x){
	console.log(x[x.length-2]);
	for(var i=0; i<x.length;i++){
		if(x[i] %2 !=0){
			return x[i];
		}
	}
}

Doble Visión:
function doble(x){
	for(var i=0; i<x.length; i++){
		x[i] += x[i];
	}
	return x;
}

Contar Positivos:
function positivos(x){
	var pos = 0;
	for(var i=0; i<x.length; i++){
		if(x[i] > 0){
			pos++;
		}
	}
	x[x.length-1]=pos;
	return x;
}

Pares e Impares:
function oddeven(x){
	var odd = 0;
	var even = 0;
	for(var i = 0; i < x.length; i++){
		if(x[i] % 2 == 0){
			even++;
		}
		if(x[i] % 2 != 0){
			odd++;
		}
		if(even == 3){
			console.log('¡Es para bien!');
			even = 0;
		}
		if(odd == 3){
			console.log('¡Qué imparcial!');
			odd = 0;
		}
	}
	return null;
}

Incrementa los Segundos:
function addodd(arr){
	for(var i = 0; i < arr.length; i++){
		if(i % 2 != 0){
			arr[i] += 1;
		}
	}
	for(var i = 0; i < arr.length; i++){
		console.log(arr[i]);
	}
	
	return arr;
}

Longitudes previas:
function longitudesPrevias(x){
	for(var i = x.length-1; i > 0; i--){
		x[i] = x[i-1].length;
	}
	return x;
}

Agrega Siete:
function agregaSiete(x){
	for(var i = 0; i < x.length; i++){
		x[i] += 7;
	}
	return x;
}

Array Inverso:
function invertir(x){
	var inv = x.length-1;
	var temp = 0;
	for(var i = 0; i < inv; i++){
		temp = x[inv];
		x[inv] = x[i];
		x[i] = temp;
		inv--;
	}
	return x;
}

Perspectiva: Negativa:
function negative(x){
	for(var i = 0; i < x.length; i++){	
		if(x[i] > 0){
			x[i] = 0 - x[i];
		}
	}
	return x;
}

Siempre hambriento:
function hambriento(x){
	var hambre = true;
	for(var i = 0; i < x.length; i++){
		if(x[i] == "comida"){
			console.log("Yummy");
			hambre = false;
		}
	}
	if(hambre){
		console.log("tengo hambre");
	}
	
}

Cambiar hacia el centro:
function cambiaHaciaElCentro(x){
	var cont = x.length-1;
	var temp = 0;
	for(var i = 0; i < x.length; i++){
      if(i>=cont){
        return x;
      }
      if(i % 2 == 0 || i==0){
		temp = x[cont];
		x[cont] = x[i];
		x[i] = temp;
      }
      cont--;
      
	}
	return x;
}

Escala el Array :
function escalaArray(x,y){
	for(var i = 0; i < x.length; i++){
		x[i] *= y;
	}
	return x;
}