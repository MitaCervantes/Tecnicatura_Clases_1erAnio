# No repetir caracteres
# Hacer un programa que pida una cadena por teclado, luego
# meter los caracteres en una lista sin repetir caracteres.


lista = []
cadena = input("Digite una frase: ")

for i in cadena:
   if i not in lista: # Si el caracter aun no esta en la lista
       lista.append(i) # Lo agregamos a la lista
print(f'\nLista de caracteres sin repetir ninguno : \n{lista}')

