# Ejercicio 5: factorial de un numero positivo
# Hacer un programa para calcular el factorial de un numero positivo

num = int(input("Digite un numero para calcular el factorial: "))
while num < 0 :
    print("Error -> El numero tiene que ser positivo")
    num = int(input("Digite otro numero: "))

factorial = 1 # la variable para calcular el factorial

for i in range (1, num + 1):
    factorial *= i
print(f"\nEl factorial del numero {num} positivo ingresado es {factorial}")
