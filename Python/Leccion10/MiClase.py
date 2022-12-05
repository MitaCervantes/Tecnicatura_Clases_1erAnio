class MiClase:
    # Variable de clase: este atributo dará a cada objeto el mismo valor
    variable_clase = 'Esta es una variable de clase'

    # Variable de instancia: tendrá un valor diferente en cada objeto (instancias de la clase)
    def __init__(self, variable_instancia):
        self.variable_instancia = variable_instancia

    @staticmethod
    def metodo_estatico():  # Método estático, se asocia a la clase
        print(MiClase.variable_clase)

    @classmethod
    def metodo_clase(cls):
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)

print(MiClase.variable_clase)
miClase = MiClase('Esta es una variable de instancia')
print(miClase.variable_instancia)
print(miClase.variable_clase)

MiClase.variable_clase2 = 'Valor variable clase 2'

miClase2 = MiClase('Esta es otra prueba de variable de instancia')
print(miClase2.variable_instancia)
print(miClase2.variable_clase)
print(MiClase.variable_clase2)
print(miClase.variable_clase2)
print(miClase2.variable_clase2)

MiClase.metodo_estatico()

MiClase.metodo_clase()
miObjeto1 = MiClase('variable de instancia')
miObjeto1.metodo_estatico()
miObjeto1.metodo_clase()
miObjeto1.metodo_instancia()