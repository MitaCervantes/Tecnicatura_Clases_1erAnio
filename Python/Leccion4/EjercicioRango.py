# Ejercicio 1 : iterar un rango de 0 a 10 e imprimir numeros divisibles entre 3
# Ejemplo de ejecucion : 0,3,6,9
import math

for i in range(11):
    if i % 3 == 0:
        print(i, end=" ")

print("\n")
# Ejercicio 2: crear un rango de numeros de 2 a 6, e imprimelos
# Ejemplo de ejecucion :2,3,4,5,6

for i in range(2, 7):
    print(i, end=" ")

print("\n")
# Ejercicio 3: crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1.
# Ejemplo de ejecucion :3,5,7,9

for i in range(3, 11, 2):
    print(i, end=" ")

print("\n")


# Dada la siguiente tupla:
tupla = (13, 1, 8, 3, 2, 5, 8)
# Crear una lista que solo incluya los numeros menores a 5
# e imprima por consola [1, 3, 2]


# filtramos los numeros menores a 5
lista = []
for num in tupla:
    if(num < 5):
        lista.append(num)
print(lista)

# Matematicas
# Para sacar la raiz cuadrada de un numero positivo
numero = int(input("Digite un numero positivo: "))
while(numero < 0):
    print('Error -> Deberia ser un numero positivo')
    numero = int(input("Digite un numero positivo: "))
print(f'\nSu raiz cuadrada es: {math.sqrt(numero):.2f}')
