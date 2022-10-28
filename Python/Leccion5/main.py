# Comenzamos con funciones
# mi_funcion() # no se puede llamar antes de definir a una funcion
# Definimos una funcion

def mi_funcion():  # Para identificar a la funcion utlizamos parentesis
    print("Saludos a todos los estudiantes de la tecnicatura")


mi_funcion()  # Estamos llamando a la funcion
mi_funcion()  # Se puede llamar a la funcion N cantidad de veces
mi_funcion()


# Desempaquetado de listas o list Unpacking:

def show(name, lastName):
    print(name + ' ' + lastName)


person = ['Mita', 'Cervantes']
show(person[0], person[1])  # Pasamos uno por uno los datos de la lista a la funcion
show(*person)  # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ('Osvaldo', 'Giordanini')  # Desempaquetamos a traves de una lista
show(*person2)
person3 = {"lastName": "Legrand", "name": "Mirta"}
show(**person3)

numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(f'{n}')
    if n == 3:
        break  # esta es la unica manera para que no se ejecute el "else".
else:
    print("Esto se terminó.")

# List Comprehension, lista de comprension:
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == 'P']  # Esto regresa una neuva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Stella Artois", "country": "Belgium"}]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)


# Paso de Argumentos (funciones)

def mi_funcion2(name, lastName):
    print("Saludos a todos.")
    print(f'Nombre: {name}, Apellido: {lastName}')


mi_funcion2("Mita", "Cervantes")


# La palabra return en funciones
# Creamos una funcion para sumar
def sumar(a, b):
    return a + b


resultado = sumar(78, 22)
print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(8, 27)}')


# Valores por default en los parametros
def sumar2(a=0, b=0):
    return a + b


resultado = sumar2()
print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar2(81, 33)}')


# Argumentos Variables en funciones
def listarNombres(*nombres):  # Normalmente se utiliza *args
    for nombre in nombres:  # Se va a convertir en uan tupla
        print(nombre)


listarNombres("Mita", "Polli", "Gabi", "Chimbe")
listarNombres("Papi", "Frida", "Wendy", "Ceci", "Aron", "Gonza")


# Argumentos Variables con llave-valor:

def listarTerminos(**terminos): # Lo mas utilizado es **kwargs
    for llave, valor in terminos.items():
        print(f'{llave}: {valor}')

listarTerminos()
listarTerminos(IDE='Integrated Developement Environment', PK='Primary Key')
listarTerminos(Nombre="Lionel Messi")


# Distintos tipos de datos como argumentos

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)

nombres2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10)# Int no es un objeto iterable
desplegarNombres((10,11))# La convertimos a una tupla, con unsolo elemento no olvidar la coma
desplegarNombres([22, 55])# La convertimos a una lista

# Funciones Recursivas

# 5! = 5 * 4 * 3 * 2 * 1
# 5! = 5 * 4 * 3 * 2
# 5! = 5 * 4 * 6
# 5! = 5 * 24
# 5! = 120

def factorial(numero):
    if numero == 1: # Caso base
        return 1
    else:
        return numero * factorial(numero-1) # Caso recursivo

numero = 5
resultado = factorial(numero)
print(f'El factorial de {numero} es {resultado}')

