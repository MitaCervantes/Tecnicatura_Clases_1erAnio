# Ejercicio 01: crear una funcion para sumar los valores recibidos de tipo
# numericos, utilizando argumentos variables *args como parametro de la
# funcion y agregar como resultado la suma de todos los valores pasados
# como argumentos.

def sumar_valor(*args):  # recibimos una cantidad de argumentos indefinidos
    resultado = 0
    # Iteramos cada elemento
    for valor in args:
        resultado += valor
    return resultado


# Llamamos a la funcion
print(sumar_valor(3, 5, 9))

# //////////////////////////////////////////////////////////////////////////



