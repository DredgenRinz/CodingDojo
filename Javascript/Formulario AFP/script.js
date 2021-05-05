function parseData() {
    let fecha = new Date();
    let age = fecha.getFullYear() - parseInt(document.getElementById('bYear').value);

    document.getElementById('texto').innerText = "Bienvenido " + document.getElementById('name').value + ", tu edad es " + age + " años.";
    document.getElementById('divData').style.display = 'block';
    console.log("Bienvenido " + document.getElementById('name').value + ", tu edad es " + age + " años.");
}