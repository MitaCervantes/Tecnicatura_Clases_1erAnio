# Juego adivina el numero
# Realizar un juego para adivinar un numero. Para ello se debe
# generar un numero aleatorio entre 1-100, y luego ir pidiendo
# numeros indicando "es mayor" o "es menor" segun sea mayor o menor
# con respecto a N. El proceso termina cuando el usuario acierta
# y alli se debe mostrar el numero de intentos.

import random
print("\t.:Juego adivina el numero:.")
aleatorio = random.randint(0, 100)  # Toma de 0 a 100 literal
conteo = 0

numero = int(input("Digite un numero: "))
while True:
    conteo += 1
    if numero > aleatorio:
        numero = int(input("\tDigite un numero menor: "))
    elif numero < aleatorio:
        numero = int(input("\tDigite un numero mayor: "))
    else:
        print(f"Felicidades!!! Has adivinado el numero {aleatorio}!")
        break # rompe el ciclo y el bucle
print(f'\nHas adivinado el numero en {conteo} intentos.')
