//Tipos de Datos en JavaScript

var nombre = "Mita"; //Tipo Str
console.log(typeof nombre)
nombre = 7;
console.log(typeof nombre)
nombre = 12.3;
console.log(typeof nombre)

var numero = 3000; //Tipo Numerico
console.log(numero)

var objecto = { //Tipo Object
    nombre : "Mita",
    apellido : "Cervantes",
    telefono : "3814232704"
}
console.log(typeof objecto);

//Tipo de dato boolean (true, false)
var bandera = false;
console.log(typeof bandera); 

//Tipo de dato function
function miFuncion(){}
console.log(typeof miFuncion); 

//Tipo de dato Symbol
var simbolo = Symbol("mi simbolo");
console.log(typeof simbolo); 

//Tipo clase es una function
class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona); 

//Tipo undefined, si es un tipo de dato
var x;
console.log(typeof x); 

x = undefined;
console.log(typeof x); 

//Tipo null = ausencia de valor
var y = null;//null no es un tipo de dato, pero su origen es object
console.log(typeof y); 

//Arreglo en JavaScript
var autos = ['Citroen','BMW','Audi','Ford'];
console.log(autos); 
console.log(typeof autos); 

//Cadena vacia (empty string)
var z = '';
console.log(z); 
console.log(typeof z); 




