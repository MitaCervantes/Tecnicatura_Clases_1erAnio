"""miVariable = 3
print(miVariable)
miVariable = "a"
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
# Las literales se escriben x528, la variable y = x272, la variable z = x592
print(id(y))
print(id(z))

# Tipos: int, float, String, boolean
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola Alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavortio = "The Letter Black: "
caracteristicas = "The Best Rock band"
print("Mi grupo favorito es: ", miGrupoFavortio, caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos Booleanos (boole)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario.
# Función input
resultado = input("Digite un número: ")  # Regresa un dato tipo String
print(resultado)

# Conversión de la entrada de datos
numero1 = input("Escribe el primer número: ")
numero2 = input("Escribe el segundo número: ")
resultado = int(numero1) + int(numero2)
print("El resultado de la suma es: ", resultado)"""


"""operandoA = 8
operandoB = 5
suma = operandoA + operandoB
print("El resultado de la suma es:", suma)
print(f"El resultado de la suma es: {suma}")

resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es: {multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la division es: {division}")
division = operandoA // operandoB
print(f"El resultado de la divsion es: {division}")

modulo = operandoA % operandoB
print(f"El resultado del residuo es: {modulo}")

exponente = operandoA ** operandoB
print(f"El resultado de la exponenciacion es: {exponente}")"""

"""alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print(f"El resultado del area es: {area}")
print(f"El resultado del perimetro es: {perimetro}")"""

"""miVariable3 = 10
print(miVariable3)

# Operadores de Reasignación
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

miVariable3 -= 2
print(miVariable3)

miVariable3 *= 3
print(miVariable3)

miVariable3 /= 2
print(miVariable3)"""

# Operadores de comparación
"""d = 4
b = 2
resultado = d == b
print(resultado)

# Operador diferente
resultado = d != b
print(resultado)

# Operador Mayor que
resultado = d > b
print(resultado)

# Operador Menor que
resultado = d < b
print(resultado)

# Operador Mayor ó igual que
resultado = d >= b
print(resultado)

# Operador Menor ó igual que
resultado = d <= b
print(resultado)"""

"""num = int(input("Ingrese un número: "))
print(f"El residuo de la division es {num % 2}")
if num % 2 == 0:
    print(f"El número ingresado {num} es par")
else:
    print(f"El número ingresado {num} es impar")"""

"""edad = int(input("Ingrese su edad: "))
if edad >= 18:
    print(f"Su edad es {edad} años, eres mayor de edad.")
else:
    print(f"Su edad es {edad} años, eres menor de edad.")
"""
# Operadores Lógicos
"""a = True
b = False
resultado = a and b
print(resultado)

resultado = a or b
print(resultado)

resultado = not a
print(resultado)

# Ejercicio con el Operador and
valor = int(input("Ingrese un número: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"El número ingresado {valor} si se encuentra en el rango")
else:
    print(f"El número ingresado {valor} se encuentra fuera de rango")

# Ejercicio con el Operador or y Operador not
vacaciones = False
diaDescanso = False
if not (vacaciones or diaDescanso):
    print("Tiene trabajo que hacer")
else:
    print("Puede asistir al juego")

edad = int(input("Ingrese su edad: "))
if (20 <= edad <= 30) or (30 <= edad < 40):  # sintaxis simplificada de operador and
    print("Estas dentro del rango de los (20\'0) a (30\'0) años ")
else:
    print("No estas dentro del rango de los (20\'0) a (30\'0) años")

num1 = int(input("Digite el valor para el número 1: "))
num2 = int(input("Digite el valor para el número 2: "))
if num1 > num2:
    print(f"El número mayor es el primer ingresado: {num1}")
else:
    print(f"El número mayor es el segundo ingresado: {num2}")"""

print("Tienda de Libros")
print("Ingrese los siguientes datos del Libro:")
nombre = input("Digite el nombre del libro: ")
idLibro = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envio = input("Indicar si el envio es gratuito (True/False): ")
if envio == "True":
    envio = True
elif envio == "False":
    envio = False
else:
    envio = "El valor es incorrecto, dede ingresar True/False"
print(f'''
        Nombre: {nombre} 
        Id: {idLibro} 
        Precio: {precio} 
        Envio gratuito?: {envio} 
''')
