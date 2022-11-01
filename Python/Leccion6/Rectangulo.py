"""
Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y  base,
el nombre del metodo deber ser calcular_area. Pero la base y la altura deben
ser ingresadas por el usuario y los objetos debern ser 3.
"""

class Rectangulo:
    def __init__(self,base,altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura

base = int(input("Proporcione la base: "))
altura = int(input("Proporcione la altura: "))

rectangulo1 = Rectangulo(base,altura)
print(f'Area retangulo: {rectangulo1.calcular_area()}')

base = int(input("Proporcione la base: "))
altura = int(input("Proporcione la altura: "))

rectangulo2 = Rectangulo(base,altura)
print(f'Area retangulo: {rectangulo2.calcular_area()}')

base = int(input("Proporcione la base: "))
altura = int(input("Proporcione la altura: "))

rectangulo3 = Rectangulo(base,altura)
print(f'Area retangulo: {rectangulo3.calcular_area()}')
