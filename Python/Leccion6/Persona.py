# Clases y Objetos en Python

class Persona:  # Creamos una clase
    """def __init__():
        self.nombre = 'Juan'
        self.apellido = 'Salazar'
        self.edad = 22

persona1 = Persona()
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
"""

    # Creacion de Objetos con Argumentos
    # Los atributos de instancia se crean con una funcion:
    def __init__(self, nombre, apellido, edad, *args, **kwargs):  # metodo init double underscore o dunder
        self.nombre = nombre  # A esto se lo conoce como atributo publico
        self.apellido = apellido
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    # Metodos de Instancia:
    def mostrar_detalle(self):
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad},'
              f' la direccion es: {self.args}, los datos importantes son {self.kwargs}')


persona1 = Persona('Mita', 'Cervantes', 37)  # Enviamos los argumentos
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

persona1.mostrar_detalle()  # La referencia se pasa de manera automatica
# Persona.mostrar_detalle(persona1) #Debemos pasarle una referencia para el self o dara error
persona1.telefono = 4232704  # se puede agregar un atributo pero no lo comparte con otro objeto
print(f'Este es el telefono de : {persona1.nombre} {persona1.telefono}')  # Hemos creado un atributo de un objeto

print(type(Persona))

persona2 = Persona('Renata', 'Garcia', 30)
print(f'Objeto persona 2 : {persona2.nombre} {persona2.apellido} {persona2.edad}')
persona2.mostrar_detalle()
# print(persona2.telefono) el obejto persona2 no tiene este atributo, da error

# Modificar Atributos de un Objeto
persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40
print(f'Objeto persona 1 : {persona1.nombre} {persona1.apellido} {persona1.edad}')

# Los atributos son: características.
# Los métodos son: el comportamiento que van a tener los objetos (acciones).

persona3 = Persona('Rogelio', 'Romero', 22, 'Telefono', '44556677', 'Calle Lopez', 823, 'Manzana', 77, Altura=1.83,
                   Peso=105)
persona3.mostrar_detalle()

print()


class OtraPersona:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre  # A esto se lo conoce como atributo encapsulado (sugerencia al programador)
        self.__apellido = apellido  # para ser mas restrictivos se utiliza doble guion bajo
        self.edad = edad

    # Metodos de Instancia:
    def mostrar_detalle(self):
        print(f'La clase Persona1 tiene los siguientes datos: {self._nombre} {self.__apellido} {self.edad}')


persona4 = OtraPersona('Sergio', 'Gomez', 45)
persona4._nombre = 'Alvaro'  # el guion bajo indica no acceder a los atributos de esta manera sino solo dentro de la misma
# clase y mucho menos modificar el valor (pero si se puede modificar).
persona4.__apellido = 'Medina'  # doble guion bajo directamente no deja modificar el valor del atributo.
persona4.mostrar_detalle()
