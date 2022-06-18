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