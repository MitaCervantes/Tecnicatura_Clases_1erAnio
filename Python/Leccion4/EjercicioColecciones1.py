# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a continuacion
# elimine los elementos repetidos, por ultimo mostrar la lista.

# Creamos una lista:
lista = ["pupy", "aron", "wendy", "frida", "leia", "aron", "frida"]
listaSet = set(lista) # Convertimos la lista a un conjunto de tipo set
lista = list(listaSet) # Convertimos el conjunto a una lista
lista = list(set(lista)) # La conversion hecha en una sola linea de codigo
# print(listaSet)



