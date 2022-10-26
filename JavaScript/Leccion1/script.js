/* En la Pagina del proyecto final es una Pagina de Running con  varios secciones 
-  links con los Teams de Running de la ciudad.
- selecion de rutinas de entrenamiento genericas segun la distancia elegida-
- consejos nutrionales
- CALCULADORA,  En el codigo siguiente hay algunos de los calculos que realizara la calculadora de running.
Ej:
-Ritmo segun la Distancia y el tiempo
-Estimacion de tiempo en una distancia elegida basandonos en una carrera realizada.
-Calculo de IMC Indice de masa corporal
- Zonas de Entrenamiento 

*/



//Programa Principal
let  nombre = prompt("Ingrese su Nombre ")
let edad = prompt("Ingrese su edad")
let sexo = prompt(" Ingrese F (Femenimno) o M (Masculino) ").toLowerCase() 
let pesoIng = Number(prompt("Ingrese su Peso "))
let alturaIng = Number(prompt(" Ingrese su Altura en Metros "))
let distanciaIng = Number(prompt(" Ingrese la distancia en Kms Recorrida")) 

alert( "Ingrese su tiempo en Horas/Minutos/Segundos" )
let horasIng = Number(prompt(" Ingrese las Hs "))
let minutosIng = Number(prompt(" Ingrese los  Minutos "))
let segundosIng = Number(prompt(" Ingrese los Segundos "))

let distanciaP = Number(prompt(" ¿Para que distancia quiere estimar su tiempo? (KMs) "))// diastancia a estimar tiempo

console.log("-----------IMC------------------")
console.log(nombre + ": Tu IMC es " + calculoImc(pesoIng , alturaIng))
alert( nombre + ": Tu indice de masa corporal es: "  + calculoImc(pesoIng , alturaIng)) 
console.log("-----------Ritmo------------------")
console.log(ritmo(horasIng, minutosIng, segundosIng, distanciaIng ))
console.log("---------------------------------")

console.log("-----------Prediccion de Carrera------")
console.log(predicciondeCarrera(horasIng, minutosIng, segundosIng, distanciaIng, distanciaP))
console.log("-------------------------------") 

let fcRep = Number(prompt("Ingrese su Frecuencia Cardiaca en  reposo"))
console.log("-------ZONAS DE ENTRENAMIENTO------------------")
if ( sexo= "m"){
    let fcMax = (208 - ( 0.7 * edad))
    for (i = 50; i <= 100; i+= 10){
        let fzona = ((fcMax - fcRep) * (i / 100)) + fcRep
        console.log("Zona "+ i + "%  Frec. Cardiaca = " + fzona.toFixed(2))
        console.log("-------------------------")
    }

}else if( sexo = f){
    let fcMax = (208 - ( 0.8 * edad))
    for (i = 50; i <= 100; i+= 10){
        let fzona = ((fcMax - fcRep) * (i / 100)) + fcRep
        console.log("Zona "+ i + "%  Frec. Cardiaca = " + fzona.toFixed(2))
        console.log("-------------------------")
    }
}
//Fin Programa Principal







//Calculo de IMC
 function calculoImc(peso, altura){
    let imc = peso / (altura **=2)
    imc = imc.toFixed(2)
    return imc
} 


// predicción de carrera
 function predicciondeCarrera(hora,minutos, segundos, distancia, distancia2 ) {
    let minutosH = hora * 60  // Pasaje  de Hora a Minutos
    let minutoS = segundos / 60  //Pasaje de Segundo a Minutos
    let tiempoM = minutos + minutosH + minutoS
    // se aplocan dos formulas dependiendo si la distancia a estimar es  < 21k o >21k
    if ( distancia2 <= 21 ){
        let tiempoEstimado = tiempoM * ((distancia2/distancia) ** 1.06)
        let tiempoEstimadoH = Math.floor(tiempoEstimado /60)
        let tiempoEstimadoM = Math.floor(tiempoEstimado % 60)
        let tiempoEstimadoS = Math.floor(((tiempoEstimado % 60) - tiempoEstimadoM) * 60)
          
        return "Tiempo Estimado en " + distancia2 + "Km  es "+ tiempoEstimadoH + ":" + tiempoEstimadoM + ":" +tiempoEstimadoS
    }else if( distancia2 > 21 ){
        let tiempoEstimado = tiempoM * ((distancia2/distancia) ** 1.06)// Formula de estimacion de tiempo de carrera
        let tiempoEstimadoH = Math.floor(tiempoEstimado /60)
        let tiempoEstimadoM = Math.floor(tiempoEstimado % 60)
        let tiempoEstimadoS = Math.floor(((tiempoEstimado % 60) - tiempoEstimadoM) * 60)
          
        return "Tiempo Estimado en " + distancia2 + "Km  es "+ tiempoEstimadoH + ":" + tiempoEstimadoM + ":" +tiempoEstimadoS
    }else{

        return "Distancia No Valida" 
    } 

}// fin prediccion de carrera */

 function ritmo(hora,minutos, segundos, distancia ){
    let minutosH = hora * 60  // Pasaje  de Hora a Minutos
    let minutoS = segundos / 60  //Pasaje de Segundo a Minutos
    let tiempoM = minutos + minutosH + minutoS
    let ritmoM = tiempoM / distancia
    let ritmoS =(ritmoM - Math.floor(ritmoM)) * 60
    return " Su Ritmo es : " + Math.floor(ritmoM) +":"+ Math.floor(ritmoS)
}


    
