//Concatenation Cadenas
var nombre = 'Jose';
var apellido = ' Montes';

var nombreCompleto = nombre + ' ' + apellido;//Primera concatenacion
console.log(nombreCompleto); 

var nombreCompleto2 = 'Mita' + ' ' + 'Cervantes'; //Segunda concatenacion
console.log(nombreCompleto2); 

var juntos = nombre + 219;//Lee de izq a der siguiendo la cadena, lee el numero como str
console.log(juntos); 

juntos = nombre + (78 + 17);//Aqui al estar en parentesis hace la suma
console.log(juntos); 

juntos = nombre + 78 + 17;
console.log(juntos); 

juntos = 78 + 17 + nombre;
console.log(juntos); 

nombre += apellido;//Tercera concatenacion utilizando el operador simplificado
console.log(nombre)

//Hoy ya no se utiliza Var, se utiliza Let y Const 
let nombre2;
nombre2 = "Pedro";
console.log( nombre2 ); 

const apellido2 = "Lepes";
//apellido = "Perez"; Error no se puede cambiar el valor de una constante
console.log(apellido2)

//Asignaciones Valores Variables
let nombreCompleto = "Pedro Lepes";
console.log( nombreCompleto ); 

let x, y; //Se pueden crear varias variables en una sola linea
x = 10, y = 20; //Se pueden hacer asignacion de varias variables dentro de una sola linea
let z = x + y; //Se asigna el valor de la operacion 
console.log(z); 

let _1num = 31; //No utilizar numero para iniciar el nombre de una variable
let rompiendo = "rompe"; //No utilizar palabras reservadas para una variable
console.log(_1num);
console.log(rompiendo);