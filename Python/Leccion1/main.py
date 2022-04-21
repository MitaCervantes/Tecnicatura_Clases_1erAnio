miVariable = 3
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
print("El resultado de la suma es: ", resultado)
