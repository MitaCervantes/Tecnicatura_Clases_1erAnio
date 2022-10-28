# Ejercicio 03: Imprimir numeros de 5 a 1 de manera descendente usando funciones recursivas.
# Puede ser cualquier valor positivo, ejemplo, si pasamos el valor de 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
#Si se pasan valores negativos no imprime nada



def recursiva(numero):
    if numero >= 1: # Caso base
        print(numero)
        recursiva(numero - 1) # Caso recursivo
    elif numero == 0:
        return
    elif numero < 0:
        print('Valor ingresado incorrecto!')


recursiva(5)
recursiva(-2)
recursiva(0)