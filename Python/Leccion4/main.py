# lista : Ariel. Liliana, Natalia, Osvaldo
# Colleciones en Python

# las listas es lo que se conoce en otros kenguajes como arreglos o vectores
nombres = ["Naty", "Osvaldo", "Lily", "Ariel"]

print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])

print(nombres)
print(nombres[0:2])  # Solo muestra el indice 0, 1 pero no el indice 2
# Ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3])  # indices a mostrar 0,1,2
# Desde el indice indicado hasta el final
print(nombres[1:])
# Modificamos un valor
nombres[2] = "Liliana"
nombres[0] = "Natalia"
print(nombres)
# Iterar una lista
for nombre in nombres:
    print(nombre)
else:
    print("Se acabaron los elementos de la lista")

# Preguntamos cuantos elementos tiene una lista
print(len(nombres))  # le pasamos como parametro la lista

# Agregamos un elemento
nombres.append("Marcelo")
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

# Insertar un elemento en un índice especifico
nombres.insert(1, "Alberto")
print(nombres)
nombres.insert(3, "Debora")
print(nombres)

# Eliminamos un elemento
nombres.remove("Alberto")

# Eliminar el ultimo elemento
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[2]  # del significa delete (eliminar)
print(nombres)

# Eliminar, borrar o limpiar la lista
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres
# print(nombres)

# Definimos una tupla
cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)
print(len(cocina))

# Acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])
# Mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:2])

# Ejemplo
verduras = "papa"  # una tupla necesita aunque sea de un elemento: la coma
# de lo contrario solo seria un tipo str cadena

# Recorremos los elementos de la tupla
for cocinar in cocina:  # print esta usando \n para saltos de linea
    print(cocinar, end=" ")  # usamos end= " " para eliminar los saltos de linea

# convertir tupla en lista y viceversa, pero es mala practica porque las tuplas son inmutables
cocinaLista = list(cocina)
cocinaLista[0] = "plato"
cocina = tuple(cocinaLista)
print('\n', cocina)

del cocina
# print(cocina)

# del cocina #esto es para eliminar una tupla

# Tipo Set
planetas = {'Marte', 'Jupiter', 'Venus'}
print(planetas)
print(len(planetas))  # Usamos la funcion len = length significa largo

# Revisar si un elemento existe dentro de set
print('Jupiter' in planetas)

# Agregar un elemento
planetas.add('Tierra')  # add es una funcion
print(planetas)

# Eliminar elementos
planetas.remove('Jupiter')  # Esta funcion ante un mal ingreso ú inexistencia del elemento da error
print(planetas)
planetas.discard('tierra')  # Esta funcion no nos presenta ningun error
print(planetas)

# Limpiar set o conjunto
planetas.clear()
print(planetas)

# Eliminar set o conjunto
# del planetas
print(planetas)  # al eliminar nos muestra fun error

# Un diccionario esta compuesto por dos elementos
# Una llave y un valor
# dic (key, value)

diccionario = {
    'IDE': 'Integrates Development Environment',
    'POO': 'Programacion Orientada a Objetos',
    'SABD': 'Sistema de Administracion de Base de Datos'
}
print(diccionario)

# Verificar la cantidad de elementos del diccionario
print(len(diccionario))

# Acceder a un diccionario con la llave (key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos elemetos
diccionario['IDE'] = 'Entorno de desarrollo integrado'
print(diccionario)

# Como recorrer los elementos
for termino in diccionario:  # Recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():  # Recorremos mostrando solo las llaves
    print(termino)  # Muestra solo las llaves

for valor in diccionario.values():
    print(valor)  # Usamos una funcion para acceder al valor

# Comprobar la existencia de algun elemento
print('IDE' in diccionario)  # devuelve un booleano

# Agregar un elemento
diccionario['PK'] = 'Primary key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario  # el diccionario se borró
# print(diccionario)

# Concatenamos listas
lista1 = [1, 2, 3, 1]
lista2 = [3, 4, 5, 1]
lista3 = lista1 + lista2  # Concatenamos
print(lista3)

# Funcion para agregar varios elementos a una lista
lista3.extend([6, 7, 8, 1])
print(lista3)

# Funcion para ubicar en que indice esta el valor ingresado
print(lista3.index(4))
# print(lista3.index(0)) # esto daria un error por no ser el elemento parte de la lista

# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1))

# Para poner al reves una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiedo sus elementos
lista3 = lista3 * 2
print(lista3)

# Metodos de ordenamiento, en Python es una funcion
lista3.sort()  # Ordena los elementos ascendentemente
print(lista3)
lista3.sort(reverse=True)  # Ordena los elementos descendentemente
print(lista3)

# Repaso de Tuplas
tupla = (4, 'Hola', 6.78, [1, 2, 78], 4, 'Hola')  # Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla)  # respuesta de tipo booleana
# Lo que podemoms usar dentro de tupla son index, count, len
# Se puede convertir de tupla a lista y viceversa

# Repaso de set o conjunto
# para definir un conjunto
conjunto = set()
conjunto1 = {'bye'}
conjunto.add(7)
conjunto.add('hola')
print(conjunto)
conjunto1.add('Hola')
print(conjunto1)
print(3 not in conjunto1)  # Preguntamos si el numero 3 no esta en el conjunto.

# demostrar igualdad entre dos conjuntos
print(conjunto == conjunto1)  # nos devuelve un booleano

#  Operaciones en conjuntos
conjunto3 = conjunto | conjunto1  # la linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto & conjunto1  # qque elemento tienen en comun
print(conjunto3)

conjunto3 = conjunto - conjunto1  # asigna el valor que esta en el conjunto y no en el conjunto1
print(conjunto3)
conjunto3 = conjunto1 - conjunto
print(conjunto3)

conjunto3 = conjunto ^ conjunto1  # elementos que no comparten o que son diferentes
print(conjunto3)

conjunto3 = conjunto | conjunto1
print(conjunto1.issubset(conjunto3))
print(conjunto.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))

print(conjunto3.issuperset(conjunto))
print(conjunto3.issuperset(conjunto1))
print(conjunto1.issuperset(conjunto3))

# Como saber si dos conjuntos son disconexos, esto es si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto))  # no hay cosas en comun

# Convertir un conjjunto totalmente en inmutable
conjunto1 = frozenset
# No se puede agregar, modificar ni eliminar elementos del conjunto

# Repaso diccionarios
diccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo': 'Yellow'}
print(diccionarioNuevo)

# Como eliminar
del (diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Los diccionarios puedem almacenar diferents tipos de datos. {
diccionario2 = {'Ariel': {'Edad': 40, 'Altura': 1.83}, 'Osvaldo': [45, 1.85], 'Natalia': [35, 1.67]}
print(diccionario2)

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 millones', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 millones',
         'Posicion': 'Extremo Derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 millones',
         'Posicion': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 millones', 'Posicion': 'Portero'}
}

for llave, valor in seleccionArgentina.items():
    print(llave, valor)
    # Como tarea: agregar por lo menos 4 jugadores mas a seleccionArgentina
print(len(seleccionArgentina))

seleccionArgentina['18'] = {'Nombre': 'Rodrigo De Paul', 'Edad': 28, 'Altura': 1.80, 'Precio': '40 millones',
                            'Posicion': 'Centrocampista'}
seleccionArgentina['15'] = {'Nombre': 'Julian Alvarez', 'Edad': 22, 'Altura': 1.73, 'Precio': '40 millones',
                            'Posicion': 'Delantero'}
seleccionArgentina['6'] = {'Nombre': 'Leandro Paredes', 'Edad': 28, 'Altura': 1.80, 'Precio': '25 millones',
                           'Posicion': 'Defensor'}
seleccionArgentina['2'] = {'Nombre': 'Cuti Romero', 'Edad': 24, 'Altura': 1.88, 'Precio': '30 millones',
                           'Posicion': 'Defensor'}

print('Tenemos cargados en el diccionario la cantidad de jugadores: ', end=' ')
print(len(seleccionArgentina))
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

# Pilas usando listas
pila = [1, 2, 3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos desde el final
elementoBorrado = pila.pop()  # Quita el ultimo elemento y lo guarda en una variable
print(f'Sacamos el elemento {elementoBorrado}')
print(f'La pila ahora quedo asi {pila}')

# Colas con lista
# Estructuras de datos de tipo fifo (first input/first output)
cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

# Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('Jose')
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido el cliente {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente {seRetira}')
print(cola)

