"""
Crear una clase llamada Cubo con los atributos alto, ancho y profunfidad,
con un metodo calcular_volumen que tendrá la fórmula:
volumen  ancho * altura * profundidad
y que el usuario ingrese los valores.
"""
class Cubo:
    def __init__(self, ancho, alto, profundo):
        self.ancho = ancho
        self.alto = alto
        self.profundo = profundo

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundo


ancho = int(input('Proporciona el ancho: '))
alto = int(input('Proporciona el alto: '))
profundo = int(input('Proprociona lo profundo: '))

cubo1 = Cubo(ancho, alto, profundo)
print(f'Volúmen cubo: {cubo1.calcular_volumen()}')