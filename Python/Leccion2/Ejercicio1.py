# import math
"""
# Ejercicio 1: Escribir la siguiente expresión en forma de expresión
algoritmica.

a = float(input("Digite el valor de a: "))
b = float(input("Digite el valor de b: "))
c = float(input("Digite el valor de c: "))
resultado = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
input(f"El resultado es: {resultado}")
"""

"""
# Ejercicio 2: Determinar la solución lógica de la siguiente expresión.

a = float(input("Digite el valor de a: "))
b = float(input("Digite el valor de b: "))
resultado = ((3 + 5 * 8) < 3 and ((- 6/3 * 4) + 2 < 2)) or (a > b)
print(f"El resultado es: {resultado}")
"""

"""
# Ejercicio 3: Intercambiar el valor de dos variables.

a = int(input("Digite un valor para a: "))
b = int(input("Digite un valor para b: "))

a ^= b
b ^= a
a ^= b

valor = a
a = b
b = valor

print(f"El nuevo valor de a es: {a} y el nuevo valor de b es: {b}")
"""

"""
#Ejercicio 4: Área y longitud de un circulo
#Hacer un programa para ingresar el radio de un circulo y se reporte su área y 
#la longitud de la circunferencia.


radio = float(input("Digite el valor del radio: "))
area = math.pi * radio ** 2
longitud = 2 * math.pi * radio
print(f"El área de la circunferencia es: {area} y la longitud : {longitud }")
"""

# Clase 7 Ejercicio 3: pedir al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12,
# luego le decimos en que estacion del año esta.
"""
estacion = None
mes = int(input("Digite el mes del año (1-12) que desea saber la estación: "))
if mes == 12 or mes == 1 or mes == 2:
    estacion = "Verano"
elif mes == 3 or mes == 4 or mes == 5:
    estacion = "Otoño"
elif mes == 6 or mes == 7 or mes == 8:
    estacion = "Invierno"
elif mes == 9 or mes == 10 or mes == 11:
    estacion = "Primavera"
else:
    estacion = "Ese número no corresponde a um mes de año"
print(f"El mes {mes} corresponde a la estacion {estacion}")
"""
# Clase 7 Ejercicio 4: hacer un programa que cuando el usuario ingrese su edad imprima la etapa
# de su vida en una breve oracion
"""
etapa = None
edad = int(input("Ingrese su edad para decir le etapa de la vida en la que está: "))
if 0 <= edad <= 10:
    etapa = "La infancia es increible y bella..."
elif 11 <= edad <= 20:
    etapa = "Tienes muchos cambios, mucho que estudiar..."
elif 21 <= edad <= 30:
    etapa = "Amor y comienza el trabajo..."
elif 31 <= edad <= 40:
    etapa = "La vida es una lucha que es dura y mucha..."
elif 41 <= edad <= 50:
    etapa = "Nunca eres demasiado viejo para cambiar de trabajo..."
elif 51 <= edad <= 60:
    etapa = "Ya no puedes escapar a ser abuelo..."
elif 61 <= edad <= 70:
    etapa = "La etapa de disfrutar y descansar..."
elif 71 <= edad <= 80:
    etapa = "Necesitas los cuidados de cuando eras niño..."
elif 81 <= edad <= 90:
    etapa = "El cielo te espera con los brazos abiertos..."
else:
    etapa = "Rando de edad no existente."
print(f"Tu edad es {edad}, {etapa}")
"""
# Clase 7 Ejercicio 5: pedir al usuario que ingrese un numero del 1 al 10 y segun eso mostramos las
# calificaciones
"""
nota = int(input("Ingrese un numero de calificación del 1 al 10: "))
if 9 <= nota <= 10:
    print("A")
elif 8 <= nota <= 9:
    print("B")
elif 7 <= nota <= 8:
    print("C")
elif 6 <= nota <= 7:
    print("D")
elif 0 <= nota <= 6:
    print("F")
else:
    print("Valor incorrecto!")
"""