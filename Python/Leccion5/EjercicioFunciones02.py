# Ejercicio 02: Crear una función para multiplicar los valores recibidos de tipo numérico,
# utilizando argumentos variables *args como parámetro de la función
# y regresar como resultado la multiplicación de todos los valores pasados como argumentos.



def multiplicar_valor(*numeros):
    resultado = 1
    for valor in numeros:
        resultado *= valor
    return resultado


print(multiplicar_valor(3, 2, 4))
