"""
Definir una clase padre llamada Vehiculo y dos clases hijas llamadas Auto y Bicicleta,
las cuales heredan de la clase Padre Vehiculo.
La clase padre debe tener los siguientes atributos y métodos

Vehiculo (Clase Padre):
-Atributos (color, ruedas)
-Métodos ( __init__(color, ruedas) y __str__ )

Auto (Clase Hija de Vehículo) :
-Atributos ( velocidad (km/hr) )
-Métodos ( __init__(color, ruedas, velocidad) y __str__() )

Bicicleta  (Clase Hija de Vehículo) :
-Atributos ( tipo (urbana/montaña/etc.)
-Métodos ( __init__(color, ruedas, tipo) y __str__() )

Crear un objeto de cada clase.
"""


class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f'Vehiculo: [ Color: {self.color}, Ruedas: {str(self.ruedas)}]'


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return f'Auto: [ Velocidad (km/h): {str(self.velocidad)}] {super().__str__()}'


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return f'Bicileta: [ Tipo: {self.tipo}] {super().__str__()}'


# Creamos un objeto de la clase Vehiculo
vehiculo1 = Vehiculo("Negro", 4)
print(vehiculo1)

# Creamos un objeto de la clase hija Coche
auto1 = Auto("Rojo", 4, 180)
print(auto1)

# Creamos un objeto de la clase hija Bicicleta
bicicleta1 = Bicicleta("Azul", 2, "Montaña")
print(bicicleta1)
