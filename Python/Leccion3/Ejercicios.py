# 1.Diseñar un programa que ingresando un año, nos devuelva por
# consola si es un año bisiesto o no, repetir la acción
# hasta que el usuario lo decida.

"""print('Programa para saber si un año es bisiesto: ')
anio = int(input('Ingrese el año: \n'))
if (anio % 4 == 0) & (anio % 100 != 0) or (anio % 400 == 0):
    print('El año es bisiesto')
else:
    print('El año no es bisiesto')


# 2.Calcular la suma de N primeros numeros
print('Ingrese la cantidad de números que desea sumar: ')
num = int(input())
suma = int(0)
for i in range(1, num):
    print(i)
    suma = suma + i
    print(f'La suma es: {suma}')

# 3.Leer 10 numeros e imprimir cuantos son positivos,
# cuantos negativos y cuantos neutros


conteo_positivo = int(0)
conteo_negativo = int(0)
conteo_neutro = int(0)

for i in range(0, 5):
    num = int(input('Ingrese un número: '))
    if num == 0:
        conteo_neutro = conteo_neutro + 1
    elif num > 0:
        conteo_positivo = conteo_positivo + 1
    else:
        conteo_neutro = conteo_negativo + 1

print(f'''
    Los numeros neutros son: {conteo_neutro},
    los positivos: {conteo_positivo} 
    y los negativos: {conteo_negativo}''')

# 4.Suponga que se tiene un conjunto de calificaciones de un grupo de 10 alumnos.
# Realizar un algoritmo para calcular la calificacion promedio y
# la calificacion mas baja de todo el grupo.

calificacionBaja = float(0)
calificacionPromedio = float(0)
suma = float(0)
i = int(0)
for i in range(1, 11):
    calificacion = float(input(f'{i} Ingrese su calificacion: '))
    if (calificacion < calificacionBaja):
        calificacionBaja = calificacion
    suma = suma + calificacion
calificacionPromedio = suma/10

print(f'La calificacion promedio es: {calificacionPromedio}')
print(f'La calificacion más baja es: {calificacionBaja}')

# 5.Calcular el factorial de un número mayor o igual a 0.

num = int(input("Escribir un numero: "))
factorial = 1

if num != 0:
    for i in range(1, num + 1):
        factorial = factorial * i
    print(f'El factorial de {num} es {factorial}')
else:
    print('Ingrese un número diferente a 0')


# 6.Ingresar "N" enteros, visualizar la suma de los numeros pares de la lista,
# cuantos numeros pares existen y cual es el promedio de los numeros impares.


suma_pares = int(0)
conteo_pares = int(0)
suma_impares = int(0)
conteo_impares = int(0)
promedio_impares = float(0)
i = 1

elementos = int(input("Digite la cantidad de elementos a ingresar: "))
while i <= elementos:
    num = int(input('Digite un número:  '))
    if num % 2 == 0:
        suma_pares = suma_pares + num
        conteo_pares = conteo_pares + 1
    else:
        suma_impares = suma_impares + num
        conteo_impares = conteo_impares + 1
    i = i + 1

if conteo_pares == 0:
    print('No se han digitado número pares')
else:
    print(f'La suma de los números pares es: {suma_pares}')
    print(f'El conteo de los números pares es: {conteo_pares}')

if conteo_impares == 0:
    print('No se han digitado números impares')
else:
    promedio_impares = suma_impares/conteo_impares
    print(f'El promedio de impares es: {promedio_impares}')



# 7.Dadas las horas trabajadas de 5 personas y la tarifa de pago,
# calcular el salario,y la sumatoria de todos los salarios.

i = 1
suma = 0

while i <= 5:
    print(f'Salario del empleado {i} :')
    horas = int(input('Ingrese las horas trabajadas: '))
    tarifa = int(input('Ingrese la tarifa por hora: '))
    salario = horas * tarifa
    suma = suma + salario
    print(f'El salario es: {salario}')

    i = i + 1

print(f'La suma de los salarios es: {suma}')"""

