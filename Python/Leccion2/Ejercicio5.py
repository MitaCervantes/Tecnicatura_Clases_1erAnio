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
