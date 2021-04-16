Sigma:
function sigma(x){
	var sum = 0;
	for(var i = 1; i <= x; i++){
		sum+= i;
	}
	return sum;
}

Factorial:
function factorial(x){
	var fact = 1;
	for(var i = 1; i <= x; i++){
		fact*= i;
	}
	return fact;	
}

Fibonacci:
function fibonacci(x){
	var num1 = 0;
	var num2 = 1;
	var temp = 0;
	
	if(x == 0){
		return 0;
	}
	
	for(var i = 2; i < x; i++){
		temp = num1 + num2;
		num1 = num2;
		num2 = temp;
	}
	return num2;
}

Array: Penúltimo:
function penultimo(x){
	if(x.length < 1){
		return null;
	}
	return x[x.length-2];
}

Array: “N” último:
function nultimo(x,y){
	if(x.length < 4){
		return null;
	}
	return x[x.length-(1+y)];
}

Array: Segundo más grande:
function secondBig(x){
	if(x.length < 3){
		return null;
	}
	var big1 = 0;
	var big2 = 0;
	for(var i = 0; i < x.length; i++){
		if(x[i] > big1){
			big1 = x[i];
		}
		if(x[i] > big2 & x[i] < big1){
			big2 = x[i];
		}
	}
	return big2;
}

Doble Problema Par: 
function doubleTrouble(x){
	for(var i = 0; i < x.length; i++){
		if(i % 2 == 0){
			x.splice(i,0, x[i]);
		}
	}
	return x;	
}

Actividad:
Fibonacci Recursivo:
function fibonacci(x){
	var temp;
	if(x == 0){
		return 0;
	} else if (x == 1 | x == 2){
		return 1
	} else{
		temp = fibonacci(x-1) + fibonacci(x-2);
		return temp;
	}
}
