#Ejercicio 4: Área y longitud de un circulo
#Hacer un programa para ingresar el radio de un circulo y se reporte su área y
#la longitud de la circunferencia.
import math

radio = float(input("Digite el valor del radio: "))
area = math.pi * radio ** 2
longitud = 2 * math.pi * radio
print(f"El área de la circunferencia es: {area} y la longitud : {longitud }")