Obtén del 1 al 255
function allnumbers(){
	var x = [];
	for(var i=0; i < 256; i++){
		x.push(i);
	}
	return x;
}

Consigue pares hasta 1000: 
function evenTo(){
	var sum = 0;
	for(var i = 0; i < 1001; i++){
		if( i % 2 == 0){
			sum+=i;
		}
	}
	return sum;
}

Suma impares hasta 5000: 
function oddTo(){
	var sum = 0;
	for(var i = 0; i < 5001; i++){
		if( i % 2 != 0){
			sum+=i;
		}
	}
	return sum;
}

Itera un array:
function iterarArray(x){
	var sum = 0;
	for(var i=0; i<x.length; i++){
		sum += x[i];
	}
	return sum;
}

Encuentra el mayor (max):
function maxInArray(x){
	var max = 0;
	for(var i=0; i<x.length; i++){
		if(max < x[i]){
			max = x[i];
		}
	}
	return max;
}

Encuentra el promedio (avg):
function avgArray(x){
	var avg = 0;
	for(var i=0; i<x.length; i++){
		avg += x[i];
	}
	avg /= x.length;
	return max;
}

Array de impares:
function oddArray(){
	var odd = [];
	for(var i = 1; i <= 50; i++){
		if( i % 2 != 0){
			odd.push(i);
		}
	}
	return sum;
}

Mayor que Y: 
function biggerThanY(x,y){
	var big = [];
	for(var i = 1; i <= 50; i++){
		if( x[i] > y){
			big.push(x[i]);
		}
	}
	return big;
}

Cuadrados: 
function squareof(x){
	for(var i = 0; i < x.length; i++){
		x[i] *= x[i];
	}
	return x;
}

Negativos: 
function negatives(x){
	for(var i = 0; i < x.length; i++){
		if(x[i] < 0){
			x[i] = 0;
		}
	}
	return x;
}

Max/Min/Avg:
function maxminavg(x){
	var max = 0;
	var min = 0;
	var avg = 0;
	for(var i = 0; i < x.length; i++){
		if(x[i] > max){
			max = x[i];
		}
		if(x[i] < min){
			min = x[i];
		}
		avg += x[i];
	}
	avg /= x.length;
	var z = [max,min,avg];
	return z;
}

Intercambia Valores: 
function switchvalues(x){
	var z = [];
	for(var i = 0; i < x.length; i++){
		var first = x[0];
		var last = x[x.length-1];
		if(i==x.length-1){
			z.push(first);
		}else if(i==0){
			z.push(last);
		}else {
			z.push(x[i]);
		}
	}
	return z;
}

De Número a String: 
function numToString(x){
	for(var i = 0; i<x.length; i++){
		if(x[i]<0){
			x[i] = 'Dojo';
		}
	}
	return x;
}