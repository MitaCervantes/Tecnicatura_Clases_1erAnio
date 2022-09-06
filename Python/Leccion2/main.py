# Sentencia if/else
"""
condicion = False
if condicion == True:
    print("Condición Verdadera.")
elif condicion == False:
    print("Condición Falsa.")
else:
    print("Condición sin especificar")

num = int(input("Digite un número del 1 al 3:"))
numTexto = ''
if num == 1:
    numTexto = "Número 1"
elif num == 2:
    numTexto = "Número 2"
elif num == 3:
    numTexto = "Número 3"
else:
    numTexto= " Has ingresado un número fuera de rango"
print(f"El numero ingresado es: {num} - {numTexto} ")"""

condicion = False
print("Condicion verdadera") if condicion else print("Condicion Falsa")
