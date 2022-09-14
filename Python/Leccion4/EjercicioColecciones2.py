# Ejercicio 2: Operaciones de conjuntos con listas
# Escriba un programa que tenga 2 listas y que a continuacion
# cree las siguientes listas:
# 1 Lista de palabras que aparecen en las listas (en las que no debe haber repeticion)
# 2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
# 3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 Lista de palabras que coinciden en ambas listas

lista1 = [2,3,4,5,6,7,8,9,10,7,7,8,4]
lista2 = [1,3,5,7,9,11,13,7]

conjunto1 = set(lista1)
conjunto2 = set(lista2)

union = list(conjunto1 | conjunto2) # Unimos los dos conjuntos
solo1 = list(conjunto1 - conjunto2) # Solo muestra el conjunto1
solo2 = list(conjunto2 - conjunto1) # Solo muestra el conjunto2
interseccion = list(conjunto1 & conjunto2) # Muestra ambas listas

print(f'Lista de palabras que aparecen en las listas:  {union}')
print(f'Lista de palabras que aparecen en la primera lista, pero no en la segunda:  {solo1}')
print(f'Lista de palabras que aparecen en la segunda lista, pero no en la primera:  {solo2}')
print(f'Lista de palabras que coinciden en ambas listas:  {interseccion}')
