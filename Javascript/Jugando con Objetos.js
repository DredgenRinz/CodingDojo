var users = [{name: "Michael", age:37}, {name: "John", age:30}, {name: "David", age:27}];

function jugandoConDom(x){
	for(var i = 0; i < x.length; i++){
		if(x[i].name == "John"){
			console.log("Encontré a John!, tiene " + x[i].age + " años!.");
		}
		if(i == 0){
			console.log("El primer Personaje es: " + x[i].name);
		}
		console.log(x[i].name + " - " + x[i].age);
		if(x[i].age >= 18){
			console.log(x[i].name + " Es mayor de edad.");
		}
	}
}