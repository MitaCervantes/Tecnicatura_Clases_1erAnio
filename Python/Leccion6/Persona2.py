class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property  # decorador
    def nombre(self):  # Metodo Getter
        print('Estamos utlizando el metodo Get.')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Metodo Setter
        print('Estamos utilizando el metodo Set.')
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')


if __name__ == '__main__':
    persona1 = Persona2('Mita', 'Cervantes', 37)
    print(persona1.nombre)  # Llamamos al metodo getter
    persona1.nombre = 'Gabita'  # Llamamos al metodo setter
    print(persona1.nombre)
    print(persona1.mostrar_detalles())
    # Atributo read-only seria el atributo que no tiene el metodo Set
    print(persona1.nombre)

    # Tarea crear 3 objetos mas, utilizando los metodos getter & setter
    # para modificar y mostrar los cambios

    print(__name__)
