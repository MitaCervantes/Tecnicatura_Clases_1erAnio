# Tabla de multiplicar
# Hacer un programa que pida un numero por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10. Por ejemplo:
# Si digita el 5 la listra tendra: 5,10,15,20,25,30,35,40,45,50.

numero = int(input("Digite un numero: "))
lista = [] # Creamos una lista vacia

for i in range(1,11):
    lista.append(i*numero)
    i += 1
print(f'\n La tabla de multiplicar del numero {numero}: \n {lista}')

for indice, i in enumerate(lista):
    print(f'\n{numero} x {indice + 1}= {i}')