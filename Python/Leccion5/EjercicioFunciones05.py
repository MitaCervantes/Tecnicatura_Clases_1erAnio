# Ejercicio 05: Convertidor de Temperatura
# Realizar dos funciones para convertir de grados celsius a fahrenheit y viceversa.
# Investigar las formulas.

print()
# Funcion que convierte de celsius a fahrenheit
def celsius_fahrenheit(celsius):
    return (celsius * 9 / 5) + 32

# Utilizamos la funcion
celsius = float(input("Digite el valor de Celsius: "))
resultado = celsius_fahrenheit(celsius)
print(f"{celsius} C a F -> {resultado:0.2f}")


# Funcion que convierte de fahrenheit a celsius
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9

fahrenheit = float(input("Digite el valor de Fahrenheit: "))
resultado = fahrenheit_celsius(fahrenheit)
print(f"{fahrenheit} C a F -> {resultado:.2f}")
