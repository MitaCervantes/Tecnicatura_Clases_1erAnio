//Ejercicio 1: Calcular estación del año
let mes = 9;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estación de: "+estacion);
//Ejercicio 2: Hora del día
/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good afternoom
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night
Trabajaremos con 24 horas
*/
let horaDia = 9;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good afternoom";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good evening";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good night";
}
else{
    mensaje = "Valor incorrecto";
}
console.log(mensaje);

//Estructura switch(la sintaxis es igual a Java)
switch(mes){ //No solo se pueden utilizar número, también cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("Bienvenido a la estación de: "+estacion);

//Evita repetir tu codigo ("DRY": don´t repeat yourself)
let meses = ["enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"]

function getMes(n){
    if(n < 1 || n > 12){
        throw new Error ("Out of range");
    }
    return meses[n-1];
}

console.log(getMes(6));

//Estructura switch puede ser cambiadad por function getDay()
let days = 7;
switch(days){ //No solo se pueden utilizar número, también cadenas
    case 1: 
        console.log("hoy es Lunes");
        break;
    case 2:
        console.log("hoy es Martes");
        break;
    case 3: 
        console.log("hoy es Miercoles");
        break;
    case 4: 
        console.log("hoy es Jueves");;
        break;
    case 5: 
        console.log("hoy es Viernes");;
        break;
    case 6: 
        console.log("hoy es Sabado");;
        break;
    case 7: 
        console.log("hoy es Domingo");;
        break;
    default:
        console.log("Error en el ingreso del dia de la semana!");
        break;
}

//Evita repetir tu codigo ("DRY": don´t repeat yourself)
let days2 = ["lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"]

function getDay(n){
    if(n < 1 || n > 7){
        throw new Error ("Out of range");
    }
    return days2[n-1];
}

console.log(getDay(5));